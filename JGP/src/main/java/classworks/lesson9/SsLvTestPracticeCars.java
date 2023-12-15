package classworks.lesson9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class SsLvTestPracticeCars {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.ss.com/lv/");
        WebElement cars = driver.findElement(By.id("mtd_97"));
        cars.click();
        WebElement priceFromField = driver.findElement(By.id("f_o_8_min"));
        priceFromField.sendKeys("6000");
        WebElement priceToFields = driver.findElement(By.id("f_o_8_max"));
        priceToFields.sendKeys("10000");
        Select yearOfDropdown = new Select(driver.findElement(By.id("f_o_18_min")));
        yearOfDropdown.selectByVisibleText("2001");
        Select tilpumsLidzDropdown = new Select(driver.findElement(By.id("f_o_15_max")));
        yearOfDropdown.selectByVisibleText("3.0");
        Select colorDropdown = new Select(driver.findElement(By.id("f_o_17")));
        colorDropdown.selectByValue("6318");
        WebElement clickMekletButton = driver.findElement(By.className("s12"));
        clickMekletButton.click();

        driver.quit();


    }
}
