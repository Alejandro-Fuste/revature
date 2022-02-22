package E2E.steps.javascriptAlerts;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JavascriptAlertSteps {
//    ------------------- Alert Box --------------------------------
    @Given("the developer is on the javascript alert demo selenium easy website")
    public void theDeveloperIsOnTheJavascriptAlertDemoSeleniumEasyWebsite() {
    }

    @When("the developer clicks on the button to display an alert box")
    public void theDeveloperClicksOnTheButtonToDisplayAnAlertBox() {
    }

    @Then("a javascript alert should pop up at the top of the page")
    public void aJavascriptAlertShouldPopUpAtTheTopOfThePage() {
    }

//    ------------------- Confirm Box --------------------------------

    @And("the previous alert is closed")
    public void thePreviousAlertIsClosed() {
    }

    @When("the developer clicks on the button to display a confirm alert")
    public void theDeveloperClicksOnTheButtonToDisplayAConfirmAlert() {
    }

    @And("the developer clicks the ok button")
    public void theDeveloperClicksTheOkButton() {
    }

    @Then("a message should be display on the page")
    public void aMessageShouldBeDisplayOnThePage() {
    }

//    ------------------- Prompt Box --------------------------------

    @When("the developer clicks on the prompt box button")
    public void theDeveloperClicksOnThePromptBoxButton() {
    }

    @And("the developer enters a name")
    public void theDeveloperEntersAName() {
    }

    @And("the developer clicks on the ok button")
    public void theDeveloperClicksOnTheOkButton() {
    }

    @Then("the name should be displayed on the page")
    public void theNameShouldBeDisplayedOnThePage() {
    }
}
