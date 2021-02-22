package com.libraryAutomation.pages;

import com.libraryAutomation.utilities.BrowserUtils;
import com.libraryAutomation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class BooksPage extends PageBase {
    public BooksPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "book_categories")
    public WebElement selectBookCategories;

    @FindBy(xpath = "//table//tr//td[5]")
    public List<WebElement> listOfSelectedCategories;

    public List<String> getAllBookCategories() {
        List<String> categoriesText = new ArrayList<>();
        Select select = new Select(selectBookCategories);
        select.getOptions().forEach(p -> categoriesText.add(p.getText()));
        BrowserUtils.sleep(3);
        return categoriesText;
    }

    public void selectCategory(String string){
        Select select = new Select(selectBookCategories);
        select.selectByVisibleText(string);
        BrowserUtils.sleep(3);
    }

    public String getCategoryText() {
        String category = "";
        List<String> categories = new ArrayList<>();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfAllElements(listOfSelectedCategories));
        listOfSelectedCategories.forEach(p -> categories.add(p.getText()));
        for (int i = 0; i < categories.size(); i++) {
            if (categories.get(0).equals(categories.get(i)))
                category = categories.get(0);
        }
        return category;
    }

}
