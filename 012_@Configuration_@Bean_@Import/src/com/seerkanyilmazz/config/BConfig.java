package com.seerkanyilmazz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.seerkanyilmazz.B;

@Configuration
public class BConfig {
	
	@Bean(name = "beanb")
	public B yaz() {
		return new B();	}
}
