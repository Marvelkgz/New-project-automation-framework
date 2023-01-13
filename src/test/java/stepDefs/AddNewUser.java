package stepDefs;

import TalantLMS.UI.dataProvider.ConfigReader;
import TalantLMS.UI.dataProvider.MockDataGenerator;
import TalantLMS.UI.driverFactory.Driver;
import TalantLMS.UI.pages.AddNewUserPage;
import TalantLMS.UI.pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddNewUser extends BaseTest {

    String expectedFirstName = mockDataGenerator.generateMockFirstName();
    String expectedLastName = mockDataGenerator.generateMockLastName();
    String expectedEmail = mockDataGenerator.generateMockEmail();
    String expectedUserName = mockDataGenerator.generateMockUsername();
    String expectedPassword = mockDataGenerator.generateMockPassword();
    String expectedBio = mockDataGenerator.generateMockBio();

    @Given("Go to login  page")
    public void goToLoginPage() {
        Driver.getDriver().get(ConfigReader.getProperty("qaEnvironment"));
        loginPage.inputUserNameOrEmail("msc.mars92");
        loginPage.inputPassword("msc.mars92");
        loginPage.clickLoginButton();
    }

    @When("user should click Add user button in Admin home page")
    public void user_should_click_add_user_button_in_admin_home_page() {
        addNewUserPage.inputAddUser();
        addNewUserPage.clickButtonAddUser();

    }

    @When("verify following field names are displayed")
    public void verify_following_field_names_are_displayed(io.cucumber.datatable.DataTable dataTable) {
        addNewUserPage.inputFirstName(expectedFirstName)
                .inputLastName(expectedLastName)
                .inputEmailAddress(expectedEmail)
                .inputUsername(expectedUserName)
                .inputPassword(expectedPassword)
                .inputBio(expectedBio);
    }

    @When("enter following data create new user")
    public void enter_following_data_create_new_user(io.cucumber.datatable.DataTable dataTable) {
addNewUserPage.clickSubmit();
    }


}

