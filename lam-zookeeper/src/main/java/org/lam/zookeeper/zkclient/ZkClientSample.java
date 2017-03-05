package org.lam.zookeeper.zkclient;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.I0Itec.zkclient.IZkChildListener;
import org.I0Itec.zkclient.IZkDataListener;
import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.ZkConnection;
import org.I0Itec.zkclient.exception.ZkMarshallingError;
import org.I0Itec.zkclient.serialize.SerializableSerializer;
import org.I0Itec.zkclient.serialize.ZkSerializer;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.data.Stat;

import com.google.gson.Gson;

/**
* <p>
* TODO
* </p>
* @author linanmiao
* @date 2017年3月5日
* @versio 1.0
*/
public class ZkClientSample {
	
	static Gson gson = new Gson();
	
	public static void main(String[] args) {
		int connectionTimeOut = Integer.MAX_VALUE;//time out for connecting to server
		ZkClient zkClient = new ZkClient(buildDefaultZkConnection(), connectionTimeOut, buildDefaultZkSerializer());
	
		String path = "/test";
		String rootPath = "/";
		
		//subscribe for node children list change
		zkClient.subscribeChildChanges(rootPath, new IZkChildListener(){
			@Override
			public void handleChildChange(String parentPath, List<String> currentChilds) throws Exception {
				lam.log.Console.println("%s child changed, child list:%s", parentPath, currentChilds);
			}
		});
		
		LamZkData data = new LamZkData();
		data.setServiceIp("192.168.20.100");
		data.setServiceName("user-service");
		data.setWeight(2);
		
		//create node
		String reply = zkClient.create(path, data, CreateMode.EPHEMERAL);
		
		//subscribe for node data change
		zkClient.subscribeDataChanges(path, new IZkDataListener(){

			@Override
			public void handleDataChange(String dataPath, Object data) throws Exception {
				lam.log.Console.println("path:%s, data changed:%s", dataPath, gson.toJson(data));
			}

			@Override
			public void handleDataDeleted(String dataPath) throws Exception {
				lam.log.Console.println("path:%s, data deleted", dataPath);
			}});
		
		//read/get data from node
		boolean returnNullIfPathNotExists = true;
		LamZkData d = zkClient.readData(path, returnNullIfPathNotExists);
		lam.log.Console.println("path:%s, data:%s", path, gson.toJson(d));
		
		//get children list of node
		List<String> children = zkClient.getChildren(rootPath);
		lam.log.Console.println("path:%s, children list:%s", path, children);

		//write node data
		data.setWeight(3);
		zkClient.writeData(path, data);
		
		//delete node
		zkClient.delete(path);
		
		//权限控制=====================================
		
		//schema:权限控制模式(world,auth,digest,ip)
		//auth:foo:true，类似:username:password
		zkClient.addAuthInfo("digest", "foo:true".getBytes());
		
		

		waitSelf();
	}
	
	private static void waitSelf(){
		try {
			synchronized (ZkClientSample.class) {				
				ZkClientSample.class.wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private static void sleep(long timeOut){
		try {
			TimeUnit.MILLISECONDS.sleep(timeOut);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ZkConnection 实现 IZkConnection接口<br/>
	 * IZkConnection接口定义了客户端 对zookeeper服务器的一系列操作，如:<br/>
	 * 连接，断开，创建/删除节点，往节点写/删数据，获取子节点列表等
	 */
	private static ZkConnection buildDefaultZkConnection(){
		String zkServers = "192.168.20.111:2181";
		int sessionTimeOut = 30000;//half of a minute;
		ZkConnection zkConnection = new ZkConnection(zkServers, sessionTimeOut);
		return zkConnection;
	}
	
	/**
	 * ZkSerializer 定义 的客户端 发送数据给 服务器时，对发送的数据进行序列化，接收数据时反序列化
	 * SerializableSerializer 是 ZkSerializer接口的实现类，序列化策略是JDK自带的序列化
	 */
	private static ZkSerializer buildDefaultZkSerializer(){
		SerializableSerializer zkSerializer = new SerializableSerializer();
		return zkSerializer;
	}
	
	private static ZkSerializer buildJsonZkSerializer(){
		ZkSerializer zkSerializer = new ZkSerializer() {
			static final String DEFAULT_CHARSET_NAME = "utf-8";
			Class<?> classType = LamZkData.class;
			Gson gson = new Gson();
			@Override
			public byte[] serialize(Object data) throws ZkMarshallingError {
				String obj = gson.toJson(data, classType);
				try {
					return obj.getBytes(DEFAULT_CHARSET_NAME);
				} catch (UnsupportedEncodingException e) {
					return null;
				}
			}
			
			@Override
			public Object deserialize(byte[] bytes) throws ZkMarshallingError {
				try {
					String obj = new String(bytes, DEFAULT_CHARSET_NAME);
					return gson.fromJson(obj, classType);
				} catch (UnsupportedEncodingException e) {
					return null;
				}
			}
		};
		return zkSerializer;
	}

}
