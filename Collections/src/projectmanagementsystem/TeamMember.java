package projectmanagementsystem;

public class TeamMember {
    private String name;

    public TeamMember() {
    }

    public TeamMember(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TeamMember{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

}
