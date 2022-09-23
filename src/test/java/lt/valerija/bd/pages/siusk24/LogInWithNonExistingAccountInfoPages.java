package lt.valerija.bd.pages.siusk24;

import lt.valerija.bd.pages.Common;
import lt.valerija.bd.pages.Locators;

public class LogInWithNonExistingAccountInfoPages {

    public static void open() {
        Common.openUrl("https://www.siusk24.lt");
    }


    public static String readUnsuccessfulLogInText() {

        return Common.getElementText(Locators.LogIn.unSucsesfullLogIn);
    }

}