package E2E.steps.simpleInput;

import E2E.runner.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.junit.Assert;

public class SimpleFormSteps {
    // ------------------- Single Input Field --------------------------------

    @Given("the developer is on the demo selenium easy website")
    public void theDeveloperIsOnTheDemoSeleniumEasyWebsite() {
        TestRunner.driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
    }

    @When("the developer closes the pop-up advertisement")
    public void theDeveloperClosesThePopUpAdvertisement() {
        TestRunner.simpleInputPage.popUpWindowCloseAnchorTag.click();
    }

    @When("the developer enters a message into the input box")
    public void theDeveloperEntersAMessageIntoTheInputBox() {
        TestRunner.simpleInputPage.messageInput.sendKeys("I entered this message with Selenium.");

    }

    @When("the developer clicks on the show message button")
    public void theDeveloperClicksOnTheShowMessageButton() {
        TestRunner.simpleInputPage.showMessageButton.click();

    }

    @Then("the message typed in the input box will display on the page")
    public void theMessageTypedInTheInputBoxWillDisplayOnThePage() {
        TestRunner.explicitWait.until(ExpectedConditions.textToBePresentInElement(TestRunner.simpleInputPage
                .displayMessageSpan, "I entered this message with Selenium."));
        String message = TestRunner.simpleInputPage.displayMessageSpan.getText();
        Assert.assertEquals(message, "I entered this message with Selenium.");
    }

    // ------------------- Two Input Fields --------------------------------

    @When("the developer enters a value into the a input box")
    public void theDeveloperEntersAValueIntoTheAInputBox() {
        TestRunner.simpleInputPage.inputA.sendKeys("1");
    }

    @When("the developer enters a value into the b input box")
    public void theDeveloperEntersAValueIntoTheBInputBox() {
        TestRunner.simpleInputPage.inputB.sendKeys("1");
    }

    @When("the developer clicks on the total button")
    public void theDeveloperClicksOnTheTotalButton() {
        TestRunner.simpleInputPage.getTotalButton.click();
    }

    @Then("the total will display on the page")
    public void theTotalWillDisplayOnThePage() {
        TestRunner.explicitWait.until(ExpectedConditions.textToBePresentInElement(TestRunner.simpleInputPage
                .displayValueSpan, "2"));
        String message = TestRunner.simpleInputPage.displayValueSpan.getText();
        Assert.assertEquals(message, "2");
    }
}
