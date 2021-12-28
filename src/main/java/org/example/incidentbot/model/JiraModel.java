package org.example.incidentbot.model;


import java.net.URI;

public class JiraModel {

    public JiraModel(String project, String userName, URI server, String description, String assignee, Long issueType, String summary, String password) {
        this.issueType = issueType;
        this.assignee = assignee;
        this.summary = summary;
        this.project = project;
        this.userName = userName;
        this.description = description;
        this.server = server;
        this.password=password;
    }


    private String project;
    private String userName;
    private String description;
    private Long issueType;
    private String assignee;
    private String summary;
    private URI server;
    private String password;

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getIssueType() {
        return issueType;
    }

    public void setIssueType(Long issueType) {
        this.issueType = issueType;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public URI getServer() {
        return server;
    }

    public void setServer(URI server) {
        this.server = server;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}