package com.flythinker.springboot.sample.web1;

import com.flythinker.springboot.sample.web1.message.SampleMessageReciever;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;

@SpringBootApplication
public class SampleWeb1Application {

	public static Logger logger = LoggerFactory.getLogger(SampleWeb1Application.class);

	@Bean
	RedisMessageListenerContainer container(RedisConnectionFactory connectionFactory,
											MessageListenerAdapter listenerAdapter
											) {
		RedisMessageListenerContainer container = new RedisMessageListenerContainer();
		container.setConnectionFactory(connectionFactory);
		//MessageListenerAdapter listenerAdapter = new MessageListenerAdapter( sampleMessageReciever, "receiveMessage");
		//listenerAdapter.afterPropertiesSet();
		//logger.info("sampleMessageReciever:" + sampleMessageReciever);
		container.addMessageListener(listenerAdapter, new PatternTopic("sample.web"));
		return container;
	}

	@Bean
	MessageListenerAdapter listenerAdapter() {
		SampleMessageReciever sampleMessageReciever = new SampleMessageReciever();
		return new MessageListenerAdapter(sampleMessageReciever, "receiveMessage");
	}

	public static void main(String[] args) {
		SpringApplication.run(SampleWeb1Application.class, args);
	}
}
