package com.demo.service;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.bean.Actor;
import com.demo.bean.Movie;

public class TestMain {

	public static void main(String[] args) {
		Configuration c = new Configuration();
		SessionFactory sFactory = c.configure().buildSessionFactory();
		Session session = sFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Actor a1 = new Actor(1, "SRK");
		Actor a2 = new Actor(2, "Salman");
		
		Set <Actor> actorsSet1 = new HashSet<Actor>();
		actorsSet1.add(a1);
		actorsSet1.add(a2);
		
		Set <Actor> actorsSet2 = new HashSet<Actor>();
		actorsSet2.add(a1);
		
		Movie m1 = new Movie(501, "Karan Arjun", actorsSet1);
		Movie m2 = new Movie(502, "DDLJ", actorsSet2);
		
		Set<Movie> moviesSet1 = new HashSet<Movie>();
		moviesSet1.add(m1);
		moviesSet1.add(m2);
		
		a1.setMovies(moviesSet1);
		
		session.save(a1);
		session.save(a2);
		session.save(m1);
		session.save(m2);
		
		transaction.commit();
		System.out.println("Record Added Successfully!!!");
		session.close();
		sFactory.close();
	}

}
