package com.libcriteria;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.configuration.HibernateConfiguration;
import com.entity.Library;

public class Create {
	public static void main(String[] args) {
		Session session = HibernateConfiguration.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        
        Library library = new Library();
        library.setIsbn(1002);
        library.setTitle("13 Reasons Why");
        library.setAuthor("Samson Joe");
        library.setPublicationYear(2005);
        session.save(library);
        transaction.commit();
        session.close();
	}

}
