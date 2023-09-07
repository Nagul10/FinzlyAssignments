package com.empcriteria;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.configuration.HibernateConfiguration;
import com.entity.Employee;

public class Update {
	public static void main(String[] args) {
		Session session = HibernateConfiguration.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.println("Updating Employee Details  \n");
        System.out.println("Enter Employee ID");
        employee.setId(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter Employee First Name");
        employee.setFirstName(scanner.nextLine());
        System.out.println("Enter Employee Last Name");
        employee.setLastName(scanner.nextLine());
        System.out.println("Enter Employee Date OF Birth");
        employee.setDateOfBirth(scanner.nextLine());
        System.out.println("Enter Employee Email");
        employee.setEmail(scanner.nextLine());
        System.out.println("Enter Employee Department");
        employee.setDepartment(scanner.nextLine());
        System.out.println("Enter Employee Salary");
        employee.setSalary(scanner.nextDouble());
        session.update(employee);
        transaction.commit();
        session.close();
	}

}
