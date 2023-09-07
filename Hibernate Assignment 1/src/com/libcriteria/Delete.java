package com.libcriteria;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.configuration.HibernateConfiguration;
import com.entity.Library;

public class Delete {
	public static void main(String[] args) {
		Session session = HibernateConfiguration.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        
        Library library = new Library();
        library.setIsbn(1002);
        session.delete(library);
        transaction.commit();
        session.close();
	}

}
