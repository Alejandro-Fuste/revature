package E2E.poms.dynamicData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicDataPOM {
    private WebDriver webDriver;

    public DynamicDataPOM(WebDriver webDriver){
        this.webDriver = webDriver;

        PageFactory.initElements(webDriver, this);
    }

    // ------------------- Get Random User --------------------------------

    @FindBy(id = "save")
    public WebElement getNewUserButton;

    @FindBy(xpath = "//*[contains(@src, 'https://randomuser.me/')]")
    public WebElement profileImage;

    @FindBy(id = "loading")
    public WebElement name;

}
