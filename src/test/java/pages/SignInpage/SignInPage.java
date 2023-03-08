package pages.SignInpage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;

    private SignInPage() {
    }

    public static SignInPage getInstance() {
        if (instance == null) {
            instance = new SignInPage();
        }
        return instance;
    }

    //Homepage
    private final By logo = By.id("logo");
    private final By signInButton = By.id("btn1");
    private final By skipSignInButton = By.id("btn2");
    private final By emailField = By.id("email");
    private final By nextButton = By.id("enterimg");

    //SignIn
    private By signInEmailField = By.xpath("//input[@type='text']");
    private By signInPasswordField = By.xpath("//input[@type='password']");
    private final By enterButton = By.id("enterbtn");
    private final By errormsg = By.id("errormsg");

    public boolean isLogoDisplayed() {
        LOG.info("Verify if Logo is Dysplayed");
        return driver.findElement(logo).isDisplayed(); //return se foloseste doar la boolean
    }

    public boolean isSignInButtonDisplayed() {
        LOG.info("Verify if Sign in button is Displayed");
        return driver.findElement(signInButton).isDisplayed();
    }

    public boolean isSkipSignInButtonDisplayed() {
        LOG.info("Verify if Skip Sign in button is Displayed");
        return driver.findElement(skipSignInButton).isDisplayed();
    }

    public boolean isEmailFieldDisplayed() {
        LOG.info("Verify if Email Field is Displayed");
        return driver.findElement(emailField).isDisplayed();
    }

    public void clickSignInButton() {
        LOG.info("Verify if Sign in button is Displayed");
        driver.findElement(signInButton).click();
    }

    public void clickSkipSignInButton() {
        LOG.info("Click Skip Sign in button");
        driver.findElement(skipSignInButton).click();
    }

    public void typeInEmailField(String email) {
        LOG.info("Type in Email Field");
        driver.findElement(emailField).sendKeys(email);
    }

    public void clickNextButton() {
        LOG.info("Click Next Button");
        driver.findElement(nextButton).click();
    }

    public void typeInSignInEmailField(String email) {
        LOG.info("Type email adress in 'Email' field");
        driver.findElement(signInEmailField).sendKeys(email);
    }

    public void typeInSignInPasswordField(String password) {
        LOG.info("Type password in 'Password' field");
        driver.findElement(signInPasswordField).sendKeys(password);
    }

    public void clickEnterButton() {
        LOG.info("Click 'Enter' Button");
        driver.findElement(enterButton).click();
    }

    public boolean isErrorMsgDisplayed() {
        LOG.info("Verify if Error message is Displayed");
        return driver.findElement(errormsg).isDisplayed();
    }

    public void clickBack(){
        LOG.info("Turning the page back");
        driver.navigate().back();
    }

}

