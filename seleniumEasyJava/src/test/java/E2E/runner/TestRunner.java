package E2E.runner;

import E2E.poms.simpleInput.SimpleInputPOM;
import E2E.poms.checkbox.CheckboxPOM;
import E2E.poms.jsAlerts.JavascriptAlertsPOM;
import E2E.poms.dynamicData.DynamicDataPOM;
import E2E.poms.progressBar.ProgressBarPOM;
import E2E.poms.dragAndDrop.DragAndDropPOM;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = "E2E.steps", tags = "@SingleTest", plugin = {"pretty",
        "html:src/test/resources/reports/html-reports.html"})

public class TestRunner {
    // declare variables
    public static WebDriver driver;
    public static WebDriverWait explicitWait;
    public static Wait fluentWait;
    public static Actions action;

    // POMS
    public static SimpleInputPOM simpleInputPage;
    public static CheckboxPOM checkboxPage;
    public static JavascriptAlertsPOM javascriptAlertsPage;
    public static DynamicDataPOM dynamicDataPage;
    public static ProgressBarPOM progressBarPage;
    public static DragAndDropPOM dragAndDropPage;

    @BeforeClass
    public static void setup() {
        File file = new File("src/test/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        driver = new ChromeDriver();
        driver.manage().window().maximize();


        // assign POMs
        simpleInputPage = new SimpleInputPOM(driver);
        checkboxPage = new CheckboxPOM(driver);
        javascriptAlertsPage = new JavascriptAlertsPOM(driver);
        dynamicDataPage = new DynamicDataPOM(driver);
        progressBarPage = new ProgressBarPOM(driver);
        dragAndDropPage = new DragAndDropPOM(driver);

        // Waits and Actions
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        explicitWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        action = new Actions(driver);
        System.out.println("Set up complete!");


    }

    @AfterClass
    public static void teardown(){
        driver.quit();
        System.out.println("teardown complete!");
    }
}
