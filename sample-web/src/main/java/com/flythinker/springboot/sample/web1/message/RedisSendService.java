package com.flythinker.springboot.sample.web1.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 黄奕鹏（大鹏~飞翔理念）,创建于 2018/6/11.
 */
@Service
public class RedisSendService {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public void test1() throws Exception
    {
        //stringRedisTemplate.ops
        stringRedisTemplate.convertAndSend("sample.web" , "msg :" + new Date().toString() );
    }
}
