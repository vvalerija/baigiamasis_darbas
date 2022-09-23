package lt.valerija.bd.test.Siusk24;

import lt.valerija.bd.pages.siusk24.LogInWithExistingAccountInfoPages;
import lt.valerija.bd.pages.siusk24.UserLogOutPages;
import lt.valerija.bd.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UserLogOutTest extends TestBase {
    @BeforeTest
    public void setUp() {

        UserLogOutPages.open();
    }

    @Test
    public void UserLogOut() {

        String email = "project2022vcs@gmail.com";
        String password = "Passwordvcs";
        String expectedResult = "PRISIJUNGTI";
        String actualResult;

        LogInWithExistingAccountInfoPages.clickButtonSlapukuNustatymai();
        LogInWithExistingAccountInfoPages.clickButtonToOpenPrisijungti();
        LogInWithExistingAccountInfoPages.enterEmail(email);
        LogInWithExistingAccountInfoPages.enterPassword(password);
        LogInWithExistingAccountInfoPages.buttonPrisijungti();
        UserLogOutPages.clickVardenisPavardenis();
        UserLogOutPages.clickButtonLogout();


        actualResult = LogInWithExistingAccountInfoPages.readCurrentText();

        Assert.assertEquals(actualResult, expectedResult);


    }
}
