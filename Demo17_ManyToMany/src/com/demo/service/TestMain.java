package com.demo.service;


import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.bean.Course;
import com.demo.bean.Student;

public class TestMain {

	public static void main(String[] args) {
		Configuration c = new Configuration();
		SessionFactory sFactory = c.configure().buildSessionFactory();
		Session session = sFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Course c1 = new Course(123, "FSD Java", "6 months", 80000);
		Course c2 = new Course(231, "Data Science", "5 months", 70000);
		
		Set <Course> coursesSet1 = new HashSet<Course>();
		coursesSet1.add(c1);
		coursesSet1.add(c2);
		
		Set <Course> coursesSet2 = new HashSet<Course>();
		coursesSet2.add(c1);
		
		Student s1 = new Student(100, "Sam", "sam01@gmail.com", coursesSet1);
		Student s2 = new Student(109, "Kevin", "kev01@gmail.com", coursesSet2);
		
		Set<Student> studentsSet1 = new HashSet<Student>();
		studentsSet1.add(s1);
		studentsSet1.add(s2);
		
		c1.setStudents(studentsSet1);
		
		session.save(c1);
		session.save(c2);
		session.save(s1);
		session.save(s2);
		
		 transaction.commit();
			System.out.println("Record Added Successfully!!!");
			session.close();
			sFactory.close();

	}


}
