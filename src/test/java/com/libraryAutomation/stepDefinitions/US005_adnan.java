package com.libraryAutomation.stepDefinitions;

import com.libraryAutomation.pages.LandingPage;
import com.libraryAutomation.pages.LoginPage;
import com.libraryAutomation.pages.UsersPage;
import com.libraryAutomation.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class US005_adnan {

    LoginPage loginPage = new LoginPage();
    UsersPage usersPage = new UsersPage();
    LandingPage landingPage = new LandingPage();
    Select select;

    @Given("i am on the login page and i login as a librarian")
    public void iAmOnTheLoginPageAndILoginAsALibrarian() {
        loginPage.loginAsLibrary();
    }


    @When("i click on {string} link")
    // If you want to click below options just change the link text from feature file
    public void i_click_on_link(String link) {
        switch (link.toLowerCase()) {

            case "dashboard":
                landingPage.usersPageLink.click();
                break;
            case "users":
                landingPage.usersPageLink.click();
                break;
            case "books":
                landingPage.usersPageLink.click();
                break;

        }

    }

    @Then("default record should be {int}")
    // verify default value as 10.If your requirement is changed then you can just change the value (10) from feature file
    public void default_record_should_be(Integer defaultRecord) {
        select = new Select(usersPage.showRecordsDropdown);

        int actualDefaultRecord = Integer.parseInt(select.getFirstSelectedOption().getText());

        Assert.assertTrue(actualDefaultRecord == defaultRecord);

    }

    @Then("record dropdown should have these options")
    public void record_dropdown_should_have_these_options(List<String> allRecordOptions) {

        select = new Select(usersPage.showRecordsDropdown);
        List<String> actualAllRecordOptions = BrowserUtils.convertWebElementToString_andGetText(select.getOptions());

        Assert.assertEquals(actualAllRecordOptions, allRecordOptions);
    }

}
