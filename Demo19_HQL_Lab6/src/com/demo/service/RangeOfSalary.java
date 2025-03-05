package com.demo.service;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.demo.bean.Customer;

public class RangeOfSalary {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration c = new Configuration();
		SessionFactory sFactory = c.configure().buildSessionFactory();
		Session session = sFactory.openSession();
		Transaction transaction = session.beginTransaction();		

		
		Criteria crt = session.createCriteria(Customer.class);
		ProjectionList pList = Projections.projectionList();
		pList.add(Projections.property("firstName"));
		pList.add(Projections.property("lastName"));
		pList.add(Projections.property("annualSal"));
		crt.setProjection(pList);
		Criterion cr = Restrictions.between("annualSal", 250000f, 750000f);		 
		 crt.add(cr);
		 
		 List<Object> cust = crt.list();		
		 
		 if(cust.isEmpty()) {
			 System.out.println("No such records Found!!!");
		 }else {
			 for(Object obj:cust){
			    	Object ar[]= (Object [])obj;
			    	System.out.println(ar[0]+" "+ar[1]+" "+ar[2]);
			    } 
		 }
		 
		 transaction.commit();
			
			session.close();
			sFactory.close();	

	}

}
