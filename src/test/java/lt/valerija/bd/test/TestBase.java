package lt.valerija.bd.test;

import lt.valerija.bd.pages.Common;
import lt.valerija.bd.pages.siusk24.LogInWithExistingAccountInfoPages;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import utils.TestListener;

@Listeners(TestListener.class)
public class TestBase  {

    @AfterMethod
    public void teardown() {
        Common.closeDriver();
    }
}
