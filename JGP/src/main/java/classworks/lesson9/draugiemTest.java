package classworks.lesson9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;

public class draugiemTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.draugiem.lv");

        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("sometext@text");
        WebElement myPassword = driver.findElement(By.id("password"));
        myPassword.sendKeys("dfdfd111");
        WebElement ienaktButton = driver.findElement(By.id("loginSubmit"));
        ienaktButton.click();
        sleep(20000);
        driver.quit();

    }
}
