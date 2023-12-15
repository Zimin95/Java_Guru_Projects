package classworks.Lesson10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class readLoginButtonTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.draugiem.lv");
        WebElement loginButton =driver.findElement(By.xpath("//button[@type='submit']"));
        String nameAttributeValue =  loginButton.getAttribute("name");
        System.out.println(nameAttributeValue);
        driver.quit();

    }
}
