package com.first;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class Demo01 {

    public static void main(String [] args) {
        method01();
    }


    public  static   void method02(){
        JedisPool jedisPool=new JedisPool(new GenericObjectPoolConfig(),"192.168.236.128",6379,30000,null,0);
      Jedis jedis=  jedisPool.getResource();
        String emp = jedis.get("emp");
        System.out.println(emp);

    }
    public static void method01(){
        Jedis jedis=new Jedis("192.168.236.128",6379);
        System.out.println(jedis.ping());

      //  jedis.set("emp","smith");

        System.out.println("获取Redis中的数据");
        String emp=jedis.get("emp");
        System.out.println(emp);
        System.out.println("执行结束");



    }
}
