package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.SignInpage.SignInPage;

public class BaseTest {

    public SignInPage signInPage = SignInPage.getInstance();

    @BeforeSuite
    public void init(){
        BasePage.setUp();
    }

    @AfterSuite
    public void teardown(){
        BasePage.tearDown();
    }

}
