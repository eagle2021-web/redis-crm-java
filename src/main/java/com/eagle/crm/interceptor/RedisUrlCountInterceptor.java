package com.eagle.crm.interceptor;

import com.eagle.crm.config.RedisConfig;
import com.eagle.crm.config.RedisProperties;
import com.eagle.crm.config.JedisClientCluster;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@Component
public class RedisUrlCountInterceptor implements HandlerInterceptor {

    @Autowired
    StringRedisTemplate redisTemplate;
    @Autowired
    private RedisProperties redisProperties;

    @Autowired
    private RedisConfig redisConfig;

    @Autowired
    private JedisClientCluster jedisClientCluster;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String uri = request.getRequestURI();
        log.info("访问地址：" + uri);
//        //默认每次访问当前uri就会计数+1
        Long increment = -1L;
        try{
//            redisTemplate
          increment = jedisClientCluster.incr(uri);
        }catch (RuntimeException err){
            System.out.println(err);
        }
        System.out.println(increment);
        return true;
    }
}
