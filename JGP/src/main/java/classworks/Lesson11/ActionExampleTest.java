package classworks.Lesson11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionExampleTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.janisroze.lv");
        Actions action = new Actions(driver);
        WebElement profileLink = driver.findElement(By.xpath("//ul[@class='account-dropdown long']"));
        action.moveToElement(profileLink).build().perform();
        WebElement ielogotiesDDItem = driver.findElement(By.xpath("//a[@title='Ielogoties']"));
        ielogotiesDDItem.click();
        driver.quit();


    }
}
