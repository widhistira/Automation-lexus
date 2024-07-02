package Test;

import Page.inputPage;
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

    @Test(testName = "Basic open google")
    public void BookADrive() throws InterruptedException {

    }

}

