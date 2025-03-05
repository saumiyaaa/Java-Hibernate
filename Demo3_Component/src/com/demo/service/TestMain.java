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
		Address a1 = new Address(21111, "Karan Arista", 411058, "Pune");
		Employee e1 = new Employee(129, "Harry", 6700000, a1);
		session.save(e1);
		transaction.commit();
		System.out.println("Record Added Successfully!!!");
		session.close();
		sFactory.close();
	}

}
