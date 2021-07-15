package com.fis.app.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fis.app.model.Employee;
import com.fis.app.model.Client;
import com.fis.app.service.Clientservice;

public class MainRunner {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("spring-conf.xml");	
		
		//Employee emp=(Employee)spring.getBean("employee");
		
		Clientservice clientService = (Clientservice)spring.getBean("clientservice");
		
		System.out.println(" \n\n------------New AOP Approach --------- \n\n");
		clientService.doBookProduct();
		
		System.out.println(" \n\n--------- No Argument call ---------\n\n");
		clientService.doMakePayment();
		
		System.out.println(" \n\n--------- make payment with argument ---------\n\n");
		clientService.doMakePayment("Paytm");
		
		spring.close();
		
		
	
		
	}
}