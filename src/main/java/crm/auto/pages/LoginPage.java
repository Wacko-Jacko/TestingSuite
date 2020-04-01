package crm.auto.pages;

import crm.auto.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    //constructor
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    //WebElements
    By emailaddressBy = By.xpath("//input[@name='email']");
    By passwordBy = By.xpath("//input[@name='password']");
    By loginBtnBy = By.xpath("//div[@class='ui fluid large blue submit button']");

    //Methods
    public LoginPage loginToProfile(String emailaddress, String password) {
        writeText(emailaddressBy, emailaddress);
        writeText(passwordBy, password);
        click(loginBtnBy);
        return this;
    }
}
