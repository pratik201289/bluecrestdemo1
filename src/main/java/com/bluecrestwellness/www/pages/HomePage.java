package com.bluecrestwellness.www.pages;

import com.bluecrestwellness.www.browserfactory.ManageBrowser;
import com.bluecrestwellness.www.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage() {
        PageFactory.initElements(ManageBrowser.driver, this);
    }

    @CacheLookup
    @FindBy(id="onetrust-accept-btn-handler")
    WebElement acceptBtn;

    @CacheLookup
    @FindBy(xpath = "//*[@height='30']")
    WebElement ClosePopUP;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'About Us')]")
    WebElement aboutUsbtn;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'About Us')]")
    WebElement verifyAboutUsText;

    public void clickOnAcceptBtn() throws InterruptedException {
        Reporter.log("Clicking on Accept link " + acceptBtn.getText() + "<br>");
        clickOnElement(acceptBtn);
        log.info("Click on Accept Cookies : " + acceptBtn.toString());
        Thread.sleep(2000);
    }
    public void clickOnClosePopUP() {
        Reporter.log("Clicking on Close Popup link " + ClosePopUP.getText() + "<br>");
        clickOnElement(ClosePopUP);
        log.info("Click on Close Popup Link : " + ClosePopUP.toString());

    }
    public void clickOnAboutUsBtn() throws InterruptedException {
        Reporter.log("Clicking on AboutUs link " + aboutUsbtn.getText() + "<br>");
        clickOnElement(aboutUsbtn);
        log.info("Click on Accept AboutUs link : " + aboutUsbtn.toString());
        Thread.sleep(2000);
    }
    public String verifyAboutUsText() {
        Reporter.log("Verify About Text " + verifyAboutUsText.getText() + "<br>");
        log.info("Verify about text: " + verifyAboutUsText.toString());
        return getTextFromElement(verifyAboutUsText);
    }
}
