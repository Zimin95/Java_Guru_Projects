package homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class JanisRozeLoginTest {
    @Test
    public void LoginTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.janisroze.lv");
        Actions action = new Actions(driver);
        WebElement profileLink = driver.findElement(By.xpath("//ul[@class='account-dropdown long']"));
        action.moveToElement(profileLink).build().perform();
        WebElement ielogotiesDDItem = driver.findElement(By.xpath("//a[@title='Ielogoties']"));
        ielogotiesDDItem.click();
        WebElement emailInputField = driver.findElement(By.id("email"));
        emailInputField.sendKeys("nikolayzimin95@gmail.com");
        WebElement passInputField = driver.findElement(By.xpath("//input[@type='password']"));
        passInputField.sendKeys("testngTest12");
        WebElement ielogotiesButton = driver.findElement(By.id("send2"));
        ielogotiesButton.click();
        var jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        driver.quit();



    }
}
