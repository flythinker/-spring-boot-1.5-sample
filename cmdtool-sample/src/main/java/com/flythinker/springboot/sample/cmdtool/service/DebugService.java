package com.flythinker.springboot.sample.cmdtool.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * 黄奕鹏（大鹏~飞翔理念）,创建于 2018/6/11.
 */
@Service
public class DebugService {

    public static Logger logger = LoggerFactory.getLogger(DebugService.class);

    @Autowired
    private ApplicationContext applicationContext;

    public void printDebugInfo()
    {
        String[] names = applicationContext.getBeanDefinitionNames();
        for(String name:names){
            Object obj = applicationContext.getBean(name);
            logger.info( "bean name:{} {}" , name,obj.getClass().getName() );
        }
    }
}
