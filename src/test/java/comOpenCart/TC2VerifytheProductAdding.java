package comOpenCart;

import Pages.DashBoard;
import Pages.ProductCatalog;
import TestBase.TestBase;
import TestUtility.TestUtilities;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC2VerifytheProductAdding extends TestBase {

    @Test
 public void verifyProductIsAdding() throws IOException {

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
