package com.demo.dao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.bean.Gift;

public class Client3 {

	public Client3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Configuration c = new Configuration();
				SessionFactory sFactory = c.configure().buildSessionFactory();
				Session session = sFactory.openSession();
				Transaction transaction = session.beginTransaction();
				
				Scanner scanner = new Scanner(System.in);
				
				 System.out.println("\nEnter Category you want to display");
				 String cat = scanner.nextLine();
				 
				 Query query1 = session.createQuery("from Gift g where g.category =?");
				 query1.setParameter(0, cat);
				 List<Gift> giftlist1 = query1.list();
				 for(Gift gift:giftlist1) {
					 System.out.println(gift);
				 }
				 /*
				 Query query1 = session.createQuery("from Gift g where g.category =:c");
				 query1.setParameter("c", cat);
				 List<Gift> giftlist1 = query1.list();
				 for(Gift gift:giftlist1) {
					 System.out.println(gift);
				 }
				 */
				 
					session.close();
					sFactory.close();		


	}

}
