package com.demo.dao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.bean.Gift;

public class Client2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration();
		SessionFactory sFactory = c.configure().buildSessionFactory();
		Session session = sFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Scanner scanner = new Scanner(System.in);
		
		Query query = session.createQuery("from Gift g");
		 List<Gift> giftlist = query.list();
		 for(Gift gift1:giftlist) {
			 System.out.println(gift1);
		 }
		 
			session.close();
			sFactory.close();		


	}

}
