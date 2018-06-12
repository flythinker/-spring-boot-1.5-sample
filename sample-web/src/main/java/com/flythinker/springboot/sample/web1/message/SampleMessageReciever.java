package com.flythinker.springboot.sample.web1.message;

import com.flythinker.springboot.sample.web1.SampleWeb1Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 黄奕鹏（大鹏~飞翔理念）,创建于 2018/6/11.
 */
@Service
public class SampleMessageReciever {

    public static Logger logger = LoggerFactory.getLogger(SampleMessageReciever.class);

    public void receiveMessage(String message) {
        logger.info("Received <" + message + ">");
    }
}
