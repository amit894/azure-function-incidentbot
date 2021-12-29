package org.example.incidentbot.services;

import com.atlassian.jira.rest.client.api.domain.BasicIssue;
import org.example.incidentbot.model.JiraModel;

import java.net.URISyntaxException;
import java.net.URI;
import com.atlassian.jira.rest.client.api.JiraRestClient;
import com.atlassian.jira.rest.client.api.domain.input.IssueInput;
import com.atlassian.jira.rest.client.api.domain.input.IssueInputBuilder;
import com.atlassian.jira.rest.client.internal.async.AsynchronousJiraRestClientFactory;


public class JiraService {

    public String createIssue() throws URISyntaxException {
        String myUrl = "https://amit894.atlassian.net/";
        URI uri = new URI(myUrl);
        String password=System.getProperty("JIRA_PASSWORD");
        JiraModel J1 = new JiraModel("MB", "amit.894@gmail.com", uri,"404 Resource not found", "amitraj", "10001","JIRA Issue from Azure Alert", password );
        final AsynchronousJiraRestClientFactory factory = new AsynchronousJiraRestClientFactory();
        final JiraRestClient restClient = factory.createWithBasicHttpAuthentication( J1.getServer(), J1.getUserName(), J1.getPassword());
        IssueInputBuilder builder = new IssueInputBuilder();
        final IssueInput issueInput = builder.build();
        builder.setProjectKey(J1.getProject())
                .setDescription(J1.getDescription())
                .setIssueTypeId(Long.valueOf(J1.getIssueType()))
                .setSummary(J1.getSummary());

        try {
            final BasicIssue issue=restClient.getIssueClient().createIssue(issueInput).claim();
            String response = "JIRA ID created"+ String.valueOf((issue.getId()));
            return response;
        } catch (Exception e) {
            return (e.getMessage());
        }

    }

}