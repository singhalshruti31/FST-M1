package TestNG_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Activity6 {
    private WebDriver driver;

    @BeforeTest
    public void setup(){
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/login-form");
    }

    @Test
    @Parameters({"username", "password"})
    public void act1(String username, String password){
        //Find Elements
        WebElement uname = driver.findElement(By.id("username"));
        WebElement pword = driver.findElement(By.id("password"));
        WebElement but = driver.findElement(By.xpath(".//button[contains(text(),'Log in')]"));

        //Send Values and Click Login Button
        uname.sendKeys(username);
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
