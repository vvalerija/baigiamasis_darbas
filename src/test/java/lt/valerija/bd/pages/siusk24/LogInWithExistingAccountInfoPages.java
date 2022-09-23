package lt.valerija.bd.pages.siusk24;

import lt.valerija.bd.pages.Common;
import lt.valerija.bd.pages.Locators;

public class LogInWithExistingAccountInfoPages {

    public static void open() {
        Common.openUrl("https://www.siusk24.lt");
    }

    public static void clickButtonToOpenPrisijungti() {
        Common.clickElement(
                Locators.LogIn.buttonOpenPrisijungti
        );
    }

    public static void clickButtonSlapukuNustatymai() {
        Common.clickElement(
                Locators.LogIn.buttonSlapukuSutikymas
        );
    }

    public static String enterEmail(String message) {

        Common.sendKeysToElement(
                Locators.LogIn.inputEmail,
                message
        );
        return message;
    }

    public static void enterPassword(String password) {
        Common.sendKeysToElement(
                Locators.LogIn.inputPassword, password
        );
    }

    public static void buttonPrisijungti() {
        Common.clickElement(Locators.LogIn.buttonPrisijungti);
    }

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static String readCurrentText() {

        return Common.getElementText(Locators.LogIn.buttonOpenPrisijungti);
    }

    public static String readSuccessfulLogInText() {
        return Common.getElementText(Locators.LogIn.sucsesfullLogIn);
    }
}