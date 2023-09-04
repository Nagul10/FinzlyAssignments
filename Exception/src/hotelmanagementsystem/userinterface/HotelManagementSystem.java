package hotelmanagementsystem.userinterface;

import hotelmanagementsystem.exceptions.DuplicateEmployeeException;
import hotelmanagementsystem.exceptions.InvalidTaskAssignmentException;
import hotelmanagementsystem.reservationmanagement.*;

import java.util.HashMap;
import java.util.Scanner;

public class HotelManagementSystem {
    static Scanner sc = new Scanner(System.in);
    static HashMap<Integer,Employee> employees = new HashMap<>();

    private static void hireEmployee() throws DuplicateEmployeeException {
        System.out.println("Enter Category ->(FrontDesk/houseKeeping/Maintainance/KitchennStaff)");
        String category = sc.nextLine();
        System.out.println("Enter Employee Id");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Employee name");
        String name = sc.nextLine();
        System.out.println("Enter Employee Salary");
        double salary = sc.nextDouble();
        if (!employees.containsKey(id)) {
            if (category.equals("FrontDesk")) {
                employees.put(id, new FrontDesk(id, name, salary));
            } else if (category.equals("HouseKeeping")) {
                employees.put(id, new HouseKeeping(id, name, salary));
            } else if (category.equals("Maintenance")) {
                employees.put(id, new Maintenance(id, name, salary));
            } else if (category.equals("KitchenStaff")) {
                employees.put(id, new KitchenStaff(id, name, salary));
            }
        } else {
            throw new DuplicateEmployeeException();
        }
        System.out.println("New Employee Hired");
    }

    private static void assignTask() throws InvalidTaskAssignmentException {
        System.out.println("Enter Employee Id");
        int id = sc.nextInt();
        if(employees.containsKey(id)) {
            employees.get(id).doWork();
        } else {
            throw new InvalidTaskAssignmentException();
        }
        System.out.println("Task Done");
    }
    static void fireEmployee(){
        System.out.println("Enter Employee Id");
        int id = sc.nextInt();
        employees.remove(id);
        System.out.println("Employee Fired !!!");

    }
    static void updateEmployee(HotelManagementSystem management){
        System.out.println("Enter Employee Id");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Employee name");
        String name = sc.nextLine();
        System.out.println("Enter Employee Salary");
        double salary = sc.nextDouble();
        employees.get(id).setEmployeeName(name);
        employees.get(id).setSalary(salary);
        System.out.println("Details Updated");
        
    }

    public static void main(String[] args) {
        HotelManagementSystem management = new HotelManagementSystem();
        while (true) {
            System.out.println("-----------------------------");
            System.out.println("Hotel Management System");
            System.out.println("-----------------------------");
            System.out.println("1. Hire Staff");
            System.out.println("2. Assign Task");
            System.out.println("3. Update Employee Details");
            System.out.println("4. Fire Employee");
            System.out.println("5. Exit");
            System.out.println("-----------------------------");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    try {
                        hireEmployee();
                    } catch (DuplicateEmployeeException e) {
                        System.out.println("Duplicate Employee Not Accepted !!!!!");
                    }
                    break;
                case 2 :
                    try {
                        assignTask();
                    } catch (InvalidTaskAssignmentException e) {
                        System.out.println("You cant assign the task to this employee");
                    }
                    break;
                case 3:
                    updateEmployee(management);
                    break;
                case 4:
                    fireEmployee();
                    break;
                case 5:
                    System.out.println("Exiting the system.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }


}
