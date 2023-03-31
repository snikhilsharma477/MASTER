package comOpenCart;

import Pages.DashBoard;
import Pages.LoginPage;
import Pages.ProductCatalog;
import TestBase.TestBase;
import TestUtility.TestUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import static TestUtility.TestUtilities.productName;
import static TestUtility.TestUtilities.readingExcelFile;


public class TC1VerifyTheOpenCartLoggin  extends TestBase {


    @Test
public void ValidateLoging() throws IOException {
// login

        initialize();

    ProductCatalog catalog= new ProductCatalog();
    catalog.clickonCatlog();

    DashBoard board=new DashBoard();
    board.clickOnProducteButton();
    board.clickOnaddNewProductButton();
    TestUtilities.readingExcelFile();
        board.enterProductName(TestUtilities.productName);
        board.enterMegaTitleName(TestUtilities.megaTitle);




    }

}
