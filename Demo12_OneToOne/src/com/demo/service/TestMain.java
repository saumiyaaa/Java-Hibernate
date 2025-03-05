package com.demo.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.bean.Address;
import com.demo.bean.Employee;

public class TestMain {

	public static void main(String[] args) {
		Configuration c = new Configuration();
		SessionFactory sFactory = c.configure().buildSessionFactory();
		Session session = sFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Address a1 = new Address(123, 11235, "Hill View", 411058, "Pune");
		session.save(a1);
		
		Employee e1 = new Employee(300, "Sam", 1000000, a1);
		session.save(e1);
		
		 transaction.commit();
			System.out.println("Record Added Successfully!!!");
			session.close();
			sFactory.close();

	}

}
