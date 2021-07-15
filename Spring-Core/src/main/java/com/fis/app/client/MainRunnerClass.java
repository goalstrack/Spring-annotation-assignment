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
		Employee emp = (Employee)spring.getBean("newEmployee2");		
		emp.setDepartment("Production");
		List<Task> task=new ArrayList<>();
		Task t1=new Task(34, "Data Retrival");
		//Task t2=new Task(23,"Execution");
		task.add(t1);
		//task.add(t2);
		emp.setT(task);
		System.out.println("First creation: "+emp);
		
		Employee emp1 = (Employee)spring.getBean("newEmployee2");				
		System.out.println(emp1);
		
		
		Employee emp2 = (Employee)spring.getBean("newEmployee2");	
		emp2.setEname("ved");
		System.out.println("First creation: "+emp2);
		
		Employee emp3 = (Employee)spring.getBean("newEmployee2");				
		System.out.println(emp3);
		spring.close();
		
		
	}
	
}
