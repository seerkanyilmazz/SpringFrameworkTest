package com.seerkanyilmazz;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.seerkanyilmazz.config.AppConfig;

public class MerkezApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		A aNesnesi = (A) context.getBean("beana");
		aNesnesi.yaz("Serkan Yýlmaz");
		
		B bNesnesi = (B) context.getBean("beanb");
		bNesnesi.yaz("Serdar Yýlmaz");
		
	}

}
