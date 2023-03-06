package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseURL;

public class SignUpTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(SignUpTest.class);
    private String newURL = getBaseURL() + "Index.html";

    @Test
    public void signUp() {
        String email = "grupa3@automation.com";
        String password = "grupa3";

        LOG.info("Navigate to Sign Up Page");
        driver.get(newURL);
        Assert.assertTrue(signInPage.isLogoDisplayed(), "Logo is not displayed");
        Assert.assertTrue(signInPage.isEmailFieldDisplayed(), "Email is not displayed");
        Assert.assertTrue(signInPage.isSignInButtonDisplayed(), "Sign In button is not displayed");
        Assert.assertTrue(signInPage.isSkipSignInButtonDisplayed(), "Skip Sign button is not displayed");
        signInPage.clickSignInButton();

        LOG.info("Type in email and password");
        signInPage.typeInSignInEmailField(email);
        signInPage.typeInSignInPasswordField(password);

        LOG.info("Click Enter button");
        signInPage.clickEnterButton();

        LOG.info("Verify if Error message is displayed");
        Assert.assertTrue(signInPage.isErrorMsgDisplayed(), "Error message is not displayed");

    }
}
