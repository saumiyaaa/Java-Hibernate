package com.demo.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client6 {

      public static void main(String[] args) {
		
    	  Configuration c = new Configuration();
  		SessionFactory sFactory = c.configure().buildSessionFactory();
  		Session session = sFactory.openSession();
  		Transaction transaction = session.beginTransaction();
  		
  		Query query1 = session.createQuery("select min(g.price) from Gift g");
  		Float minPrice = (Float)query1.uniqueResult();
  		System.out.println("\nCheapest Gift: "+minPrice);
  		
  		Query query2 = session.createQuery("select max(g.price) from Gift g");
  		Float maxPrice = (Float)query2.uniqueResult();
  		System.out.println("\nMost Expensive Gift: "+maxPrice);
  		
  		Query query3 = session.createQuery("select count(giftid) from Gift g");
  		Long Count = (Long)query3.uniqueResult();
  		System.out.println("\nNo of Gifts: "+Count);
  		
  		session.close();
		sFactory.close();	
	}
      
      

}
