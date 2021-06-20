package com.eagle.crm.config;

public interface JedisClient {
    String psetex(final String key, final long milliseconds, final String value);
    String set(String key, String value);

    String get(String key);

    Boolean exists(String key);

    Long expire(String key, int seconds);

    Long ttl(String key);

    Long incr(String key);
    //38491
    Long decr(String key);

    Long hset(String key, String field, String value);

    String hget(String key, String field);

    Long hdel(String key, String... field);
}
