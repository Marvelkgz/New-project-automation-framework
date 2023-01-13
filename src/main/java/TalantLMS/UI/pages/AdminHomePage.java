package TalantLMS.UI.pages;

import TalantLMS.UI.driverFactory.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminHomePage extends BasePage {


    @FindBy(xpath = "//div[@class='tl-title tl-ellipsis']")
    public WebElement adminHomeTitle;


}
