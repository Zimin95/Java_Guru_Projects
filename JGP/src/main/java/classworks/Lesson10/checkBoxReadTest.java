package classworks.Lesson10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkBoxReadTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.draugiem.lv");
        WebElement rememberMeCheckBox =driver.findElement(By.xpath("//span[@class='formCheckboxContainer']/following-sibling::span"));// next element -span
         String rememberMeCheckBoxTest = rememberMeCheckBox.getText();
         System.out.println(rememberMeCheckBoxTest);
        driver.quit();
    }
}