package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
	@Autowired HelloRemote helloRemote;

	@RequestMapping("/hello")
	public String hello(@RequestParam String name) {
		return helloRemote.hello(name);
	}
	
}


