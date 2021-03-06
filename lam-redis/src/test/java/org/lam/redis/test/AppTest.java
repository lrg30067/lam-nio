package org.lam.redis.test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.lam.redis.client.RedisClient;
import org.lam.redis.client.SentinelRedisClient;
import org.lam.redis.client.SentinelRedisReadClient;
import org.lam.redis.model.SNode;

import redis.clients.jedis.Jedis;

/**
* <p>
* App Test class
* </p>
* @author linanmiao
* @date 2017年1月12日
* @version 1.0
*/
public class AppTest {
	
	//@Test
	public void slaveRedis(){
		Jedis slave = new Jedis("192.168.204.127", 6378);
		String reply = slave.info("replication");
		System.out.println(reply);
		String[] replyArray = reply.split("\n");
		for(int idx = 0; idx < replyArray.length; idx++){
			if(replyArray[idx].indexOf(':') != -1){
			System.out.print(idx + ")" + 
			SNode.parse(replyArray[idx].replace("\r", ""), ':'));
			}
		}
		slave.close();
	}
	
	@Test
	public void redisReadClient(){
		SentinelRedisReadClient client = new SentinelRedisReadClient();
		while(true){
			Jedis jedis = client.getResource();
			try{
		Set<String> ks = jedis.keys("*");
		for(String k : ks){
			System.out.println(k);
		}
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				client.close(jedis);				
			}
			sleepMillseconds(1200);
		}
		//client.close();
	}
	
	public static void main(String[] args){
		RedisClient client = new RedisClient("192.168.204.127", 6378, null);
		Jedis jedis = client.getResource();
		boolean exist = jedis.exists("myke");
		System.out.println(exist);
		client.close(jedis);
		sleepMillseconds(3000);
		client.close();
	}
	
	private static void sleepMillseconds(long timeout){
		try {
			TimeUnit.MILLISECONDS.sleep(timeout);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
