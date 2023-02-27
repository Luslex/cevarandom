package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;

public class BaseTest {
    @BeforeSuite
    public void init(){
        BasePage.setUp();
    }

    @AfterSuite
    public void teardown(){
        BasePage.tearDown();
    }
}
