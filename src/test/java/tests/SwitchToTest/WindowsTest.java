package tests.SwitchToTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseURL;

public class WindowsTest extends BaseTest {
    private String newURL = getBaseURL() + "Windows.html";
    private static final Logger LOG = LoggerFactory.getLogger(WindowsTest.class);

    @Test
    public void windows() {
        driver.get(newURL);

        LOG.info("Click new tab window btn");
        windowsPage.clickNewTabWindow();
        LOG.info("Click Separate window btn");
        windowsPage.clickSeparateWindow();
        LOG.info("Click Multiple window btn");
        windowsPage.clickMultipleWindow();


    }
}
