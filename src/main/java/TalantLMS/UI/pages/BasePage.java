package TalantLMS.UI.pages;

import TalantLMS.UI.driverFactory.Driver;
import TalantLMS.UI.helperMethods.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
  protected   Helper helper = new Helper();
   protected WebDriver driver = Driver.getDriver();

}
