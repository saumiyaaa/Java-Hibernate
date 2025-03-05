package com.demo.service;


import java.util.HashSet;
import java.util.Set;

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
		
		Customer c1 = new Customer(308, "Sam");
		session.save(c1);
		
		Order o1 = new Order(123, 56000, "12/03/2024", c1);
		session.save(o1);
		
		Order o2 = new Order(130, 106000, "29/05/2024", c1);
		session.save(o2);
		
		Set<Order> OrderSet = new HashSet<Order>();
		OrderSet.add(o1);
		OrderSet.add(o2);
		
		 transaction.commit();
			System.out.println("Record Added Successfully!!!");
			session.close();
			sFactory.close();

	}


}
