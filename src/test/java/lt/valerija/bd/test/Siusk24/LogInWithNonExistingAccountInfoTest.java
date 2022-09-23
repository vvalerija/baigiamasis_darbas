package lt.valerija.bd.test.Siusk24;

import lt.valerija.bd.pages.siusk24.LogInWithExistingAccountInfoPages;
import lt.valerija.bd.pages.siusk24.LogInWithNonExistingAccountInfoPages;
import lt.valerija.bd.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogInWithNonExistingAccountInfoTest extends TestBase {

    @BeforeTest

    public void setUp() {
        LogInWithExistingAccountInfoPages.open();
    }

    @Test
    public void LoginWithNonExistingAccountInfo() {
        String email = "test@test.com";
        String password = "password";
        String expectedResult = "Prisijungti";
        String actualResult = "";

        LogInWithExistingAccountInfoPages.clickButtonSlapukuNustatymai();
        LogInWithExistingAccountInfoPages.clickButtonToOpenPrisijungti();
        LogInWithExistingAccountInfoPages.enterEmail(email);
        LogInWithExistingAccountInfoPages.enterPassword(password);
        LogInWithExistingAccountInfoPages.buttonPrisijungti();
        LogInWithExistingAccountInfoPages.sleep(2000);
        LogInWithNonExistingAccountInfoPages.readUnsuccessfulLogInText();

        actualResult = LogInWithNonExistingAccountInfoPages.readUnsuccessfulLogInText();

        Assert.assertEquals(actualResult, expectedResult);

    }
}
