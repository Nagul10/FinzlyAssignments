package projectmanagementsystem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class ProjectManagementSystem {
    static Scanner sc = new Scanner(System.in);
    static Map<Integer,Project> projects = new HashMap<>();

    public static void main(String[] args) {
        boolean flag = true;
        while (flag){
            System.out.println("-----------------------------------");
            System.out.println("Project Management System");
            System.out.println("1. Add Project");
            System.out.println("2. Assign Team Member to Project");
            System.out.println("3. View Project Details");
            System.out.println("4. List All Projects");
            System.out.println("5. Exit");
            System.out.println("-----------------------------------");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1 :
                    addProject();
                    break;
                case 2 :
                    assignTeamToProject();
                    break;
                case 3 :
                    viewProjectDetails();
                    break;
                case 4 :
                    listAllProjects();
                    break;
                case 5 :
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice !!!");
            }
        }
    }

    private static void addProject() {
        System.out.println("Enter Project Id");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Project Name");
        String name =sc.nextLine();
        projects.put(id,new Project(id,name));
        System.out.println("Project Added");
    }

    private static void assignTeamToProject() {
        System.out.println("Enter Project Id");
        int id = sc.nextInt();
        sc.nextLine();
        if (projects.containsKey(id)){
            System.out.println("Enter Team Member Name ");
            String name = sc.nextLine();
            projects.get(id).addTeamMember(new TeamMember(name));
        }
    }

    private static void viewProjectDetails() {
        System.out.println("Enter Project Id");
        int id = sc.nextInt();
        if(projects.containsKey(id)){
            System.out.println(projects.get(id));
        } else {
            System.out.println("Project Not Found !!!");
        }
    }

    private static void listAllProjects() {
        for(int id : projects.keySet()){
            System.out.println(projects.get(id).toString());
        }
    }
}
