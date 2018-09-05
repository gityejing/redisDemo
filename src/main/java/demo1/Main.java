package demo1;

public class Main {

    public static void main(String[] args) {
//        new RedisClient().show(); 
        
        RedisClient client = new RedisClient();
        client.setStr("name", "yejing");
        System.out.println(client.getStr("name"));
    }

}