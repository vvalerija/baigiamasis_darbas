package lt.valerija.bd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utils.Driver;

public class Common {

    public static void openUrl(String url) {
        Driver.setDriver();
        Driver.getDriver().get(url);

    }
    public static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static void clickElement(By locator) {
        getElement(locator).click();
    }

    public static void sendKeysToElement(By locator, String keys) {
        getElement(locator).sendKeys(keys);
    }

    public static void closeDriver() {
        Driver.quitDriver();
    }

    public static String getElementText(By locator) {
        return getElement(locator).getText();
    }

    public static void moveToElement(By locator){
        WebElement element = getElement(locator);

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element);
        actions.perform();

    }


}
