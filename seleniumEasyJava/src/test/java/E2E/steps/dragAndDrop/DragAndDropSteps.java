package E2E.steps.dragAndDrop;
import E2E.runner.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DragAndDropSteps {

        @Given("the developer is on the drag and drop demo selenium easy website")
        public void theDeveloperIsOnTheDragAndDropCheckboxDemoSeleniumEasyWebsite() {
            TestRunner.driver.get("https://demo.seleniumeasy.com/drag-and-drop-demo.html");
        };

        @When("the developer clicks, drags, and drops the box in the drop zone")
        public void theDeveloperClicksDragsAndDropsTheBoxInTheDropZone() {
            TestRunner.action.clickAndHold(TestRunner.dragAndDropPage.draggable1)
                    .moveToElement(TestRunner.dragAndDropPage.dropZone)
                    .release(TestRunner.dragAndDropPage.dropZone)
                    .build();
        }


        @Then("the box gets added to the items list")
        public void theBoxGetsAddedToTheItemsList() {
            WebElement dropped = TestRunner.dragAndDropPage.droppedListDiv.findElement(By.xpath("//span[text()='Draggable 1']"));
            Assert.assertEquals("Draggable 1", dropped.getText());
        };



}
