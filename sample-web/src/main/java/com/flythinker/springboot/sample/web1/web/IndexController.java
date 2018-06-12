package com.flythinker.springboot.sample.web1.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class IndexController implements ApplicationContextAware {

	public static Logger logger = LoggerFactory.getLogger(IndexController.class);

	  private static final String template = "Hello, %s!";
	  
	  private final AtomicLong counter = new AtomicLong();

	private ApplicationContext applicationContext;
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
	{
		this.applicationContext = applicationContext;
		logger.info("applicationContext:" + applicationContext );
	}
	  
  @Autowired
  Environment ev ;


	    
	@RequestMapping("/")
	public String index() {
		return "index";
	}


}

