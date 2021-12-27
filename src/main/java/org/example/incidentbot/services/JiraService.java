package org.example.incidentbot.services;

import org.example.incidentbot.model.JiraModel;

import java.util.ArrayList;
import java.util.List;

public class JiraService {

    private List<JiraModel> tasks = new ArrayList<>();

    public List<JiraModel> createIssue() {

        List<JiraModel> list = new ArrayList<>();
        list.add(new JiraModel("1", "Jira Issue", "This is an Jira Issue"));

        this.tasks.addAll(list);
        return this.tasks;

    }



}