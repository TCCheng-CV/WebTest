package com.ucsd.jira.automation.data;

public final class Constants {

    // Application Defaults
    public static final byte[] SECURITY_KEY = {0x74, 0x68, 0x69, 0x73, 0x49, 0x73, 0x41, 0x53, 0x65, 0x63, 0x72, 0x65, 0x74, 0x4b, 0x65, 0x79};
    public static final int MAX_WEB_SERVICE_RESPONSE_TIME = 3000;

    // COMMON URLs
    public static final String HOME_URL = "/MyJiraHome.jspa";

    // HEADING Elements
    public static final String LOGO_HEADING = "//h1[@id='logo']";
    public static final String TEST_HEADING = "//h1[contains(text(),'test')]";
    public static final String NEW_TEST_HEADING = "//*[@id=\"dashboard-content\"]/div[1]/div/div[1]/h1";

    // ANCHOR Elements
    public static final String FIRST_PROJECTS_ANCHOR = "//img[contains(@src, 'projectavatar')]/following-sibling::a";

    // INPUT Elements
    public static final String USERNAME_INPUT = "//input[@id='username']";
    public static final String PASSWORD_INPUT = "//input[@id='password']";
    public static final String BASIC_SEARCH_INPUT = "//input[@type='text' and @placeholder='Search']";

    // BUTTON Elements
    public static final String ADVANCED_SEARCH_TEXTAREA = "advanced-search";

    // HEADING Elements
    public static final String VARIABLE_BY_TEXT_HEADING = "//h1[text()='%s']";

    // SPAN Elements
    public static final String VARIABLE_BY_LABEL_SPAN = "//span[contains(@aria-label, '%s')]";
    public static final String VARIABLE_BY_TEXT_SPAN = "//span[text()='%s']";
    public static final String CONTINUE_SPAN = "Continue";
    public static final String LOGIN_SPAN = "Log in";
    public static final String CLOSE_MENU_EXPAND_SPAN = "//span[@aria-label='Close']";
    public static final String VIEW_ALL_MATCHING_ISSUES_SPAN = "//span[text()='View all matching issues']";

    // STATIC Text
    public static final String NO_RECORDS_FOUND_TEXT = "No records found, try new search criteria.";
    public static final String SUMMARY_TEXT = "Summary Issue for JIRA";
    public static final String DESCRIPTION_TEXT = "Description of the issue in JIRA";

    //DIV Elements
    public static final String VARIABLE_BY_TEXT_DIV = "//div[text()='%s']";
    public static final String ISSUES_SEARCH_PREVIEW_DIV = "//div[@aria-label='Issues']";
    public static final String BOARDS_SEARCH_PREVIEW_DIV = "//div[@aria-label='Boards']";
    public static final String PROJECTS_SEARCH_PREVIEW_DIV = "//div[@aria-label='Projects']";

    public static final String ISSUES_AND_FILTERS_DIV = "/html/body/div[1]/div/div[1]/div/div/div[2]/div[1]/div[1]/div[2]/div/div/div[2]/div/div/div/div[5]/a/div[2]/div";
    public static final String DASHBOARD_DIV = "/html/body/div[1]/div/div[1]/div/div/div[2]/div[1]/div[1]/div[2]/div/div/div[2]/div/div/div/div[2]/a/div[2]/div";
    public static final String PROJECTS_DIV = "//*[@id=\'jira-frontend\']/div[1]/div[1]/div[1]/div[2]/div/div/div[2]/div/div/div/div[2]/a/div[2]/div";

    public static final String CREATE_ISSUE_BUTTON = "//*[@id='createGlobalItem']";
    public static final String SUMMARY_INPUT = "//*[@id='summary']";
    public static final String CREATE_BUTTON = "//*[@id=\'create-issue-submit\']";
    public static final String DESCRIPTION_TEXTAREA = "//*[@id=\'description\']";

    public static final String ISSUE_FILTER_BUTTON = "//*[@id=\"helpPanelContainer\"]/div/div[2]/div[1]/div[1]/div[2]/div/div/div[2]/div/div/div/div[5]/a";
    public static final String CREATE_RECENTLY_BUTTON = "/html/body/div[1]/div/div[1]/div/div/div[2]/div[1]/div[1]/div[2]/div/div/div[2]/div/div/div/div[10]/a/div/div";

    public static final String SEARCH_QUERY_TEXTAREA = "//*[@id=\'searcher-query\']";

    public static final String INITIATE_SEARCH = "//*[@id=\'global-issue-navigator-container\']/div[2]/div/form/div[1]/div[1]/div[1]/div[1]/div/div[1]/ul/li[7]/button";
    //*[@id="aui-flag-container"]/div/div/a
//*[@id="global-issue-navigator-container"]/div[2]/div/form/div[1]/div[1]/div[1]/div[1]/div/div[1]/ul/li[7]/button
//*[@id="global-issue-navigator-container"]/div[2]/div/div/div/div/div/div/div/div
    public static final String SEARCH_ID_INPUT = "//*[@id='jira']/div[9]/div[2]/div[4]/div/div[2]/div/div/div/div[1]/div/div/input";
    public static final String SEARCH_ISSUE_SPAN = "//*[@id='jira']/div[9]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/a/span[2]/span[1]";
    private Constants() {
    }

}
