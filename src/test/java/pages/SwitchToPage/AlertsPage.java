package pages.SwitchToPage;


import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;



public class AlertsPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(AlertsPage.class);
    public static AlertsPage instance;


    private By alertBox = By.xpath("//button[@class='btn btn-danger']");
    private By confirmBoxTab = By.xpath("//a[@href='#CancelTab']");
    private By confirmBoxBtn = By.xpath("//button[@class='btn btn-primary']");
    private By textBoxTab = By.xpath("//a[@href='#Textbox']");
    private By textBoxBtn = By.xpath("//button[@class='btn btn-info']");


    private AlertsPage() {
    }

    public static AlertsPage getInstance() {
        if (instance == null) {
            instance = new AlertsPage();
        }
        return instance;
    }

    public void clickAlertBox() {
        LOG.info("Click alert box button");
        driver.findElement(alertBox).click();
        driver.switchTo().alert().accept();
        sleep(2000);
    }

    public void clickConfirmBox() {
        LOG.info("Click alert box button");
        driver.findElement(confirmBoxTab).click();
        driver.findElement(confirmBoxBtn).click();
        driver.switchTo().alert().accept();
        sleep(2000);
        driver.findElement(confirmBoxBtn).click();
        driver.switchTo().alert().dismiss();
        sleep(2000);
    }

    public void clickTextBox() {
        LOG.info("Click text box button");
        driver.findElement(textBoxTab).click();
        driver.findElement(textBoxBtn).click();
        driver.switchTo().alert().sendKeys("Andrei");
        driver.switchTo().alert().accept();
        sleep(2000);
        driver.findElement(textBoxBtn).click();
        driver.switchTo().alert().sendKeys("Andrei");
        sleep(2000);
        driver.switchTo().alert().dismiss();
        sleep(2000);
    }
}
