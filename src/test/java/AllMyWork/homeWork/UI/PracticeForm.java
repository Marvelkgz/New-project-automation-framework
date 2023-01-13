package AllMyWork.homeWork.UI;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class PracticeForm {
    @Test
    public void practice() throws AWTException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/automation-practice-form");

        WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
        firstName.sendKeys("Rayana");

        WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastName.sendKeys("Kadyrbekova");

        WebElement mail = driver.findElement(By.xpath("//input[@id='userEmail']"));
        mail.sendKeys("Ray@gmail.com");

        WebElement radioButton = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]"));
        radioButton.click();

        WebElement mobileNumber = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']"));
        mobileNumber.sendKeys("996700998877");

        WebElement dateOfBirth = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
        dateOfBirth.sendKeys(Keys.BACK_SPACE);
        dateOfBirth.sendKeys(Keys.BACK_SPACE);
        dateOfBirth.sendKeys("00");



        WebElement subject = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
        subject.sendKeys("Ma");
        subject.sendKeys(Keys.ENTER);
        subject.sendKeys("Ph");
        subject.sendKeys(Keys.ENTER);


        WebElement hobbiesSport = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[4]"));
        hobbiesSport.click();
        WebElement hobbiesReading = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[5]"));
        hobbiesReading.click();
        WebElement hobbiesMusic = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[6]"));
        hobbiesMusic.click();

        WebElement chooseFile = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
        chooseFile.sendKeys("D:\\memory\08 08 18\\IMG_4774");

//        Robot robot = new Robot();
//
//        for (int i = 0;i < 4;i++){
//            robot.keyPress(KeyEvent.VK_CONTROL);
//            robot.keyPress(KeyEvent.VK_SUBTRACT);
//            robot.keyRelease(KeyEvent.VK_SUBTRACT);
//            robot.keyRelease(KeyEvent.VK_CONTROL);
//        }

        WebElement currentAddress = driver.findElement(By.xpath("//textarea[@class='form-control']"));
        currentAddress.sendKeys("Aksuu");


        WebElement selectCity = driver.findElement(By.xpath("//input[@id='react-select-3-input']"));
        subject.sendKeys("Haryana");
        selectCity.sendKeys(Keys.ENTER);

        WebElement cityInput = driver.findElement(By.xpath("//input[@id='react-select-4-input']"));
        cityInput.sendKeys("Karnal");
        cityInput.sendKeys(Keys.ENTER);


        WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
        submit.click();

    }
}
