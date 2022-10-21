package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "project started..." );
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        //creatint student
        Student st =new Student();
        st.setId(102);
        st.setName("kiran");
        st.setCity("bangalore");
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(st);
        tx.commit();
        session.close();
        
        
        
    }
}
