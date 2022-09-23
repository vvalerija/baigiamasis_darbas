package lt.valerija.bd.pages;

import org.openqa.selenium.By;

public class Locators {

    public static class LogIn {

        public static By buttonSlapukuSutikymas = By.xpath("//*[text()='Patvirtinti visus']");
        public static By buttonOpenPrisijungti = By.xpath("//*[text()='Prisijungti']");

        public static By inputEmail = By.xpath("//*[@name='user[email]']");

        public static By inputPassword
                = By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div/form/div[1]/div[2]/div/div/div/span/input");

        public static By buttonDoubleClick = By.xpath("//*[@class='ant-form-item-control-input-content'] ");

        public static By buttonPrisijungti
                = By.xpath("//*[@class='login-button']");
        public static By sucsesfullLogIn = By.xpath("//*[@class='log-in-button']");

        public static By unSucsesfullLogIn = By.xpath("(//*[@class='title'])[1]");
    }

    public static class LogOut {


        public static By divVardenisPavardenis = By.xpath("(//*[@class='ant-space-item'])[10]");
        public static By clickButtonLogout =
                By.xpath(" (//*[@class='ant-dropdown-menu-item ant-dropdown-menu-item-only-child'])[2]");

    }


    public static class ParcelSearch {

        public static By buttonInputSearch = By.xpath("(//*[@class='ant-space-item'])[5]");
        public static By trackingNumber = By.xpath("(//*[@type='text'])[2]");

        public static By buttonSearch = By.xpath("(//*[@type='button'])[1]");

        public static By searchResult = By.xpath("//*[@class='col-md-12 search_results_text text-center']");

    }

}