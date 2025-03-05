package com.demo.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.bean.Employee;

public class TestMain {
	
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		SessionFactory sFactory = conf.configure().buildSessionFactory();
		Session s = sFactory.openSession();
		Transaction t = s.beginTransaction();
		
		Employee e1 = new Employee("Sam", 123, 450000);
		s.save(e1);
		t.commit();
		System.out.println("Record Addded Successfully");
		s.close();
		sFactory.close();
	}

}
