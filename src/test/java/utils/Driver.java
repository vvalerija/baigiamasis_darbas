package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Driver {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver(getDriverOptions());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }

    public static void quitDriver() {
        driver.manage().deleteAllCookies();
        driver.quit();
//       driver.get().quit();
//        driver.remove();
    }

    private static ChromeOptions getDriverOptions() {
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("window-size=2000,3000");
        options.addArguments("--force-device-scale-factor=0.75");
        options.addArguments("--start-in-incognito");
        options.addArguments("--start-maximized");
//        options.addArguments("headless");
        return options;
    }
}







