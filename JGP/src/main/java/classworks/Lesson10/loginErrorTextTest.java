package classworks.Lesson10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.lang.Thread.sleep;

public class loginErrorTextTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.draugiem.lv");
        WebElement logInField = driver.findElement(By.xpath("//input[@name='email']"));
        logInField.sendKeys("test@tesst.lv");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("JOJOJOJ");
        WebElement ienaktButton = driver.findElement(By.xpath("//button[@type='submit']"));
        ienaktButton.click();
        sleep( 6000);
        WebElement errorTextMessageTextField = driver.findElement(By.xpath("//div[@class='infoMsg errorIcon radius3']"));
        String errorMessageText = errorTextMessageTextField.getText();
        System.out.println(errorMessageText);

        driver.quit();

    }
}