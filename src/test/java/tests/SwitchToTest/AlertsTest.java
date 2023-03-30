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

        String nume = "Andrei";

        LOG.info("Trigger Alert And Tape Ok Button");
        alertsPage.clickAlertBox();
        LOG.info("Trigger Alert And Tape Cancel Button");
        alertsPage.clickConfirmBox();
        LOG.info("Trigger Alert And Send Data");
        alertsPage.clickTextBox(nume);

    }
}
