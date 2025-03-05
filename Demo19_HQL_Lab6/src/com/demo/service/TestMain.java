package com.demo.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.bean.Customer;

public class TestMain {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration();
		SessionFactory sFactory = c.configure().buildSessionFactory();
		Session session = sFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Customer c1 = new Customer(100, "Peter","Parker", 1000000,"New York" );
		Customer c2 = new Customer(101, "Harry","Potter", 1500000,"Hogsmeade" );
		Customer c3 = new Customer(102, "Payel","Parira", 300000,"Pune" );
		Customer c4 = new Customer(103, "Shivani","Irlewad", 600000,"Pune" );
		Customer c5 = new Customer(106, "Annabeth","Chase", 700000,"Pune" );
		
		session.save(c1);
		session.save(c2);
		session.save(c3);
		session.save(c4);
		session.save(c5);
		
		transaction.commit();
		System.out.println("Records Added Successfully!!!");
		
		session.close();
		sFactory.close();	


	}

}
