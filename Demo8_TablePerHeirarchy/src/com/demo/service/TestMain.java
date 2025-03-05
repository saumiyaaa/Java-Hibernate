package com.demo.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.bean.Player;
import com.demo.bean.Batsman;
import com.demo.bean.Bowler;
import com.demo.bean.FootballPlayer;
import com.demo.bean.HockeyPlayer;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Configuration c = new Configuration();
				SessionFactory sFactory = c.configure().buildSessionFactory();
				Session session = sFactory.openSession();
				Transaction transaction = session.beginTransaction();
				
				Player pl = new Player(11,"John Doe", 30, "Team A");
				session.save(pl);
				
			        HockeyPlayer hockeyPlayer = new HockeyPlayer(49,"Alex Winter", 28, "Team X", "Forward");
			        session.save(hockeyPlayer);		        
			       
			        
			        
			        FootballPlayer footballPlayer = new FootballPlayer(90,"Chris Bolt", 25, "Team Y", "Midfielder");
			        session.save(footballPlayer);
			        
			       
			        Batsman batsman = new Batsman(07, "M S Dhoni", 50, "India", 18000, 100);
			        session.save(batsman);
			        
			       
			        Bowler bowler = new Bowler(23, "Shane Warne", 52, "Australia", 700, 25.4);
			        session.save(bowler);
			        
			        transaction.commit();
					System.out.println("Record Added Successfully!!!");
					session.close();
					sFactory.close();

		        
		        
	}

}
