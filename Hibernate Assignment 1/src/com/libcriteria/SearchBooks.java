package com.libcriteria;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.configuration.HibernateConfiguration;
import com.entity.Library;

public class SearchBooks {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		searchByRange(1950,2000);
		searchByAuthor();
		searchByTitle();
		searchByISBN();
		displayAllBooks();
	}

	private static void searchByISBN() {
		Session session = HibernateConfiguration.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(Library.class);
        System.out.println("Enter ISBN Number");
        int isbn = scanner.nextInt();
        criteria.add(Restrictions.eq("isbn", isbn));
        List<Library> list = criteria.list();
		for (Library library : list) {
			System.out.println(library);
		}
		transaction.commit();
		session.close();
		
	}

	private static void displayAllBooks() {
		Session session = HibernateConfiguration.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(Library.class);
		List<Library> list = criteria.list();
		for (Library library : list) {
			System.out.println(library);
		}
		transaction.commit();
		session.close();
		
	}

	private static void searchByTitle() {
		Session session = HibernateConfiguration.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(Library.class);
        System.out.println("Enter Title Of Book");
        String title = scanner.nextLine();
        criteria.add(Restrictions.eq("title", title));
		List<Library> list = criteria.list();
		for (Library library : list) {
			System.out.println(library);
		}
		transaction.commit();
		session.close();
        
	}

	private static void searchByAuthor() {
		Session session = HibernateConfiguration.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(Library.class);
        System.out.println("Enter Author Of Book");
        String author = scanner.nextLine();
        criteria.add(Restrictions.eq("author", author));
		List<Library> list = criteria.list();
		for (Library library : list) {
			System.out.println(library);
		}
		transaction.commit();
		session.close();
        
	}

	private static void searchByRange(int fromYear, int toYear) {
		Session session = HibernateConfiguration.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(Library.class);
        criteria.add(Restrictions.between("publicationYear", fromYear, toYear));
		List<Library> list = criteria.list();
		for (Library library : list) {
			System.out.println(library);
		}
		transaction.commit();
		session.close();
		
	}

}
