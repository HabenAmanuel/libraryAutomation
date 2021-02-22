package com.libraryAutomation.stepDefinitions;


import com.libraryAutomation.pages.LandingPage;
import com.libraryAutomation.pages.LoginPage;
import com.libraryAutomation.pages.PageBase;
import com.libraryAutomation.utilities.BrowserUtils;
import com.libraryAutomation.utilities.ConfigurationReader;
import com.libraryAutomation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Login_StepDefinition extends PageBase {
    LoginPage loginPage = new LoginPage();
    LandingPage landingPage = new LandingPage();

    @Given("the student login with {string} and {string}")
    public void the_student_login_with_and(String userName, String passWord) {
        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty(userName));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty(passWord));
        loginPage.signInButton.click();
    }


    @Then("the {string} on {string}")
    public void the_on(String expectedUser, String expectedPage) {
        BrowserUtils.sleep(3);


    }


    @Given("books is student in the student page")
    public void books_is_student_in_the_student_page() {
        BrowserUtils.sleep(3);
        booksPageLink.isDisplayed();
    }

    @Given("the librarin login with {string} and {string}")
    public void the_librarin_login_with_and(String userName, String passWord) {
        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty(userName));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty(passWord));
        loginPage.signInButton.click();
    }



    @Given("user should see the Dashboard  in the  page")
    public void user_should_see_the_dashboard_in_the_page() {
        BrowserUtils.sleep(3);
        dashboardPageLink.isDisplayed();
    }

}
