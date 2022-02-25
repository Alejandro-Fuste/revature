package E2E.steps.dynamicData;

import E2E.runner.TestRunner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class dynamicDataSteps {
    @Given("the developer is on the dynamic data demo selenium easy website")
    public void theDeveloperIsOnTheDynamicDataDemoSeleniumEasyWebsite() {
        TestRunner.driver.get("https://demo.seleniumeasy.com/dynamic-data-loading-demo.html");
    }

    @When("the developer clicks on get new user button")
    public void theDeveloperClicksOnGetNewUserButton() {
        TestRunner.dynamicDataPage.getNewUserButton.click();
    }

    @Then("a profile picture will be present on the page")
    public void aProfilePictureWillBePresentOnThePage() {
        boolean imageElement = TestRunner.explicitWait.until(ExpectedConditions.attributeToBeNotEmpty(
                TestRunner.dynamicDataPage.profileImage, "src"));
        Assert.assertTrue(imageElement);
    }

    @And("a name will be present on the page")
    public void aNameWillBePresentOnThePage() {
        WebElement nameElement = TestRunner.explicitWait.until(ExpectedConditions.visibilityOf(
                TestRunner.dynamicDataPage.name));
        String elementText = nameElement.getText();
        Assert.assertTrue(elementText.length() > 25);
    }
}
