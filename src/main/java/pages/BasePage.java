package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BasePage {
    public WebDriver driver;


    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }



}