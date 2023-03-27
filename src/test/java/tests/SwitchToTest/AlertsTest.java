package tests.SwitchToTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseURL;

public class AlertsTest extends BaseTest {
    private String newURL = getBaseURL() + "Alerts.html";
    private static final Logger LOG = LoggerFactory.getLogger(AlertsTest.class);

    @Test
    public void alerts() {
        driver.get(newURL);

        LOG.info("Click alert box button");
        alertsPage.clickAlertBox();
        LOG.info("Navigate the confirm box page");
        alertsPage.clickConfirmBox();
        LOG.info("Navigate the text box page");
        alertsPage.clickTextBox();

    }
}
