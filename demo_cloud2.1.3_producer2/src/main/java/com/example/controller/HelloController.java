package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	@RequestMapping({"/hello","/m/hello2"})
	public String hello(@RequestParam String name) {
		 logger.info("request two name is "+name);
		    try{
		        Thread.sleep(1000000);
		    }catch ( Exception e){
		        logger.error(" hello two error",e);
		    }
		    
		return "demo_cloud2.1.3_producer2: --> hello " + name + "，this is first messge";
	}
}
