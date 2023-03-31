package comOpenCart;

import Pages.ProductCatalog;
import TestBase.TestBase;
import org.testng.annotations.Test;

public class TC2VerifytheProductAdding extends TestBase {

    @Test
 public void verifyProductIsAdding(){


        initialize();

ProductCatalog productCatalog =new ProductCatalog();

    productCatalog.clickonCatlog();


    }




}
