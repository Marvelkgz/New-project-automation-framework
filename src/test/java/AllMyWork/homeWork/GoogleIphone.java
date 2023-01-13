package AllMyWork.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Assertions;
import java.time.Duration;

public class GoogleIphone {
    @Test
    public void test1() {
        String softeck1 = "(//cite[@class='iUh30 qLRx3b tjvcx'])[9]";

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");

        driver.findElement(By.name("q")).sendKeys("Iphone");
        driver.findElement(By.className("gNO89b")).click();


       // WebElement softech = driver.findElement(By.className(softeck1));
        Assertions.assertTrue(softeck1.isEmpty());
    }
}
