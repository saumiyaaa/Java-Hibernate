	package com.demo.service;
	
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;
	
	import com.demo.bean.MyDate;
	import com.demo.bean.Sport;
	import com.demo.bean.Student;
	
	public class TestMain {
	
		public static void main(String[] args) {
			Configuration c = new Configuration();
			SessionFactory sFactory = c.configure().buildSessionFactory();
			Session session = sFactory.openSession();
			Transaction transaction = session.beginTransaction();
			
			MyDate d1 = new MyDate(01, 02, 2001);		
			Sport s1 = new Sport("VolleyBall", "outdoor", 6);
					
			Student stud = new Student(110, "Sam", 95f, d1, s1);
			session.save(stud);
			
			transaction.commit();
			System.out.println("Record Added Successfully!!!");
			session.close();
			sFactory.close();
		}
	
	}
