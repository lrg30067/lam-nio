package lam.mq.consumer.util;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.I0Itec.zkclient.IZkChildListener;
import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.ZkConnection;
import org.I0Itec.zkclient.exception.ZkMarshallingError;
import org.I0Itec.zkclient.exception.ZkNodeExistsException;
import org.I0Itec.zkclient.serialize.ZkSerializer;
import org.apache.zookeeper.CreateMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lam.util.Strings;

/**
* <p>
* TODO
* </p>
* @author linanmiao
* @date 2017年8月22日
* @version 1.0
*/
public class ZkHolder {
	
	private static Logger logger = LoggerFactory.getLogger(ZkHolder.class);
	
	private static volatile ZkHolder INSTANCE;
	
	private ZkClient zkClient;
	
	private ZkHolder(){
		zkClient = new ZkClient(buildDefaultZkConnection(), Integer.MAX_VALUE, buildDefaultZkSerializer());
	}
	
	public static ZkHolder getInstance(){
		if(INSTANCE == null){
			synchronized (ZkHolder.class) {
				if(INSTANCE == null){
					INSTANCE = new ZkHolder();
				}
			}
		}
		return INSTANCE;
	}
	
	public ZkClient getZkClient(){
		return zkClient;
	}
	
	private ZkConnection buildDefaultZkConnection(){
		String zkServers = "192.168.204.79:2181";
		int sessionTimeOut = 30000;
		ZkConnection zkConnection = new ZkConnection(zkServers, sessionTimeOut);
		return zkConnection;
	}
	
	private ZkSerializer buildDefaultZkSerializer(){
		ZkSerializer zkSerializer = new ZkSerializer() {
			String charsetName = "utf-8";
			@Override
			public byte[] serialize(Object data) throws ZkMarshallingError {
				try {
					return ((String)data).getBytes(charsetName);
				} catch (UnsupportedEncodingException e) {
					logger.error("un support encoding " + charsetName, e);
					return null;
				}
			}
			
			@Override
			public Object deserialize(byte[] bytes) throws ZkMarshallingError {
				try {
					return new String(bytes, charsetName);
				} catch (UnsupportedEncodingException e) {
					logger.error("un support encoding " + charsetName, e);
					return null;
				}
			}
		};
		return zkSerializer;
	}

}
