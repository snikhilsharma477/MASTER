package comOpenCart;

import Pages.DashBoard;
import TestBase.TestBase;
import org.testng.annotations.Test;

public class TC3VerifyProductDashbord extends TestBase {


    @Test
    public void verifyProfileButton(){

initialize();
        DashBoard dashBoard=new DashBoard();
        dashBoard.clickOnProfileButton();
    }
}
