package com.libraryAutomation.stepDefinitions;


import com.libraryAutomation.pages.LandingPage;
import com.libraryAutomation.pages.LoginPage;
import com.libraryAutomation.pages.PageBase;
import com.libraryAutomation.utilities.BrowserUtils;
import com.libraryAutomation.utilities.ConfigurationReader;
import com.libraryAutomation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Logout_StepDefinition extends PageBase {
    LoginPage loginPage = new LoginPage();
    LandingPage landingPage = new LandingPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("the student login with {string} and {string}")
    public void the_student_login_with_and(String userName, String passWord) {
        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty(userName));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty(passWord));
        loginPage.signInButton.click();
    }


    @Given("books is student in the student page")
    public void books_is_student_in_the_student_page() {
        //BrowserUtils.sleep(3);
        //  booksPageLink.isDisplayed();
        wait.until(ExpectedConditions.urlContains("books"));
        String expectedUrl = "http://library2.cybertekschool.com/#books";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.equals(expectedUrl));

    }

    @Given("the librarian login with {string} and {string}")
    public void the_librarian_login_with_and(String userName, String passWord) {
        loginPage.usernameInput.sendKeys(userName);
        loginPage.passwordInput.sendKeys(passWord);
        loginPage.signInButton.click();
    }


    @Given("user should see the Dashboard  in the  page")
    public void user_should_see_the_dashboard_in_the_page() {
        wait.until(ExpectedConditions.urlContains("dashboard"));
        // BrowserUtils.sleep(3);
        //  dashboardPageLink.isDisplayed();
        String expectedUrl = "http://library2.cybertekschool.com/#dashboard";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.equals(expectedUrl));
    }




    @Given("the user login with {string} and {string}")
    public void theUserLoginWithAnd(String useName, String passWord) {


        loginPage.usernameInput.sendKeys(useName);
        loginPage.passwordInput.sendKeys(passWord);
        loginPage.signInButton.click();
    }

    @When("user click the logout button")
    public void user_Click_The_Logout_Button() {
        BrowserUtils.sleep(2);
        landingPage.logoutDropdown.click();
        BrowserUtils.sleep(1);
        landingPage.logOutButton.click();

    }

    @Then("user should be able to logout")
    public void user_Should_Be_Able_To_Logout() {
        wait.until(ExpectedConditions.urlContains("login"));
        String expectedUrl = "http://library2.cybertekschool.com/login.html";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        
    }



}
