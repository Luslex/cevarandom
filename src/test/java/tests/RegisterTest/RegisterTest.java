package tests.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseURL;


public class RegisterTest extends BaseTest {
    private String newURL = getBaseURL() + "Register.html";
    private static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);

    @Test
    public void register() {
        driver.get(newURL);
        String firstNAME = "Vlasa";
        String lastNAME = "Andrei";
        String address = "lalalala";
        String email = "grupa3@automation.com";
        String phone = "0123456789";
        String language = "Romanian";
        String skills = "Java";
        String country = "Australia";
        String year = "1982";
        String month = "August";
        String day = "31";
        String password ="123456789";


        LOG.info("Checl title");
        Assert.assertTrue(registerPage.isTitleDisplayed(), "Title is not displayed");
        LOG.info("Check register");
        Assert.assertTrue(registerPage.isRegisterDisplayed(), "REgister is not displayed");
        LOG.info("Type in First and Last name");
        registerPage.typeInFirstName(firstNAME);
        registerPage.typeInLastName(lastNAME);
        LOG.info("Type in adress");
        registerPage.typeInAdress(address);
        LOG.info("Type in email");
        registerPage.typeInEmailBox(email);
        LOG.info("Type in phone number");
        registerPage.typeInPhoneBox(phone);
        LOG.info("Choose gender");
        registerPage.clickMaleTick();
        registerPage.clickFemaleTick();
        LOG.info("Check the boxes");
        registerPage.clickCricket();
        registerPage.clickMovies();
        registerPage.clickHockey();
        LOG.info("Select language");
        registerPage.selectLanguage(language);
        LOG.info("Select skills");
        registerPage.selectSkills(skills);
        LOG.info("Select country");
        registerPage.typeInCountry(country);
        LOG.info("Select date of birth");
        registerPage.selectYear(year);
        registerPage.selectMonth(month);
        registerPage.selectDay(day);
        LOG.info("Type in password");
        registerPage.typeInPassword(password);
//        LOG.info("Click the 'Choose File' button");
//        registerPage.clickChooseFileButton();

        LOG.info("Click the 'Refresh' button");
        registerPage.clickRefreshButton();
        LOG.info("Click the 'Submit' button");
        registerPage.clickSubmitButton();





    }

}
