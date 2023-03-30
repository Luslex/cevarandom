package tests.SwitchToTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseURL;

public class FramesTest extends BaseTest {
    private String newURL = getBaseURL() + "Frames.html";
    private static final Logger LOG = LoggerFactory.getLogger(FramesTest.class);

    @Test
    public void frames() {
        driver.get(newURL);

        String random = "aafdadf";

        LOG.info("Write in frame");
        framesPage.sendKeysInSingleFrame(random);
        LOG.info("Write in multiple frame");
        framesPage.sendKeysInMultipleFrame(random);


    }
}
