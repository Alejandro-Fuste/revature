package E2E.poms.simpleInput;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimpleInputPOM {

    private WebDriver webDriver;

    public SimpleInputPOM(WebDriver webDriver) {
        this.webDriver = webDriver;

        PageFactory.initElements(webDriver, this);
    }

    @FindBy(id = "at-cv-lightbox-close")
    public WebElement popUpWindowCloseAnchorTag;

    // ------------------- Single Input Field --------------------------------

    @FindBy(id = "user-message")
    public WebElement messageInput;

    @FindBy(xpath = "//*[@id=\"get-input\"]/button")
    public WebElement showMessageButton;

    @FindBy(id = "display")
    public WebElement displayMessageSpan;

    // ------------------- Two Input Fields --------------------------------

    @FindBy(id = "sum1")
    public WebElement inputA;

    @FindBy(id = "sum2")
    public WebElement inputB;

    @FindBy(xpath = "//*[@id=\"gettotal\"]/button")
    public WebElement getTotalButton;

    @FindBy(id = "displayvalue")
    public WebElement displayValueSpan;

}
