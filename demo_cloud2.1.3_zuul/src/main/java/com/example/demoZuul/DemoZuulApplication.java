package com.example.demoZuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class DemoZuulApplication {

	@Bean
	public TokenFilter tokenFilter() {
		return new TokenFilter();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoZuulApplication.class, args);
	}

}
