package demo1;

import java.util.List;
import java.util.Set;

import redis.clients.jedis.Jedis;

public class Main {

	public static void main(String[] args) {
//        new RedisClient().show(); 

		RedisClient client = new RedisClient();
		client.show();
//        client.setStr("name", "yejing123");
//        System.out.println(client.getStr("name"));

		Jedis jedis = client.getJedis();
//		Set<String> keys = jedis.keys("*");
//		for (String key : keys) {
//			System.out.println(key);
//			if (jedis.type(key).equals("string")) {
//				System.out.println(jedis.get(key));
//			}
//
//			if (jedis.type(key).equals("hashs")) {
//				List<String> list = jedis.hvals(key);
//				for (String str : list) {
//					System.out.println(str);
//				}
//			}
//		}
		
//		client.StringOperate();
		client.ListOperate();
	}

}