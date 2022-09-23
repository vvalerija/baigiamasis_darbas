package lt.valerija.bd.pages.siusk24;

import lt.valerija.bd.pages.Common;
import lt.valerija.bd.pages.Locators;
import org.testng.Assert;

public class UserLogOutPages {


    public static void open() {
        Common.openUrl("https://www.siusk24.lt");
    }

    public static void clickVardenisPavardenis() {
        Common.moveToElement(Locators.LogOut.divVardenisPavardenis);

    }
    public static void clickButtonLogout() {
        Common.clickElement(
                Locators.LogOut.clickButtonLogout
        );
    }
}
