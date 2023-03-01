package tests.SignInTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SignUpTest extends BaseTest {

    @Test
    public void signUp(){
        Assert.assertTrue(signInPage.isLogoDisplayed(), "Logo is not displayed");
        Assert.assertTrue(signInPage.isEmailFieldDisplayed(), "Email is not displayed");
        Assert.assertTrue(signInPage.isSignInButtonDisplayed(), "Sign In button is not displayed");
        Assert.assertTrue(signInPage.isSkipSignInButtonDisplayed(), "Skip Sign button is not displayed");
        signInPage.clickSignInButton();
    }
}
