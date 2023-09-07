package com.empcriteria;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.configuration.HibernateConfiguration;
import com.entity.Employee;
import com.entity.Library;

public class Read {
	
	public static void main(String[] args) {
		
		listAllEmployees();
		listById();
	}

	private static void listAllEmployees() {
		Session session = HibernateConfiguration.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(Employee.class);
		List<Employee> list = criteria.list();
		for (Employee employee : list) {
			System.out.println(employee);
		}
		transaction.commit();
		session.close();
		
	}

	private static void listById() {
		Session session = HibernateConfiguration.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter Employee Id");
		int id = scanner.nextInt();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("id", id));
		List<Employee> list = criteria.list();
		for (Employee employee : list) {
			System.out.println(employee);
		}
		transaction.commit();
		session.close();
	}

}
