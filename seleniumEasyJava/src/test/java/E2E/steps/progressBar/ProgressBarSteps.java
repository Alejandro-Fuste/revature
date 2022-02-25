package E2E.steps.progressBar;

import E2E.runner.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProgressBarSteps {
    @Given("the developer is on the progress bar demo selenium easy website")
    public void theDeveloperIsOnTheProgressBarDemoSeleniumEasyWebsite() {
        TestRunner.driver.get("https://demo.seleniumeasy.com/bootstrap-download-progress-demo.html");
    }

    @When("the developer clicks on the download button")
    public void theDeveloperClicksOnTheDownloadButton() {
//        TestRunner.
    }

    @Then("the developer will see a 100% percentage on the page when the download completes")
    public void theDeveloperWillSeeA100Percentage() {

    }


}
