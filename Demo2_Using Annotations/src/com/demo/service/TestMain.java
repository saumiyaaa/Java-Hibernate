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
		
		/*
		 *Employee e1 = new Employee("Anne", 125, 550000); // Transient Object
		s.save(e1); //insert query
		t.commit();
		System.out.println("Record Addded Successfully");
		s.close();
		sFactory.close();		
		*/
		
		Employee emp1 = (Employee)s.get(Employee.class, 125);
		if(emp1!=null) {
			System.out.println("Record is Available");
			System.out.println(emp1);
		} else {
			System.out.println("Employee record not found");
		}
		
		//Employee emp1 = (Employee)s.update(emp1);
		
		s.close();
		sFactory.close();
		
	}

}
