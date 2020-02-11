package com.seerkanyilmazz;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class AppCalistir {

	public static void main(String[] args) {
		
		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		
		Araba araba = (Araba) beanFactory.getBean("araba");
		
		
		//Araba araba = new Araba();
		araba.hareketeGec();
	}
}
