package classworks.lesson9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.lang.Thread.sleep;

public class SSLvTestPracticeDogs {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.ss.com/lv/");
        WebElement suniKuceni = driver.findElement(By.id("mtd_300"));
        suniKuceni.click();
        WebElement ageFrom = driver.findElement(By.id("f_o_1276_min"));
        ageFrom.sendKeys("1");
        WebElement ageTo = driver.findElement(By.id("f_o_1276_max"));
        ageTo.sendKeys("1");
        WebElement meklet = driver.findElement(By.className("s12"));
        meklet.click();

         driver.quit();
    }
}
