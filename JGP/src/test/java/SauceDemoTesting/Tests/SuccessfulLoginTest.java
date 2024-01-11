package SauceDemoTesting.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SuccessfulLoginTest {
    @Test
    public void SuccessfulLoginTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://saucedemo.com");
        driver.quit();
    }
}
