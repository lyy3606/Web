package redis;

import redis.clients.jedis.Jedis;

import java.util.List;

public class RedisJava {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        jedis.select(1);
        System.out.println("连接成功");
        System.out.println("服务正在运行：" + jedis.ping());
        jedis.set("cfj", "goodbye");
        System.out.println("i just want to say :" + jedis.get("cfj"));
        jedis.lpush("list","1");
        jedis.lpush("list","2");
        jedis.lpush("list","3");
        List<String> list = jedis.lrange("list",0,2);
        for(String str : list){
            System.out.println(str);
        }
    }
}
