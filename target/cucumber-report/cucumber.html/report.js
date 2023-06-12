$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "HomePage Test",
  "description": "As user I want to verify the About Us Page",
  "id": "homepage-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5836445800,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User should navigate to about us page successfully",
  "description": "",
  "id": "homepage-test;user-should-navigate-to-about-us-page-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I click on accept link",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on close popup screen",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on about us link",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should navigate to about us page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.iClickOnAcceptLink()"
});
formatter.result({
  "duration": 3339389100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iClickOnClosePopupScreen()"
});
formatter.result({
  "duration": 3386324900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 26200,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iClickOnAboutUsLink()"
});
formatter.result({
  "duration": 2224662100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldNavigateToAboutUsPageSuccessfully()"
});
formatter.result({
  "duration": 39774200,
  "error_message": "org.junit.ComparisonFailure: THe Digital text is not displayed expected:\u003cAbout U[s]\u003e but was:\u003cAbout U[]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat com.bluecrestwellness.www.steps.HomePageSteps.iShouldNavigateToAboutUsPageSuccessfully(HomePageSteps.java:29)\r\n\tat ✽.Then I should navigate to about us page successfully(HomePage.feature:8)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1061500800,
  "status": "passed"
});
});