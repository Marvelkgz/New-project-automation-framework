package stepDefs;

import TalantLMS.UI.dataProvider.MockDataGenerator;
import TalantLMS.UI.helperMethods.Helper;
import TalantLMS.UI.pages.AddNewUserPage;
import TalantLMS.UI.pages.AdminHomePage;
import TalantLMS.UI.pages.LoginPage;

public abstract class BaseTest {

   protected LoginPage loginPage = new LoginPage();
   protected Helper helper = new Helper();
    protected AdminHomePage adminHomePage = new AdminHomePage();
    protected AddNewUserPage addNewUserPage = new AddNewUserPage();
    protected MockDataGenerator mockDataGenerator = new MockDataGenerator();
}
