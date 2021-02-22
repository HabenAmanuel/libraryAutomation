package com.libraryAutomation.pages;

import com.libraryAutomation.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AddUserPage {
    public AddUserPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//div[@class='modal-body']")
    public WebElement addUserPagePupUp;

    @FindBy(xpath = " //div[@id='add_user_modal']")
    public WebElement addUser;

    @FindBy(xpath = "")
    public WebElement fullNameBox;

    @FindBy(css = "input[name='full_name'] ")
    public WebElement passwordBox;

    @FindBy(css = "input[name='email']")
    public WebElement emailBox;

  List< WebElement> userGroupDropdown=Driver.getDriver().findElements(By.xpath("/html//select[@id='user_group_id']"));

    List< WebElement> statusDropdown=Driver.getDriver().findElements(By.xpath("/html//select[@id='status']"));

   @FindBy(css = "[name='start_date']")
    public WebElement startDateBox;
   //I will create method for the calender control
   @FindBy(css = "[name='end_date']")
    public WebElement endDateBox;

   @FindBy(css = "textarea")
    public WebElement adressBox;

   @FindBy(css = ".btn.default")
    public WebElement closeButton;

   @FindBy(css = ".btn.btn-primary")
    public WebElement saveChangesButton;


}
