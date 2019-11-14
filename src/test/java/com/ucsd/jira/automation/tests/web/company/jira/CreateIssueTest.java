package com.ucsd.jira.automation.tests.web.company.jira;

import com.pwc.core.framework.annotations.Issue;
import com.pwc.core.framework.listeners.Retry;
import com.ucsd.jira.automation.data.Constants;
import com.ucsd.jira.automation.frameworksupport.Groups;
import com.ucsd.jira.automation.frameworksupport.JiraTestCase;
import com.ucsd.jira.automation.frameworksupport.type.JiraIssue;
import org.testng.annotations.Test;

import static com.pwc.assertion.AssertService.assertEquals;
import static com.pwc.logging.service.LoggerService.*;

public class CreateIssueTest extends JiraTestCase {    public static final String SEARCH_ID_INPUT = "//*[@id='jira']/div[9]/div[2]/div[4]/div/div[2]/div/div/div/div[1]/div/div/input";
    public static final String SEARCH_ISSUE_SPAN =  "//*[@id='jira']/div[9]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/a/span[2]/span[1]";

//    private static final String DASHBOARD_DIV = ;
//    private static final String DASHER_DIV = ;
@Override
    public void beforeMethod() {
    }

    @Override
    public void afterMethod() {
    }

    @Issue("STORY-1235")
    @Test(retryAnalyzer = Retry.class, groups = {Groups.ACCEPTANCE_TEST})
    public void testCreateIssue() {

        FEATURE("Create Jira Issue");
        SCENARIO("User logs in and create JIRA Issue");

        GIVEN("I am a valid user");
        webElementVisible(Constants.NEW_TEST_HEADING);

        WHEN("I navigate to the Global Item icon");
        webAction(Constants.CREATE_ISSUE_BUTTON);
     //   redirect(Constants.HOME_URL);

        THEN("Input Summary and Description of the Issue");
        String test_text = Constants.SUMMARY_TEXT + "_TC2019";
        webAction(Constants.SUMMARY_INPUT, test_text);
        webAction(Constants.DESCRIPTION_TEXTAREA, Constants.DESCRIPTION_TEXT);
        webAction(Constants.CREATE_BUTTON);

        redirect(Constants.HOME_URL);

        // Verify if the most recent JIRA is created
        SCENARIO("Use Issues and Filters to search JIRA");
        GIVEN("There is a known Summary to search");
        webAction(Constants.ISSUE_FILTER_BUTTON);

        WHEN("In the Created recently");
        webAction(Constants.CREATE_RECENTLY_BUTTON);

        THEN("Navigate to the Search using known string");
        webAction(Constants.SEARCH_QUERY_TEXTAREA, test_text);
        webAction(Constants.INITIATE_SEARCH);
        assertEquals("Verify text", test_text);
//
//        WHEN("I search for a Jira issue number");
//        JiraIssue jiraIssue = findRecentIssue(issueNumber);
//
//        THEN("The correct Jira issue was found or created");
//        assertEquals("Verify Issue Number", jiraIssue.getMetadata(), issueNumber);

        redirect(Constants.HOME_URL);

    }

}
