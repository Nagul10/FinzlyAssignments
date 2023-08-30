package projectmanagementsystem;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Project {
    private int projectId;
    private String projectName;
    private Set<TeamMember> teamMembers = new HashSet<>();
    public Project() {
    }

    public Project(int projectId, String projectName) {
        this.projectId = projectId;
        this.projectName = projectName;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", teamMembers=" + teamMembers +
                '}';
    }

    public int getProjectId() {
        return projectId;
    }


    public String getProjectName() {
        return projectName;
    }

    public Set<TeamMember> getTeamMembers() {
        return teamMembers;
    }


    public void addTeamMember(TeamMember teamMember) {
        teamMembers.add(teamMember);
    }
}
