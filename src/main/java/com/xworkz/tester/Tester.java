package com.xworkz.tester;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.cooler.Refrigerator;

public class Tester {

	public static void main(String[] args) {
		String configContextocation = "Application.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configContextocation);
		Refrigerator refrigerator = applicationContext.getBean(Refrigerator.class);
		
		System.out.println(refrigerator.getBrand());
		System.out.println(refrigerator.getPrice());
		 
		
	}

}
