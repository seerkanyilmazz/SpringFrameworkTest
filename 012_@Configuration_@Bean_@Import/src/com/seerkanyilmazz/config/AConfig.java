package com.seerkanyilmazz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.seerkanyilmazz.A;

@Configuration
public class AConfig {
	
	@Bean(name = "beana")
	public A yaz() {
		return new A();
	}
}
