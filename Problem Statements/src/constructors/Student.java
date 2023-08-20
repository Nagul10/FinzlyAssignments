package constructors;

import java.util.Random;

public class Student {
    private int studentId;
    private String name;
    private int age;

    Student(){
        this.studentId=new Random().nextInt(100);
        this.name="Unknown";
        this.age = 0;
    }
    public Student(String name, int age) {
        this.studentId = new Random().nextInt(100);
        this.name = name;
        this.age = age;
    }

    public void displayInfo(){
        System.out.println("Student ID : "+ studentId);
        System.out.println("Name       : "+name);
        System.out.println("Age        : "+ age);
    }
}
