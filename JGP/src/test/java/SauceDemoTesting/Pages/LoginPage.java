package SauceDemoTesting.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage {
    WebDriver driver;
    String loginFieldId ="user-name";
    String passwordFieldId= "password";
    String loginButtonId = "login-button";



    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void login(){
        WebElement loginField = driver.findElement(By.id(loginFieldId));
        WebElement passwordField = driver.findElement(By.id(passwordFieldId));
        WebElement loginButton = driver.findElement(By.id(passwordFieldId));
        loginField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
    }

}
