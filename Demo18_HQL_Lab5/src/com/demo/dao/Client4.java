package com.demo.dao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.bean.Gift;

public class Client4 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration();
		SessionFactory sFactory = c.configure().buildSessionFactory();
		Session session = sFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Scanner scanner = new Scanner(System.in);
		
		 System.out.println("Enter min range of price");
		 float min = scanner.nextInt();
		 scanner.nextLine();
		 System.out.println("Enter max range of price");
		 float max = scanner.nextInt();
		 scanner.nextLine();
		 Query query2 = session.createQuery("from Gift g where g.price between :mn and :mx");
		 query2.setParameter("mn", min);
		 query2.setParameter("mx", max);
		 List<Gift> giftlist2 = query2.list();
		 for(Gift gift:giftlist2) {
			 System.out.println(gift);
		 }
		 
			session.close();
			sFactory.close();		


	}

}
