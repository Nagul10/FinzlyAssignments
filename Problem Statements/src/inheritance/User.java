package inheritance;

public class User {
    public static void main(String[] args) {
        Developer developer = new Developer(1001,"Nagul","Java");
        developer.getDetails();

        Manager manager = new Manager(2001,"Ethan","HR");
        manager.getDetails();
    }
}
