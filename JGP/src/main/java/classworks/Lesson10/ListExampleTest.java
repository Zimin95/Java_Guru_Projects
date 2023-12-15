package classworks.Lesson10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

import static java.lang.Thread.sleep;

public class ListExampleTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.ss.com");
        WebElement carLink = driver.findElement(By.xpath("//*[@id='mtd_97']" ));
        carLink.click();
        List<WebElement> titleElements = driver.findElements(By.xpath("//*[@id=\"filter_frm\"]/table[2]/tbody/tr/td[1]/div/table/tbody/tr/td[1]/table/tbody/tr/td" ));
        System.out.println("The options are");
        for (WebElement element : titleElements){
            System.out.println(element.getText());
           Thread.sleep(5000);
            driver.quit();

        }

    }
}