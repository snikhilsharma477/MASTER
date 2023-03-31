package TestBase;

import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
   // protected static ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

    public static Properties prop;

public  static    FileInputStream file;


    public TestBase() {
        try {
         file = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/Config.properties");
            prop = new Properties();
            try {
                prop.load(file);
            } catch (IOException e){
                e.printStackTrace();
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void initialize() {

        if (prop.getProperty("browser").equals("Chrome")) {

            WebDriverManager.chromedriver().setup();

             driver = new ChromeDriver();

            driver.get(prop.getProperty("testEnvironmentUrl"));

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            LoginPage page= new LoginPage();
            page.Username(prop.getProperty("userName"));
            page.Password(prop.getProperty("password"));
            page.Clickonloginbutton();


        }
    }

}




