package stepDefs;

import TalantLMS.UI.dataProvider.ConfigReader;
import TalantLMS.UI.helperMethods.Helper;
import TalantLMS.UI.pages.AdminHomePage;
import TalantLMS.UI.pages.LoginPage;
import TalantLMS.UI.driverFactory.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class LoginSteps extends BaseTest {


    @Given("Go to login page")
    public void go_to_login_page() {
        Driver.getDriver().get(ConfigReader.getProperty("qaEnvironment"));
       
    }
    @Given("Enter {string} in userName or Email input field")
    public void enter_in_user_name_or_email_input_field(String userNameOrEmail) {
       loginPage.inputUserNameOrEmail(userNameOrEmail);

    }
    @Given("Enter {string} in password input field")
    public void enter_in_password_input_field(String password) {
        loginPage.inputPassword(password);

    }
    @When("User click on login button")
    public void user_click_on_login_button() {
        loginPage.clickLoginButton();


    }
    @Then("user should successfully logged in")
    public void user_should_successfully_logged_in() {
        Assertions.assertEquals("Home",helper.getText(adminHomePage.adminHomeTitle));
       
    }


}

