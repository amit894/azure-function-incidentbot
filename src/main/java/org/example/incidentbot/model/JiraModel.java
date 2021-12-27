package org.example.incidentbot.model;

public class JiraModel {

    public JiraModel(String project, String name, String description) {
        this.project = project;
        this.name = name;
        this.description = description;
    }

    private String project;
    private String name;
    private String description;
}