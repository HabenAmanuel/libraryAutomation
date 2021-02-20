package com.libraryAutomation.stepDefinitions;

import com.libraryAutomation.pages.LoginPage;
import com.libraryAutomation.utilities.ConfigurationReader;
import com.libraryAutomation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Login_StepDefinitions {

    LoginPage loginPage= new LoginPage();
    WebDriver driver= Driver.getDriver();
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
   driver.get(ConfigurationReader.getProperty("url"));

    }




    @When("I login as a librarian")
    public void i_login_as_a_librarian() {
    loginPage.loginAsLibrary();
    }
    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {

    }




    @Given("I am on the login page")
    public void i_am_on_the_login_page() {

    }




    @When("I login as a students")
    public void i_login_as_a_students() {

    }
    @Then("books should be displayed")
    public void books_should_be_displayed() {

    }

}
