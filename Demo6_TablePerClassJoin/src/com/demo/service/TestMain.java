package com.demo.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.demo.bean.Employee;
import com.demo.bean.Manager;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration();
		SessionFactory sFactory = c.configure().buildSessionFactory();
		Session session = sFactory.openSession();
		Transaction transaction = session.beginTransaction();
	
		Employee e1 = new Employee(129, "Ron", 6700000);
		session.save(e1);
		
		Manager m1 = new Manager(130, "Hermione", 1200000, 1000f, 9);
		session.save(m1);
		
		transaction.commit();
		System.out.println("Record Added Successfully!!!");
		session.close();
		sFactory.close();

	}

}
