package lt.valerija.bd.test.Siusk24;

import lt.valerija.bd.pages.siusk24.ParcelSearchPages;
import lt.valerija.bd.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParcelSearchTest extends TestBase {

    @BeforeTest

    public void setUp() {

        ParcelSearchPages.open();
    }

    @Test
    public static void ParcelSearchTest(){

        String tracking ="S24C0909170369";
        String expectedResult = "0 rezultatų pagal raktažodį S24C0909170369";
        String actualResult = "";

        ParcelSearchPages.clickButtonSlapukuNustatymai();
        ParcelSearchPages.clickInputButtonSearch();
        ParcelSearchPages.enterTrackingNumber(tracking);
        ParcelSearchPages.clickButtonSearch();
        ParcelSearchPages.readSearchResult();


        actualResult = ParcelSearchPages.readSearchResult();

        Assert.assertEquals(actualResult, expectedResult);

    }



}
