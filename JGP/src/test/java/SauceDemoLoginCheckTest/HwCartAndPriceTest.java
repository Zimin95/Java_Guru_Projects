 package SauceDemoLoginCheckTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HwCartAndPriceTest extends BaseTest {
    @Test

    public void testAddToCartAndComparePrices() {
        WebElement loginField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        loginField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();



        WebElement backPackAddToCardButton = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        backPackAddToCardButton.click();

        WebElement bikeLightAddToCardButton = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        bikeLightAddToCardButton.click();

        WebElement shoppingCartButton = driver.findElement(By.id("shopping_cart_container"));
        shoppingCartButton.click();

        WebElement backpackExpectedPrice = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/div"));
        WebElement backpackPriceInCart = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div"));

        WebElement bikeLightExpectedPrice = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[2]/div"));
        WebElement bikeLightPriceInCart = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[4]/div[2]/div[2]/div"));


        Assert.assertEquals(backpackExpectedPrice,backpackPriceInCart);
        Assert.assertEquals(bikeLightExpectedPrice,bikeLightPriceInCart);





    }

    }



