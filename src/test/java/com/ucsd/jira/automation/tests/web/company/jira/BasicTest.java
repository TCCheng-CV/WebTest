package com.ucsd.jira.automation.tests.web.company.jira;

import com.pwc.core.framework.annotations.Issue;
import com.pwc.core.framework.listeners.Retry;
import com.ucsd.jira.automation.data.Constants;
import com.ucsd.jira.automation.data.enums.LeftMenu;
import com.ucsd.jira.automation.frameworksupport.Groups;
import com.ucsd.jira.automation.frameworksupport.JiraTestCase;
import org.testng.annotations.Test;

import static com.pwc.logging.service.LoggerService.FEATURE;
import static com.pwc.logging.service.LoggerService.GIVEN;
import static com.pwc.logging.service.LoggerService.SCENARIO;
import static com.pwc.logging.service.LoggerService.THEN;
import static com.pwc.logging.service.LoggerService.WHEN;
import static com.ucsd.jira.automation.data.Constants.DASHBOARD_DIV;


public class BasicTest extends JiraTestCase {

//    private static final String DASHBOARD_DIV = ;
//    private static final String DASHER_DIV = ;

    @Override
    public void beforeMethod() {
    }

    @Override
    public void afterMethod() {
    }

    @Issue("STORY-1234")
    @Test(retryAnalyzer = Retry.class, groups = {Groups.ACCEPTANCE_TEST})
    public void testBasic() {

        FEATURE("Basic Jira Test sneak developer");
        SCENARIO("User logs in and validates basic navigation functionality");

        GIVEN("I am a valid user");
        webElementVisible(Constants.NEW_TEST_HEADING);

        WHEN("I navigate with the left menu");
        webAction(Constants.ISSUES_AND_FILTERS_DIV);
        redirect(Constants.HOME_URL);

        THEN("The expected pages are displayed");
        webAction(DASHBOARD_DIV );

        redirect(Constants.HOME_URL);

    }

}
