package E2E.steps.javascriptAlerts;

import E2E.runner.TestRunner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class JavascriptAlertSteps {
//    ------------------- Alert Box --------------------------------
    @Given("the developer is on the javascript alert demo selenium easy website")
    public void theDeveloperIsOnTheJavascriptAlertDemoSeleniumEasyWebsite() {
        TestRunner.driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
    }

    @When("the developer clicks on the button to display an alert box")
    public void theDeveloperClicksOnTheButtonToDisplayAnAlertBox() {
        TestRunner.javascriptAlertsPage.alertTriggerButton.click();
    }

    @Then("a javascript alert should pop up at the top of the page")
    public void aJavascriptAlertShouldPopUpAtTheTopOfThePage() {
        Alert alert = TestRunner.explicitWait.until(ExpectedConditions.alertIsPresent());
        Assert.assertEquals("I am an alert box!", alert.getText());
    }

    @And("the alert is closed")
    public void theAlertIsClosed() {
        Alert alert = TestRunner.explicitWait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }

//    ------------------- Confirm Box --------------------------------


    @When("the developer clicks on the button to display a confirm alert")
    public void theDeveloperClicksOnTheButtonToDisplayAConfirmAlert() {
        TestRunner.javascriptAlertsPage.confirmTriggerButton.click();
    }

    @And("the developer clicks the ok button")
    public void theDeveloperClicksTheOkButton() {
        TestRunner.explicitWait.until(ExpectedConditions.alertIsPresent());
        Alert confirm = TestRunner.driver.switchTo().alert();
        confirm.accept();
    }

    @Then("a message should be display on the page")
    public void aMessageShouldBeDisplayOnThePage() {
        String message = TestRunner.javascriptAlertsPage.confirmSuccessMessage.getText();
        Assert.assertEquals("You pressed OK!", message);
    }

//    ------------------- Prompt Box --------------------------------

    @When("the developer clicks on the prompt box button")
    public void theDeveloperClicksOnThePromptBoxButton() {
        TestRunner.javascriptAlertsPage.promptTriggerButton.click();
    }

    @And("the developer enters a name")
    public void theDeveloperEntersAName() {
       Alert prompt = TestRunner.explicitWait.until(ExpectedConditions.alertIsPresent());
       prompt.sendKeys("Luke Skywalker Fuste");
    }

    @And("the developer clicks on the ok button")
    public void theDeveloperClicksOnTheOkButton() {
        Alert prompt = TestRunner.explicitWait.until(ExpectedConditions.alertIsPresent());
        prompt.accept();
    }

    @Then("the name should be displayed on the page")
    public void theNameShouldBeDisplayedOnThePage() {
        String message = TestRunner.javascriptAlertsPage.promptSuccessMessage.getText();
        Assert.assertEquals("You have entered 'Luke Skywalker Fuste' !", message);
    }

}
