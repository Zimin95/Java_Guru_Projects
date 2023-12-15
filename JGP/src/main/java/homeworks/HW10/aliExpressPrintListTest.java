package homeworks.HW10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

import static java.lang.Thread.sleep;

public class aliExpressPrintListTest {

    public static void main(String[] args) throws InterruptedException {
          WebDriverManager.chromedriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.aliexpress.com");

          WebElement searchField = driver.findElement(By.xpath("//input[@class='search--keyword--15P08Ji']"));
        String inputText = "Tattoo";
        searchField.sendKeys(inputText);

         WebElement addCloseButton = driver.findElement(By.className("pop-close-btn"));
        addCloseButton.click();
        sleep(5000);
         WebElement searchButton = driver.findElement(By.xpath("//input[@class='search--submit--2VTbd-T']"));
        searchButton.click();

        List <WebElement> resultLinks = driver.findElements(By.xpath("//*[@id=\"card-list\"]/div[1]/div/a/div[2]/span/a"));

        System.out.println("Size of the List: " + resultLinks.size());

        for (WebElement links : resultLinks) {
            System.out.println("Found link: " + links.getAttribute("href"));
        }

        driver.quit();


    }
}
