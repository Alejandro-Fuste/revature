package E2E.poms.dragAndDrop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDropPOM {
    private WebDriver driver;

    public DragAndDropPOM(WebDriver driver){
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    // ------------------- Elements --------------------------------
    @FindBy(xpath = "//span[text()='Draggable 1']")
    public WebElement draggable1;

    @FindBy(id = "mydropzone")
    public WebElement dropZone;

    @FindBy(id = "droppedlist")
    public WebElement droppedListDiv;

}
