package SauceDemoLoginCheckTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SuccessfulLoginTest extends BaseTest {
    @Test
    public void LoginCheck() {
        WebElement loginField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        loginField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();

    }
}
