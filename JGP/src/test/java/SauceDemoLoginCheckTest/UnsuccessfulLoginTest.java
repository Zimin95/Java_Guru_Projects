package SauceDemoLoginCheckTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UnsuccessfulLoginTest extends BaseTest{
    @Test
    public void checkUnsuccessfulLogin(){
        WebElement loginField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        loginField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauces");
        loginButton.click();
        Boolean isLogged;
       try{
           WebElement burgerMenu = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
           isLogged = true;
       }
       catch (Exception e) {
         isLogged = false;
       }
           Assert.assertFalse(isLogged);
       }


    }

