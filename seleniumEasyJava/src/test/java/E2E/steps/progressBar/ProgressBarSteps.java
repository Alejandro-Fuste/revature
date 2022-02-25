package E2E.steps.progressBar;

import E2E.runner.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

import static E2E.runner.TestRunner.driver;

public class ProgressBarSteps {
    @Given("the developer is on the progress bar demo selenium easy website")
    public void theDeveloperIsOnTheProgressBarDemoSeleniumEasyWebsite() {
        driver.get("https://demo.seleniumeasy.com/bootstrap-download-progress-demo.html");
    }

    @When("the developer clicks on the download button")
    public void theDeveloperClicksOnTheDownloadButton() {
        TestRunner.progressBarPage.downloadButton.click();
    }

    @Then("the developer will see one-hundred percentage on the page when the download completes")
    public void theDeveloperWillSeeOneHundredPercentageOnThePageWhenTheDownloadCompletes() {
        boolean percentage = (boolean) TestRunner.fluentWait.until(ExpectedConditions.textToBePresentInElement(
            (TestRunner.progressBarPage.percentageText), "100%"));

        Assert.assertTrue(percentage);
    }
}
