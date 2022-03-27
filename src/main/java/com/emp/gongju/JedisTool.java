package com.emp.gongju;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisTool {
    private static Jedis jedis = null;

    public static Jedis getJedis() {
        if (jedis == null) {
            GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();

            JedisPool jedisPool = new JedisPool(poolConfig, "192.168.236.128", 6379, 30000);
            jedis = jedisPool.getResource();
        }
        return jedis;
    }
}