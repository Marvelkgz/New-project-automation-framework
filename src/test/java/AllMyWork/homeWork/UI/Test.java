package AllMyWork.homeWork.UI;

import TalantLMS.UI.driverFactory.Driver;
import TalantLMS.UI.helperMethods.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test {
@org.junit.Test
    public void test(){

        Driver.getDriver().get("https://www.imoving.com/");
        Helper helper = new Helper();
        WebElement aboutUs = Driver.getDriver().findElement(By.xpath("//a[text()='About Us']"));
        helper.jsClick(aboutUs);
    }
}
