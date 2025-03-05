package com.demo.service;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;	
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.bean.Department;
import com.demo.bean.Employee;

public class TestMain {

	public static void main(String[] args) {
		Configuration c = new Configuration();
		SessionFactory sFactory = c.configure().buildSessionFactory();
		Session session = sFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Department d1 = new Department(200, "Sales");
		session.save(d1);
		
		Employee e1 = new Employee(300, "Sam", 1000000, d1);
		session.save(e1);
		
		Employee e2 = new Employee(301, "Kevin", 900000, d1);
		session.save(e2);
		
		Set<Employee> empset = new HashSet<Employee>();
		empset.add(e1);
		empset.add(e2);
		
		    transaction.commit();
			System.out.println("Record Added Successfully!!!");
			session.close();
			sFactory.close();

	}

}