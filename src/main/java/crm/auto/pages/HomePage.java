package crm.auto.pages;

import crm.auto.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    //constructor
    public HomePage(WebDriver driver) {
        super(driver);
    }
    //Variables
    public HomePage homePage;
    String baseURL = "https://www.freecrm.co.in";

    //WebElements
    By loginButtonBy = By.xpath("//a[@href='https://ui.freecrm.com']");

    //Open Browser and go to HomePage
    public HomePage goToHomePage(){
        driver.get(baseURL);
        return this;
    }
    //Return LoginPage object
    public LoginPage clickLogin(){
        click(loginButtonBy);
        return new LoginPage(driver);
    }
}
