package com.seerkanyilmazz;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IoCConfig.class);
		
		
		ICustomerDal customerDal = context.getBean("database", ICustomerDal.class);
		
		customerDal.add();
	}
}
