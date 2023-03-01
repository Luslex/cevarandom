package tests.SignInTest;


//import jdk.internal.org.jline.utils.Log;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SignInTest extends BaseTest {

    @Test
    public void checkIfLogoIsDisplayed(){
        String email = "grupa3@automation.com";

 //       Log.info("Verifiy if Logo is displayed");
        Assert.assertTrue(signInPage.isLogoDisplayed(), "Logo is not displayed");

//        Assert.assertTrue(signInPage.isEmailFieldDisplayed(), "Email field is not displayed");
        signInPage.typeInEmailField(email);

   //     Log.info("Click the Next button");
        signInPage.clickNextButton();
    }
}
