package org.example.incidentbot.model;

import com.atlassian.jira.rest.client.api.IssueRestClient;
import com.atlassian.jira.rest.client.api.JiraRestClient;
import com.atlassian.jira.rest.client.api.domain.BasicVotes;
import com.atlassian.jira.rest.client.api.domain.Comment;
import com.atlassian.jira.rest.client.api.domain.Issue;
import com.atlassian.jira.rest.client.api.domain.input.IssueInput;
import com.atlassian.jira.rest.client.api.domain.input.IssueInputBuilder;
import com.atlassian.jira.rest.client.internal.async.AsynchronousJiraRestClientFactory;

import java.net.URI;

public class JiraModel {

    public JiraModel(String project, String userName, URI server, String description, String assignee, String issueType, String summary, String password) {
        this.issueType = issueType;
        this.assignee = assignee;
        this.summary = summary;
        this.project = project;
        this.userName = userName;
        this.description = description;
        this.server = server;
        this.password=password;
    }

    private JiraRestClient getJiraRestClient() {
        return new AsynchronousJiraRestClientFactory()
                .createWithBasicHttpAuthentication(this.server, this.userName, this.password);
    }

    private String project;
    private String userName;
    private String description;
    private String issueType;
    private String assignee;
    private String summary;
    private URI server;
    private String password;
}