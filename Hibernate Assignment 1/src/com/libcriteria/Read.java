package com.libcriteria;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.configuration.HibernateConfiguration;
import com.entity.Library;

public class Read {
	public static void main(String[] args) {
		Session session = HibernateConfiguration.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        
        Library library = session.get(Library.class,1001);
        System.out.println(library);
        transaction.commit();
        session.close();

	}

}
