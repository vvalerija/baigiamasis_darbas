package lt.valerija.bd.pages.siusk24;

import lt.valerija.bd.pages.Common;
import lt.valerija.bd.pages.Locators;

public class ParcelSearchPages {
    public static void open() {
        Common.openUrl("https://www.siusk24.lt");
    }

    public static void clickButtonSlapukuNustatymai() {
        Common.clickElement(
                Locators.LogIn.buttonSlapukuSutikymas
        );
    }

    public static void clickInputButtonSearch() {
        Common.clickElement(
                Locators.ParcelSearch.buttonInputSearch
        );

    }

    public static void enterTrackingNumber(String tracking) {
        Common.sendKeysToElement(
                Locators.ParcelSearch.trackingNumber,
                tracking
        );
    }

    public static void clickButtonSearch() {

        Common.clickElement(
                Locators.ParcelSearch.buttonSearch
        );
    }

    public static String readSearchResult() {
        return
                Common.getElementText(
                        Locators.ParcelSearch.searchResult
                );
    }
}


