package demo1;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class Main2 {
	
	private static final String IP = "10.10.18.45";
	private static final Integer PORT = 6379;
	
	public static void main(String[] args) {
		// 池基本配置
		JedisPoolConfig config = new JedisPoolConfig();
		config.setMaxTotal(20);
		config.setMaxIdle(5);
		config.setMaxWaitMillis(10001);
		config.setTestOnBorrow(false);

		JedisPool jedisPool = new JedisPool(config, IP, PORT);
		Jedis jedis = jedisPool.getResource();
		if(jedis != null) {
			jedis.set("name", "yejing");
		}
		
	}
}
