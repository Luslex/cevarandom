package pages.SwitchToPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

import java.util.ArrayList;

public class WindowsPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(WindowsPage.class);
    public static WindowsPage instance;

    private By tabWindow = By.xpath("//a[@href='http://www.selenium.dev']");
    private By tabSeparate = By.xpath("//a[@href='#Seperate']");
    private By separateBtn = By.xpath("//button[@onclick='newwindow()']");
    private By tabMultiple = By.xpath("//a[@href='#Multiple']");
    private By multipleBtn = By.xpath("//button[@onclick='multiwindow()']");



    private WindowsPage() {
    }

    public static WindowsPage getInstance() {
        if (instance == null) {
            instance = new WindowsPage();
        }
        return instance;
    }

    public void clickNewTabWindow() {
        LOG.info("Click new tab window btn");
        driver.findElement(tabWindow).click();
        sleep(2000);
        ArrayList<String> switchTabs= new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(switchTabs.get(1));
        driver.close();
        driver.switchTo().window(switchTabs.get(0));
        sleep(2000);
    }

    public void clickSeparateWindow() {
        LOG.info("Click Separate window btn");
        driver.findElement(tabSeparate).click();
        driver.findElement(separateBtn).click();
        sleep(2000);
        ArrayList<String> switchTabs= new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(switchTabs.get(1));
        driver.close();
        driver.switchTo().window(switchTabs.get(0));
        sleep(2000);
    }

    public void clickMultipleWindow() {
        LOG.info("Click Multiple window btn");
        driver.findElement(tabMultiple).click();
        driver.findElement(multipleBtn).click();
        sleep(2000);
        ArrayList<String> switchTabs= new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(switchTabs.get(2));
        driver.close();
        driver.switchTo().window(switchTabs.get(1));
        driver.close();
        driver.switchTo().window(switchTabs.get(0));
        sleep(2000);
    }
}
