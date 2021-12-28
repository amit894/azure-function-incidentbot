package org.example.incidentbot.services;

import org.example.incidentbot.model.JiraModel;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.net.URI;

public class JiraService {

    private List<JiraModel> tasks = new ArrayList<>();

    public List<JiraModel> createIssue() throws URISyntaxException {
        String myUrl = "https://amit894.atlassian.net/";
        URI uri = new URI(myUrl);

        List<JiraModel> list = new ArrayList<>();
        list.add(new JiraModel("MB", "amit.894@gmail.com", uri,"Yes this is JIRA", "amitraj", "Task","Third Issue", "password" ));
        this.tasks.addAll(list);
        return this.tasks;

    }



}