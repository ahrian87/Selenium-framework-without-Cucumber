package page.objects;

import driver.manager.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private Logger logger = LogManager.getRootLogger();

    @FindBy(css="[class='page-title']")
    WebElement welcomeMessage;

    public LoginPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public String getWelcomeMessageTest() {
        return welcomeMessage.getText();
    }
}
