package TestNG_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity7 {
    private WebDriver driver;

    @BeforeTest
    public void setup(){
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/login-form");
    }
    @DataProvider (name = "Authentication")
    public static Object[][] credentials(){
        return new Object[][]{
                {"admin", "password"},
                {"admin", "password"}
        };
    }
    @Test (dataProvider = "Authentication")
    public void act1(String username, String password){
        //Find Elements
        WebElement uname = driver.findElement(By.id("username"));
        WebElement pword = driver.findElement(By.id("password"));
        WebElement but = driver.findElement(By.xpath(".//button[contains(text(),'Log in')]"));

        //Send Values and Click Login Button
        uname.clear();
        uname.sendKeys(username);
        pword.clear();
        pword.sendKeys(password);
        but.click();

        //Assert Welcome Message
        WebElement msg = driver.findElement(By.id("action-confirmation"));
        Assert.assertEquals(msg.getText(),"Welcome Back, admin");
    }
        @AfterTest
    public void teardown(){
        driver.close();
    }
}
