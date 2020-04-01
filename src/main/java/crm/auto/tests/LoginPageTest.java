package crm.auto.tests;

import crm.auto.base.BaseTest;
import crm.auto.pages.HomePage;
import crm.auto.utils.ExtentTestManager;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class LoginPageTest extends BaseTest {

    @Test(priority = 0,description = "Valid Login Scenario with valid email address and password.")
    public void valid_LoginTest(Method method){
        HomePage homePage = new HomePage(driver);

        ExtentTestManager.startTest(method.getName(), "Valid Login Scenario with valid email address and password.");
        ExtentTestManager.getTest().setDescription("Valid Login Scenario with valid email address and password.");

        homePage.goToHomePage()
                .clickLogin()
                .loginToProfile("jasonjd83@gmail.com", "P@ssw0rd1!")
                .assertTrue();
    }

    @Test(priority = 1,description = "Invalid Login Scenario with invalid email address and password.")
    public void Invalid_LoginTest(Method method){
        HomePage homePage = new HomePage(driver);

        ExtentTestManager.startTest(method.getName(), "Invalid Login Scenario with invalid email address and password.");
        homePage.goToHomePage()
                .clickLogin()
                .loginToProfile("jasonjd83@gmail.com", "P@ssw0rd!")
                .assertFalse();
    }
}
