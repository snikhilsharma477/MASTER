package Pages;

import TestBase.TestBase;
import TestUtility.TestUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard extends TestBase {
    @FindBy(xpath = "//li[@id='header-profile']/a")
    WebElement profileButton;

    @FindBy(xpath = "//a[contains(text(),'Products')][1]")

    WebElement productButton;


    @FindBy(xpath = "//i[contains(@class,'fas fa-plus')]/preceding::a[@data-bs-original-title='Add New']")
    WebElement addNewProductButton;


    @FindBy(xpath = "//input[@name='product_description[1][name]']")
    WebElement inputBoxProductName;

    @FindBy(xpath = "//input[@id='input-meta-title-1']")
    WebElement inputBoxMetaTitle;

    public DashBoard(){
        PageFactory.initElements(driver,this);

    }
    public void clickOnProfileButton(){

        profileButton.click();
    }

    public void clickOnProducteButton(){

        productButton.click();
    }

    public void clickOnaddNewProductButton(){

        addNewProductButton.click();
    }

    public void enterProductName(String productNames){

        inputBoxProductName.sendKeys(TestUtilities.productName);
    }

    public void enterMegaTitleName(String megaTitle){
        inputBoxMetaTitle.sendKeys(megaTitle);

    }
}


