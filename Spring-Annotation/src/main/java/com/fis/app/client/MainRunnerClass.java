package com.fis.app.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fis.app.model.Employee;
import com.fis.app.model.Task;

public class MainRunnerClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("spring-conf.xml");
		Employee emp = (Employee)spring.getBean("employee");		
		
		System.out.println("First creation: "+emp);	
		
		spring.close();
		
		
	}
	
}
