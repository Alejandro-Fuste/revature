package E2E.poms.checkbox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxPOM {

    private WebDriver webDriver;

    public CheckboxPOM(WebDriver webDriver) {
        this.webDriver = webDriver;

        PageFactory.initElements(webDriver, this);
    }

    // ------------------- Single Checkbox Field --------------------------------

    @FindBy(id = "isAgeSelected")
    public WebElement singleCheckbox;

    @FindBy(id = "txtAge")
    public WebElement hiddenSuccessMessage;

    // ------------------- Multiple Checkbox Fields --------------------------------

    @FindBy(id = "check1")
    public WebElement checkboxButton;
}
