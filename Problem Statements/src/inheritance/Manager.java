package inheritance;

public class Manager extends Employee{
    private String department;

    public Manager(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    public void getDetails(){
        System.out.println("Id         : "+getId());
        System.out.println("Name       : "+getName());
        System.out.println("Department : "+department);
    }
}
