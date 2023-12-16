package com.rak.MavenProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Started" );
        
        //SessionFactory factory = new Configuration().configure().buildSessionFactory();
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        //creating students
        
        Student st = new Student();
        st.setId(102);
        st.setName("Rahul");
        st.setCity("Dhanbad");
        System.out.println(st);
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(st);
        tx.commit();
        session.close();
        
    }
}
