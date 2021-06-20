package com.eagle.crm.controller;

import lombok.extern.slf4j.Slf4j;
import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import redis.clients.jedis.JedisCluster;

@Slf4j
@RestController
@RequestMapping(value = "/redisTest")
@SuppressWarnings("unused")
public class RedisController {


    private final Redisson redisson;
    private final JedisClientCluster jedisClientCluster;

    private final JedisCluster jedisCluster;

    @Autowired
    public RedisController(Redisson redisson, JedisClientCluster jedisClientCluster, JedisCluster jedisCluster) {
        this.redisson = redisson;
        this.jedisClientCluster = jedisClientCluster;
        this.jedisCluster = jedisCluster;
    }


    @GetMapping("/testRedisson")
    public void testRedisson() {
        RLock lock = redisson.getLock("lock25");
        boolean b = lock.tryLock();
        if (b && lock.isHeldByCurrentThread()) {
            try {
                String value = this.jedisCluster.get("num");
                log.info("value" + value);
                if (Integer.parseInt(value) > 0) {
                    jedisClientCluster.decr("num");
                } else {
                    log.info("卖完了！");
                }
            } catch (Throwable err) {
                System.out.println(err.getMessage());
            } finally {
                try {
                    lock.unlock();
                } catch (IllegalMonitorStateException err) {
                    log.error(err.getMessage());
                }
            }
        } else {
            try {
                Thread.sleep(Integer.parseInt(Math.random() * 100 + "") + 100 );
                testRedisson();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @ResponseBody
    @GetMapping("/set_num/{num}")
    public String set_num(@PathVariable(name = "num") String num) {
        jedisClientCluster.set("num", num);
        return jedisClientCluster.get("num");
    }

}

