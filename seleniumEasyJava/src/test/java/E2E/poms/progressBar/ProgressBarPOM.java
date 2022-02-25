package E2E.poms.progressBar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProgressBarPOM {
    private WebDriver driver;

    public ProgressBarPOM(WebDriver driver){
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    // ------------------- Elements --------------------------------

    @FindBy(id = "cricle-btn")
    public WebElement downloadButton;

    @FindBy(className = "percenttext")
    public WebElement percentageText;
}
