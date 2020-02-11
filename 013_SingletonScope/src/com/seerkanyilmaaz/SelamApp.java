package com.seerkanyilmaaz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SelamApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Selam selam = (Selam) context.getBean("selam");
		selam.setMesaj("Serkan Yýlmaz");
		selam.goster();
		
		
		Selam selam2 = (Selam) context.getBean("selam");
		selam2.setMesaj("Serdar Yýlmaz");
		selam2.goster();
	}
}
