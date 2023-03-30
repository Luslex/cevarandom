package pages.SwitchToPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

import java.util.ArrayList;

public class FramesPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(FramesPage.class);
    public static FramesPage instance;


    private By singleFrameBtn = By.xpath("//a[@href='#Single']");
    private By textbar = By.xpath("//input[@type='text']");
    private By inFrameBtn = By.xpath("//a[@href='#Multiple']");
    private By demoFrame = By.xpath("//iframe[@src='SingleFrame.html']");
    private By multipleFrame = By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']");
    private By multiple = By.xpath("//iframe[@src='MultipleFrames.html']");

    private FramesPage() {
    }

    public static FramesPage getInstance() {
        if (instance == null) {
            instance = new FramesPage();
        }
        return instance;
    }

    public void sendKeysInSingleFrame(String random) {
        LOG.info("Write in frame");
        driver.findElement(singleFrameBtn).click();
        WebElement demo = driver.findElement(demoFrame);
        driver.switchTo().frame(demo);
        driver.findElement(textbar).sendKeys(random);

    }

    public void sendKeysInMultipleFrame(String random) {
        LOG.info("Write in multiple frame");
        ArrayList<String> switchTabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(switchTabs.get(0));
        driver.findElement(inFrameBtn).click();
        WebElement first = driver.findElement(multiple);
        driver.switchTo().frame(first);
        WebElement multipleFrames = driver.findElement(multipleFrame);
        driver.switchTo().frame(multipleFrames);
        driver.findElement(textbar).sendKeys(random);

    }

}
