package classworks.Lesson11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class fluentWaitExampleTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com");

        WebElement loginField = driver.findElement(By.id("user-name"));
        loginField.sendKeys("standard_user");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
        WebElement burgerMenu = driver.findElement(By.id("react-burger-menu-btn"));
        burgerMenu.click();
       // WebElement allItemsMenu = driver.findElement(By.id("inventory_sidebar_link"));
        FluentWait wait =  new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofMillis(250))
                .ignoring(NoSuchElementException.class);
       // wait.until(ExpectedConditions.elementToBeClickable(allItemsMenu));//all items menu is visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inventory_sidebar_link")));
       // allItemsMenu.click();
        driver.quit();
    }
}