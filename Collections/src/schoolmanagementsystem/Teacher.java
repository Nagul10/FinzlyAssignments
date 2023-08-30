package schoolmanagementsystem;

public class Teacher {
    private int teacherId;
    private String teacherName;
    private int age;

    public Teacher() {
    }

    public Teacher(int teacherId, String teacherName, int age) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", studentName='" + teacherName + '\'' +
                ", age=" + age +
                '}';
    }

    public int getTeacherId() {
        return teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public int getAge() {
        return age;
    }
}
