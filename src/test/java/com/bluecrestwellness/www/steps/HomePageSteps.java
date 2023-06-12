package com.bluecrestwellness.www.steps;

import com.bluecrestwellness.www.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomePageSteps {
    @Given("^I click on accept link$")
    public void iClickOnAcceptLink() throws InterruptedException {
        new HomePage().clickOnAcceptBtn();
    }

    @When("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @And("^I click on about us link$")
    public void iClickOnAboutUsLink() throws InterruptedException {
        new HomePage().clickOnAboutUsBtn();
    }

    @Then("^I should navigate to about us page successfully$")
    public void iShouldNavigateToAboutUsPageSuccessfully() {
        String expected="About U";
        Assert.assertEquals("THe Digital text is not displayed",new HomePage().verifyAboutUsText(),expected);

    }


    @Given("^I click on close popup screen$")
    public void iClickOnClosePopupScreen()  {
        new HomePage().clickOnClosePopUP();
    }
}
