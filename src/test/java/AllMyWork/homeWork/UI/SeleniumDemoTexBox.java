package AllMyWork.homeWork.UI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumDemoTexBox {
    String userName = "Sumaya";
    String userEmail = "sumi@gmail.com";
    String userCurrentAddress = "Aksuu";
    String userPermanentAddress = "Karakol";

    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/text-box");

//        driver.findElement(By.name("q")).sendKeys("Iphone");
//        driver.findElement(By.className("gNO89b")).click();

        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys(userName);

        WebElement mail = driver.findElement(By.id("userEmail"));
        mail.sendKeys(userEmail);

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys(userCurrentAddress);

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys(userPermanentAddress);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");

        WebElement button = driver.findElement(By.id("submit"));
        button.click();

        WebElement idName = driver.findElement(By.id("name"));
        Assertions.assertEquals(userName,idName.getText().substring(5));

        WebElement idEmail = driver.findElement(By.id("email"));
        Assertions.assertEquals(userEmail,idEmail.getText().substring(6));

        WebElement idCurrentAddress = driver.findElement(By.id("currentAddress"));
        Assertions.assertFalse(idCurrentAddress.getText().contains(userCurrentAddress));



    }
}
