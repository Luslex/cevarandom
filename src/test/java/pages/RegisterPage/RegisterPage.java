package pages.RegisterPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class RegisterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    public static RegisterPage instance;

    private By title = By.xpath("//div[h1='Automation Demo Site ']");
    private By register = By.xpath("//div[h2='Register']");
    private By firstName = By.xpath("//input[@placeholder='First Name']");
    private By lastName = By.xpath("//input[@placeholder='Last Name']");
    private By addressBox = By.xpath("//textarea[@ng-model='Adress']");
    private By emailBox = By.xpath("//input[@type='email']");
    private By phoneBox = By.xpath("//input[@type='tel']");
    private By maleTick = By.xpath("//input[@value='Male']");
    private By femaleTick = By.xpath("//input[@value='FeMale']");
    private By cricket = By.xpath("//input[@id='checkbox1']");
    private By movies = By.xpath("//input[@id='checkbox2']");
    private By hockey = By.xpath("//input[@id='checkbox3']");



    private RegisterPage() {
    }

    public static RegisterPage getInstance() {
        if (instance == null) {
            instance = new RegisterPage();
        }
        return instance;
    }

    public boolean isTitleDisplayed(){
        LOG.info("Verify if title is displayed");
        return driver.findElement(title).isDisplayed();
    }

    public boolean isRegisterDisplayed(){
        LOG.info("Verify if Register is displayed");
        return driver.findElement(register).isDisplayed();
    }

    public void typeInFirstName(String firstNAME) {
        LOG.info("Type in 'First Name' field");
        driver.findElement(firstName).sendKeys(firstNAME);
    }

    public void typeInLastName(String lastNAME) {
        LOG.info("Type in 'Last Name' field");
        driver.findElement(lastName).sendKeys(lastNAME);
    }

    public void typeInAdress(String address) {
        LOG.info("Type in 'Adrress' field");
        driver.findElement(addressBox).sendKeys(address);
    }

    public void typeInEmailBox(String email) {
        LOG.info("Type in 'Email' field");
        driver.findElement(emailBox).sendKeys(email);
    }

    public void typeInPhoneBox(String phone) {
        LOG.info("Type in 'Phone' field");
        driver.findElement(phoneBox).sendKeys(phone);
    }

    public void clickMaleTick() {
        LOG.info("Click Male Tick");
        driver.findElement(maleTick).click();
    }

    public void clickFemaleTick() {
        LOG.info("Click Female Tick");
        driver.findElement(femaleTick).click();
    }
    public void clickCricket() {
        LOG.info("Click the 'Cricket' box");
        driver.findElement(cricket).click();
    }
    public void clickMovies() {
        LOG.info("Click the 'Movies' box");
        driver.findElement(movies).click();
    }
    public void clickHockey() {
        LOG.info("Click the 'Hockey' box");
        driver.findElement(hockey).click();
    }

}
