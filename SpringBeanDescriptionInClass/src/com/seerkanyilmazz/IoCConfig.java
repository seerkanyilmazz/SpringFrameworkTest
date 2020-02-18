package com.seerkanyilmazz;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@Configurable
@ComponentScan("com.seerkanyilmazz")
@PropertySource("classpath:values.properties")
public class IoCConfig {

	@Bean
	public ICustomerDal database(){
		return new MySqlCustomerDal();
	}
	
	@Bean
	public ICustomerService service() {
		return new CustomerManager(database());
	}
}
