package com.demo.dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.bean.Gift;

public class Client1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration();
		SessionFactory sFactory = c.configure().buildSessionFactory();
		Session session = sFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Scanner scanner = new Scanner(System.in);
		//List <Gift> giftList = new ArrayList<Gift>();
		Gift g = null;
		System.out.println("Enter 10 records");
		
		for(int i=1; i<=10; i++) {
			System.out.println("\nEnter Gift Id: ");
			int id = scanner.nextInt();
			scanner.nextLine();
			System.out.println("\nEnter Gift Name: ");
			String name = scanner.nextLine();
			System.out.println("\nEnter Category: ");
			String cat = scanner.nextLine();
			System.out.println("\nEnter Price: ");
			float p = scanner.nextFloat();
			scanner.nextLine();
			 g = new Gift(id, name, cat, p);			 
			
			session.save(g);
						
		}
		
		 transaction.commit();
			System.out.println("Records Added Successfully!!!");
			
			session.close();
			sFactory.close();		
	

	}

}
