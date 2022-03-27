package com.first;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.emp.configer.RedisTableConf;
import com.emp.gongju.JedisTool;
import com.emp.pojo.Employee;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Tests {

    /**
     * 测试redis
     */
    @Test
    public void  test01(){

        JedisPool jedisPool=new JedisPool(new GenericObjectPoolConfig(),"192.168.236.128",6379,30000,null,0);
        Jedis jedis=  jedisPool.getResource();
        System.out.println(jedis.ping());
    }




    /**
     * 测试json
     */
    @Test
    public void test02() throws IOException {
        Map map = new HashMap();
        map.put("message", null);
        System.out.println(JSON.toJSONString(map, SerializerFeature.WriteMapNullValue));
    }

    /**
     * 添加测试数据
     */
    public void test03(){
        Jedis jedis= JedisTool.getJedis();
        Employee employee =new Employee();
        employee.setId((int) (jedis.hlen(RedisTableConf.EMP_TABLE_NAME)+1));
        employee.setPassword("123456");
        employee.setName("张三");
        employee.setSalary(2000);
        employee.setAge(23);
        String s= JSON.toJSONString(employee);

    }

}
