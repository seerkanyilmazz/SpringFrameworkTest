package com.seerkanyilmaaz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SelamApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Selam selam = (Selam) context.getBean("selam");
		selam.setMesaj("Serdar Yýlmaz " + "Serdar Yýlmaz");
		selam.goster();
		
		
		Selam selam2 = (Selam) context.getBean("selam");
		selam2.goster();
		
		Selam selam3 = (Selam) context.getBean("selam");
		selam3.goster();
		
		System.out.println("nesne 1: " + selam);
		System.out.println("nesne 2: " + selam2);
		System.out.println("nesne 3: " + selam3);
	}
}
