package com.demo.dao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.bean.Gift;

public class Client7 {


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
		 Query query2 = session.createQuery("select giftname, price from Gift g where g.price between :mn and :mx");
		 query2.setParameter("mn", min);
		 query2.setParameter("mx", max);
		 List<Object> giftlist2 = query2.list();
		 for(Object obj:giftlist2){
		    	Object ar[]= (Object [])obj;
		    	System.out.println(ar[0]+" "+ar[1]);
		    } 
		 
			session.close();
			sFactory.close();		



	}

}
