package Question5;

public class Student {
    private int studentId;
    private String name;
    private static int totalStudents=0;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        totalStudents++;
    }

    public void enroll(){
        System.out.println(name + " is Enrolled");
    }

    public void drop(){
        System.out.println(name + " is Dropped");
        totalStudents--;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }
}
