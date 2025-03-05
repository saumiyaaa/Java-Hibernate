package com.demo.dao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client5 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration();
		SessionFactory sFactory = c.configure().buildSessionFactory();
		Session session = sFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		
		Query query = session.createQuery("select giftname, price from Gift g");
		 List<Object> giftList = query.list();
		 for(Object obj:giftList){
		    	Object ar[]= (Object [])obj;
		    	System.out.println(ar[0]+" "+ar[1]);
		    } 
		 
		 session.close();
			sFactory.close();	

	}

}
