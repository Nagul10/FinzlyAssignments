package com.empcriteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.configuration.HibernateConfiguration;
import com.entity.Employee;

public class CriteriaFunctionality {
	public static void main(String[] args) {
		salryGT3000();
		deptDevOrTester();
		deptNotTester();
		sortBySalary();
	}

	private static void sortBySalary() {
		Session session = HibernateConfiguration.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(Employee.class);
        criteria.addOrder(Order.desc("salary"));
		List<Employee> list = criteria.list();
		for (Employee employee : list) {
			System.out.println(employee);
		}
		transaction.commit();
		session.close();
		
	}

	private static void deptNotTester() {
		Session session = HibernateConfiguration.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(Employee.class);
        criteria.add(Restrictions.ne("department", "Tester"));
		List<Employee> list = criteria.list();
		for (Employee employee : list) {
			System.out.println(employee);
		}
		transaction.commit();
		session.close();
		
	}

	private static void deptDevOrTester() {
		Session session = HibernateConfiguration.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(Employee.class);
        criteria.add(Restrictions.or(
                Restrictions.eq("department", "Developer"),
                Restrictions.eq("department", "Tester")
            ));
		List<Employee> list = criteria.list();
		for (Employee employee : list) {
			System.out.println(employee);
		}
		transaction.commit();
		session.close();
		
	}

	private static void salryGT3000() {
		Session session = HibernateConfiguration.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(Employee.class);
        criteria.add(Restrictions.gt("salary", 3000.0));
		List<Employee> list = criteria.list();
		for (Employee employee : list) {
			System.out.println(employee);
		}
		transaction.commit();
		session.close();
		
	}

}
