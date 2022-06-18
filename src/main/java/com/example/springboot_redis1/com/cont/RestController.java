package com.example.springboot_redis1.com.cont;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/redis")
public class RestController {
    @Autowired
    RedisTemplate redisTemplate;
    @GetMapping
    public String redis(){
    redisTemplate.opsForValue().set("name","name1");
    return (String)(redisTemplate.opsForValue().get("name"));
    }
}
