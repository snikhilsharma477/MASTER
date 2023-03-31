package Pages;

import TestBase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCatalog  extends TestBase {





    @FindBy(xpath = "//a[@href='#collapse-1']")
    WebElement catlogbutton;

   public ProductCatalog(){

       super();
       PageFactory.initElements(driver,this);

   }


   public void clickonCatlog(){

       catlogbutton.click();



   }
}

