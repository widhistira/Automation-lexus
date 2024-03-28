package Test;

import Page.BookPage;
import Page.OpenPage;
//import com.sun.org.apache.bcel.internal.classfile.Utility;
import Utility.Utility;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.print.Book;

public class BookTestDriveTest extends BaseTest {

    @BeforeMethod
    public void openweb() throws InterruptedException {
        OpenPage openPage = new OpenPage(BaseTest.driver, BaseTest.explicitWait);

    }

    @Test(testName = "BOOK A TEST DRIVE OR APPOINTMENT ")
    public void BookADrive() throws InterruptedException {
        BookPage bookPage = new BookPage(BaseTest.driver,BaseTest.explicitWait);
        Page.ScrollPage scrollPage = new Page.ScrollPage(driver,explicitWait);

        Thread.sleep(1000);

        bookPage.acceptcookies();
        bookPage.inptFirstName("Ryan");
        Thread.sleep(1000);
        bookPage.inptLastName("Widhistira");
        Thread.sleep(1000);
        bookPage.inptEmailAddress("widhistira79@gmail.com");
        Thread.sleep(1000);
        bookPage.clickPhoneDropDown();
        bookPage.selectPhoneRegion();
        Thread.sleep(1000);
        bookPage.InputPhoneNum("91234567");
        Thread.sleep(1000);
        bookPage.selectDate();
        bookPage.pickDate();
        Thread.sleep(1000);
        bookPage.clickPreferedTime();
        bookPage.selectTime();
        scrollPage.scrollDownByPixel();
        Thread.sleep(1000);
        bookPage.clickPreferedSales();
        bookPage.selectSales();
        Thread.sleep(1000);
        bookPage.clickPax();
        bookPage.selectPax();
        Thread.sleep(1000);
        Assert.assertTrue(bookPage.BtnSubmitDisable());
        Utility.hardWait(4);
        Assert.assertTrue(bookPage.verifyModel());
//        bookPage.deleteModel();
//        bookPage.clickPreferedModel();
//        bookPage.selectModelPrefered();
        bookPage.clickTestdriveDropBtn();
        bookPage.selectTestDriveOption();
        Thread.sleep(2000);
        scrollPage.scrollDownByPixel();
        bookPage.inputVehicleModel("UX 300e");
        scrollPage.scrollDownByPixel();
        Thread.sleep(2000);
        bookPage.inputYearVehicle("2020");
        Thread.sleep(2000);
        bookPage.checkboxDriveLicense();
        bookPage.checkboxTermCondition();
        bookPage.clickCheckBox();
        bookPage.clickCheckBoxMarketing();
        scrollPage.scrollDownByPixel();
//        bookPage.scrollUntilBtnSbmit();
        Thread.sleep(5000);

    }

}

