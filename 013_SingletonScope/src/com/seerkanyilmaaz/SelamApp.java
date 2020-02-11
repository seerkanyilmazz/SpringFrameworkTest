package com.seerkanyilmaaz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SelamApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Selam selam = (Selam) context.getBean("selam");
		selam.setMesaj("Serkan Y�lmaz");
		selam.goster();
		
		
		Selam selam2 = (Selam) context.getBean("selam");
		selam2.setMesaj("Serdar Y�lmaz");
		selam2.goster();
	}
}
