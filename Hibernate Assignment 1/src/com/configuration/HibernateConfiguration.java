package com.configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.entity.Library;

public class HibernateConfiguration {
	
	private HibernateConfiguration(){
	}
	
	public static SessionFactory getSessionFactory(){
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Library.class);
        configuration.configure("hibernate.cfg.xml");
        return configuration.buildSessionFactory();
    }

}
