package TalantLMS.UI.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewUserPage extends BasePage {

    @FindBy(xpath = "//div[@class='hidden-phone']")
    private WebElement clickAddUser;

    @FindBy(xpath = "(//a[@class='btn btn-primary'])[3]")
    private WebElement clickButtonAddUser;

    @FindBy(xpath = "//input[@name='name']")
   private WebElement firstNameInputField;

    @FindBy(xpath = "//input[@name='surname']")
    private WebElement lastNameInputField;

    @FindBy(xpath = "//input[@name='email']")
   private WebElement emailAddressInputField;

    @FindBy(xpath = "//input[@name='login']")
    private WebElement loginInputField;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordInputField;

    @FindBy(xpath = "//textarea[@name='description']")
    private WebElement bioInputField;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    private WebElement clickButtonSubmitOrAddUser;


    public AddNewUserPage inputAddUser() {
        helper.click(clickAddUser);
        return this;
    }
    public AddNewUserPage clickButtonAddUser() {
        helper.click(clickButtonAddUser);
        return this;
    }
    public AddNewUserPage inputFirstName(String firstName){
        helper.sendKeys(firstNameInputField,firstName);
        return this;
    }
    public AddNewUserPage inputLastName(String lastName) {
        helper.sendKeys(lastNameInputField, lastName);
        return this;
    }
    public AddNewUserPage inputEmailAddress(String emailAddress) {
        helper.sendKeys(emailAddressInputField, emailAddress);
        return this;
    }
    public AddNewUserPage inputUsername(String userName) {
        helper.sendKeys(loginInputField, userName);
        return this;
    }
    public AddNewUserPage inputPassword(String password) {
        helper.sendKeys(passwordInputField, password);
        return this;
    }
    public AddNewUserPage inputBio(String bio) {
        helper.sendKeys(bioInputField, bio);
        return this;
    }
    public AddNewUserPage clickSubmit() {
        helper.click(clickButtonSubmitOrAddUser);
        return this;
    }

}