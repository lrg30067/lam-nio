import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

import lam.log.Console;
import lam.pool.SSocket;
import lam.pool.SSocketFactory;
import lam.pool.SSocketPool;
import lam.util.FinalizeUtils;

/**
* <p>
* TODO
* </p>
* @author linanmiao
* @date 2017年3月22日
* @version 1.0
*/
public class SSocketPoolTest {
	
	public static void main(String[] args) {
		GenericObjectPoolConfig config = new GenericObjectPoolConfig();
		config.setMaxTotal(8);
		config.setMaxIdle(0);
		config.setMaxWaitMillis(30000);
		config.setBlockWhenExhausted(false);
		SSocketFactory ssocketFactory = new SSocketFactory("192.168.204.127", 6378);
		SSocketPool ssocketPool = new SSocketPool(config, ssocketFactory);
		
		long start = System.currentTimeMillis();
		
		for(int i = 0; i < 1000; i++){
			SSocket ssocket = null;
			try{
				ssocket = ssocketPool.getResource();
				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(ssocket.getOutputStream()));
				writer.write("get key" + 0 + "\r\n");
				writer.flush();
				BufferedReader reader = new BufferedReader(new InputStreamReader(ssocket.getInputStream()));
				int buf = -1;
				char[] cbuf = new char[2048];
				while((buf = reader.read(cbuf, 0, cbuf.length)) != -1){
					String s = new String(cbuf, 0, buf);
					System.out.print(s);
					if(s.endsWith("\r\n")){
						break ;
					}
				}
				FinalizeUtils.closeQuietly(reader);
				FinalizeUtils.closeQuietly(writer);
				ssocketPool.returnResource(ssocket);
			}catch(Exception e){
				e.printStackTrace();
				ssocketPool.returnBrokenResource(ssocket);
			}
		}
		
		Console.println("cost(ms):" + (System.currentTimeMillis() - start));
		ssocketPool.close();
	}

}