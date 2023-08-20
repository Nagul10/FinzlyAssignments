package inheritance;

public class Developer extends Employee{
    private String programmingLanguage;

    public Developer(int id, String name, String programmingLanguage) {
        super(id, name);
        this.programmingLanguage = programmingLanguage;
    }

    public void getDetails(){
        System.out.println("Id   : "+getId());
        System.out.println("Name : "+getName());
        System.out.println("Programming Language : "+programmingLanguage);
    }
}
