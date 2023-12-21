package SauceDemoLoginCheckTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    WebDriver driver;
    @BeforeMethod
        public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com");


    }
    public void LogIn(){
        WebElement loginField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        loginField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();

    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
