package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.RegisterPage.RegisterPage;
import pages.SignInpage.SignInPage;
import pages.SwitchToPage.AlertsPage;
import pages.SwitchToPage.FramesPage;
import pages.SwitchToPage.WindowsPage;

public class BaseTest {

    public SignInPage signInPage = SignInPage.getInstance();
    public RegisterPage registerPage = RegisterPage.getInstance();
    public AlertsPage alertsPage = AlertsPage.getInstance();
    public WindowsPage windowsPage = WindowsPage.getInstance();
    public FramesPage framesPage = FramesPage.getInstance();

    @BeforeSuite
    public void init() {
        BasePage.setUp();
    }

    @AfterSuite
    public void teardown() {
        BasePage.tearDown();
    }

}
