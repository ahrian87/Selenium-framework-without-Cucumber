import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasicExamplesPage {

    @FindBy(css="a[href='./basic-first-form-demo.html'][class='list-group-item']")
    private WebElement simpleFormDemoButton;

    @FindBy(css="a[href='./basic-checkbox-demo.html'][class='list-group-item']")
    private WebElement checkBoxDemoButton;

    @FindBy(css="a[href='./basic-radiobutton-demo.html'][class='list-group-item']")
    private WebElement radioButtonsDemoButton;

    @FindBy(css="a[href='./basic-select-dropdown-demo.html'][class='list-group-item']")
    private WebElement selectDropdownListButton;

    @FindBy(css="a[href='./javascript-alert-box-demo.html'][class='list-group-item']")
    private WebElement javascriptAlertsButton;

    @FindBy(css="a[href='./window-popup-modal-demo.html'][class='list-group-item']")
    private WebElement windowPopupModalButton;

    @FindBy(css="a[href='./boostrap-alert-messages-demo.html'][class='list-group-item']")
    private WebElement bootstrapAlertsButton;

    @FindBy(css="a[href='./bootstrap-modal-demo.html'][class='list-group-item']")
    private WebElement bootstrapModalsButton;

    private WebDriver driver;

    public BasicExamplesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSimpleFormDemoButton() {
        simpleFormDemoButton.click();
    }

    public void clickCheckBoxDemoButton() {
        checkBoxDemoButton.click();
    }

    public void clickRadioButtonsDemoButton() {
        radioButtonsDemoButton.click();
    }

    public void clickSelectDropdownListButton() {
        selectDropdownListButton.click();
    }

    public void clickJavascriptAlertsButton() {
        javascriptAlertsButton.click();
    }

    public void clickWindowPopupModalButton() {
        windowPopupModalButton.click();
    }

    public void clickBootstrapAlertsButton() {
        bootstrapAlertsButton.click();
    }

    public void clickBootstrapModalsButton() {
        bootstrapModalsButton.click();
    }
}
