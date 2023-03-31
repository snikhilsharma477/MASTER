package Pages;

import TestBase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoginPage extends TestBase {
    @FindBy(id ="input-username")
    WebElement login;
    @FindBy(id ="input-password")
    WebElement Password;
    @FindBy(xpath ="//button[@Class='btn btn-primary']")
    WebElement loginButton;
    @FindBy(xpath ="//button[@Class='btn-close']")
    WebElement PoupClose;

    public LoginPage() {
        super();
        PageFactory.initElements(driver,this);
    }
    public void Username(String username){
        login.sendKeys(username);
    }
    public void Password(String password){
        Password.sendKeys(password);
    }
    public void Clickonloginbutton(){
        loginButton.click();
        PoupClose.click();
    }
}
