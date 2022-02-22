package E2E.steps.checkbox;

import E2E.runner.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class CheckboxSteps {
    @Given("the developer is on the checkbox demo selenium easy website")
    public void theDeveloperIsOnTheCheckboxDemoSeleniumEasyWebsite() {
        TestRunner.driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }

//    ------------------- Single Checkbox --------------------------------
    @When("the developer clicks on single check box")
    public void theDeveloperClicksOnSingleCheckBox() {
        TestRunner.checkboxPage.singleCheckbox.click();
    }

    @Then("a success message pops up on the screen")
    public void aSuccessMessagePopsUpOnTheScreen() {
       boolean message = TestRunner.explicitWait.until(ExpectedConditions.textToBePresentInElement(
                TestRunner.checkboxPage.hiddenSuccessMessage, "Success - Check box is checked"));
        Assert.assertTrue(message);
    }

//    ------------------- Multiple Checkboxes --------------------------------

    @When("the developer clicks on the check all button")
    public void theDeveloperClicksOnTheCheckAllButton() {
        TestRunner.checkboxPage.checkboxButton.click();
    }

    @Then("all the checkboxes get checked")
    public void allTheCheckboxesGetChecked() {
        int checked = 0;
        List<WebElement> checkboxList = TestRunner.driver.findElements(By.className("cb1-element"));
        for(WebElement checkbox: checkboxList){
            if(checkbox.isSelected()){
                checked++;
            }
        }
        Assert.assertEquals(checked, checkboxList.size());
    }

}
