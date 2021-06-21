package com.eagle.crm;

import com.eagle.crm.config.JedisClientCluster;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class A {
    @Autowired
    private JedisClientCluster jedisClientCluster;
    @DisplayName("11")
    @Test
    void test(){
        jedisClientCluster.decr("num");
    }
}
