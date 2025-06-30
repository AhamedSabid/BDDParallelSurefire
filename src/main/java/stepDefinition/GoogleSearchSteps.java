package stepDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BasePage;
import pages.GooglePage;

public class GoogleSearchSteps extends BasePage {

    private GooglePage GooglePage;

    @Given("I am on the Google homepage")
    public void iAmOnTheGooglePage() {
        //driver = new ChromeDriver();
        setUp();
        GooglePage = new GooglePage(driver);
        driver.get("https://demo.automationtesting.in/Register.html");

    }

    @When("I enter {string} into the search bar")
    public void iEnterIntoTheSearchBar(String keyword) {
        GooglePage.FirstNameInputBox.sendKeys(keyword);
        GooglePage.LastNameInputBox.sendKeys(keyword);
    }

    @And("I click the search button")
    public void iClickTheSearchButton() {
        // GooglePage.searchButton.click();
    }

    @Then("I should see search results related to {string}")
    public void iShouldSeeSearchResultsRelatedTo(String keyword) {
        // Add assertions to verify search results (e.g., check page title or result content)
        String pageTitle = driver.getTitle();
        if (!pageTitle.contains(keyword)) {
            throw new AssertionError("Search results do not match the keyword.");
        }
        driver.quit();
    }
}