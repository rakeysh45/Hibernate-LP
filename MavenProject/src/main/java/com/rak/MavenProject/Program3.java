package com.rak.MavenProject;

import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query; // Use org.hibernate.query.Query instead of org.hibernate.Query
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List; 


public class Program3 {

	public static void main(String[] args) {;
	        Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
	        SessionFactory factory = cfg.buildSessionFactory();

	        Session session = factory.openSession();

	        Query query = session.createQuery("from Student");
	        List<Student> students = query.getResultList();

	        for (Student s : students) {
	            System.out.println(s);
	        }

	        session.close();


	}

}
