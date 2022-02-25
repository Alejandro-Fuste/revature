package E2E.poms.jsAlerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavascriptAlertsPOM {
    private WebDriver webDriver;

    public JavascriptAlertsPOM(WebDriver webDriver){
        this.webDriver = webDriver;

        PageFactory.initElements(webDriver, this);
    }

    // ------------------- Alert Box --------------------------------

    @FindBy(xpath = "//*[@id='easycont']/div/div[2]/div[1]/div[2]/button")
    public WebElement alertTriggerButton;

    // ------------------- Confirm Box --------------------------------

    @FindBy(xpath = "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")
    public WebElement confirmTriggerButton;

    @FindBy(id = "confirm-demo")
    public WebElement confirmSuccessMessage;

    // ------------------- Prompt Box --------------------------------

    @FindBy(xpath = "//button[@onclick=\"myPromptFunction()\"]")
    public WebElement promptTriggerButton;

    @FindBy(id = "prompt-demo")
    public WebElement promptSuccessMessage;



}
