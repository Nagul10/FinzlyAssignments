package schoolmanagementsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SchoolManagementSystem {
    static Scanner sc = new Scanner(System.in);
    static List<Student> students = new ArrayList<>();
    static List<Teacher> teachers = new ArrayList<>();

    public static void main(String[] args) {
        boolean flag = true;
        while (flag){
            System.out.println("-----------------------------------");
            System.out.println("School Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. Display Student Details");
            System.out.println("4. Display Teacher Details");
            System.out.println("5. Exit");
            System.out.println("-----------------------------------");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1 :
                    addStudent();
                    break;
                case 2 :
                    addTeacher();
                    break;
                case 3 :
                    displayStudentDetails();
                    break;
                case 4 :
                    displayTeacherDetails();
                    break;
                case 5 :
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice !!!");
            }
        }
    }

    private static void displayTeacherDetails() {
        for (Teacher teacher:teachers){
            System.out.println(teacher.toString());
        }

    }

    private static void displayStudentDetails() {
        for (Student student:students){
            System.out.println(student.toString());
        }
    }

    private static void addTeacher() {
        System.out.println("Enter Teacher ID");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Teacher Name");
        String name = sc.nextLine();
        System.out.println("Enter Age");
        int age = sc.nextInt();
        teachers.add(new Teacher(id,name,age));
    }

    private static void addStudent() {
        System.out.println("Enter Student ID");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Student Name");
        String name = sc.nextLine();
        System.out.println("Enter Age");
        int age = sc.nextInt();
        students.add(new Student(id,name,age));
    }
}
