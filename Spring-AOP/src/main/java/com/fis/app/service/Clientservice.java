package com.fis.app.service;

import org.springframework.stereotype.Component;
import com.fis.app.util.LoggingClass;
import com.fis.app.util.SecurityClass;

import com.fis.app.util.LoggingClass;
import com.fis.app.util.SecurityClass;

@Component
public class Clientservice {

		public void doBookProduct()
		{
			System.out.println("------Product is Booked------");
		}
		
		public void doMakePayment()
		{
			System.out.println("------Make Payment for Product------");
		}
		
		public void doMakePayment(String paymentType)
		{
			System.out.println("------Make Payment for Product of Type = "+paymentType);
		}
}
