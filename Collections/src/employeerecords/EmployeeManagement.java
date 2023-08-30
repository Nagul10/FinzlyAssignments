package employeerecords;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement {
    private static final Scanner sc = new Scanner(System.in);
    private static ArrayList<Employee> employees = new ArrayList<>();
    public static void main(String[] args) {

        boolean flag = true;
        while (flag){
            System.out.println("-----------------------------------");
            System.out.println("Employee Record Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Exit");
            System.out.println("-----------------------------------");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1 :
                    addEmployee();
                    break;
                case 2 :
                    viewAllEmployee();
                    break;
                case 3 :
                    searchEmployee();
                    break;
                case 4 :
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice !!!");
            }
        }
    }

    private static void searchEmployee() {
        System.out.println("Enter Employee Id To Fetch Details");
        int id = sc.nextInt();
        for (Employee employee : employees){
            if(employee.getEmployeeId() == id) {
                System.out.println(employee);
                return;
            }
        }
        System.out.println("Record Not Found !!! Enter The Correct Id !!!");

    }

    private static void viewAllEmployee() {
        for (Employee employee : employees){
            System.out.println(employee.toString());
        }
    }

    private static void addEmployee() {
        System.out.println("Enter EmployeeID");
        int employeeID = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Employee Name");
        String name = sc.nextLine();
        System.out.println("Enter Employee Salary");
        double salary = sc.nextDouble();
        employees.add(new Employee(employeeID,name,salary));
        System.out.println("Employee Added successfully");
    }
}
