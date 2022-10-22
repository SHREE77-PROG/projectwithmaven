package com.tut;

import java.util.Date;

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
        //create int student
      /*  Student st =new Student();
        st.setId(104);
        st.setName("ragu");
        st.setCity("laknoe");
        System.out.println(st);*/
        //create address
        Address ad =new Address();
        ad.setStreet("navrang");
        ad.setCity("bangalore");
        ad.setIsopen(true);
        ad.setAddeddate(new Date());
        ad.setX(1230.45);
        
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
       // session.save(st);
        session.save(ad);
        tx.commit();
        session.close();
        System.out.println("done..");
        
        
        
    }
}
