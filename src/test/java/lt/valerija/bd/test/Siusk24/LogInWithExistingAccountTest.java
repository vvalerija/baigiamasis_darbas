package lt.valerija.bd.test.Siusk24;

import lt.valerija.bd.pages.siusk24.LogInWithExistingAccountInfoPages;
import lt.valerija.bd.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class LogInWithExistingAccountTest extends TestBase {

    @BeforeTest

    public void setUp() {
        LogInWithExistingAccountInfoPages.open();
    }

    @Test
    public void logInWithExistingAccountInfo() {
        String email = "project2022vcs@gmail.com";
        String password = "Passwordvcs";
        String expectedResult = "MANO UŽSAKYMAI";
        String actualResult = "";

        LogInWithExistingAccountInfoPages.clickButtonSlapukuNustatymai();
        LogInWithExistingAccountInfoPages.clickButtonToOpenPrisijungti();
        LogInWithExistingAccountInfoPages.enterEmail(email);
        LogInWithExistingAccountInfoPages.enterPassword(password);
        LogInWithExistingAccountInfoPages.buttonPrisijungti();
        LogInWithExistingAccountInfoPages.sleep(2000);
        actualResult = LogInWithExistingAccountInfoPages.readSuccessfulLogInText();

        Assert.assertEquals(actualResult, expectedResult);

    }
}



