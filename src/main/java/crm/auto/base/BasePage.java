package crm.auto.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }
    //wait
    public void setWait(By by) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }
    //read
    public String  readText(By elementLocator) {
        setWait(elementLocator);
        return driver.findElement(elementLocator).getText();
    }
    //write
    public void writeText(By elementLocator, String text) {
        setWait(elementLocator);
        driver.findElement(elementLocator).sendKeys(text);
    }
    //click
    public void click(By elementLocator){
        setWait(elementLocator);
        driver.findElement(elementLocator).click();
    }
    //AssertEquals
    public void assertEquals(By elementLocator, String expectedText){
        setWait(elementLocator);
        Assert.assertEquals(readText(elementLocator),expectedText);
    }
    //AssertTrue
    public void assertTrue(){
        Assert.assertTrue(true);
    }
    //AssertFalse
    public void assertFalse() {
        Assert.assertFalse(false);
    }
}
