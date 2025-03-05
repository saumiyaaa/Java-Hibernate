package com.demo.service;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.bean.Customer;
import com.demo.bean.Order;

public class TestMain {

	public static void main(String[] args) {
		Configuration c = new Configuration();
		SessionFactory sFactory = c.configure().buildSessionFactory();
		Session session = sFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Order o1 = new Order(123, 56000, "12/03/2024");
		session.save(o1);
		
		Customer c1 = new Customer(308, "Sam", o1);
		session.save(c1);
		
		 transaction.commit();
			System.out.println("Record Added Successfully!!!");
			session.close();
			sFactory.close();

	}


}
