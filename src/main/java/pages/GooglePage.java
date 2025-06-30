package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
    private WebDriver driver;

    // Locators


    @FindBy(xpath = "//input[@placeholder='First Name']")
    public WebElement FirstNameInputBox;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    public WebElement LastNameInputBox;

    @FindBy(name = "q")
    public WebElement searchBar;

    // Constructor
    public GooglePage(WebDriver driver) {
        //this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}