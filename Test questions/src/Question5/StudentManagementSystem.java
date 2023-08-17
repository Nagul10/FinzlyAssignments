package Question5;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Student student1 = new Student(101,"Nagul");
        Student student2 = new Student(102,"Ethan");
        Student student3 = new Student(103, "Hunt");
        student1.enroll();
        student2.enroll();
        student3.enroll();
        System.out.println("Total Students "+ Student.getTotalStudents());
        student3.drop();
        System.out.println("Total Students "+ Student.getTotalStudents());

    }
}
