package TestNG_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
    private WebDriver driver;

    @BeforeClass
    public void setup(){
        driver = new FirefoxDriver();
        //Open browser
        driver.get("https://www.training-support.net/selenium/login-form");
    }

    @Test
    public void act1(){
        //Find Elements
        WebElement uname = driver.findElement(By.id("username"));
        WebElement pword = driver.findElement(By.id("password"));
        WebElement but = driver.findElement(By.xpath(".//button[contains(text(),'Log in')]"));

        //Send Values and Click Login Button
        uname.sendKeys("admin");
        pword.sendKeys("password");
        but.click();

        //Assert Welcome Message
        WebElement msg = driver.findElement(By.id("action-confirmation"));
        Assert.assertEquals(msg.getText(),"Welcome Back, admin");
    }

    @AfterClass
    public void teardown(){
        //Close Browser
        driver.close();
    }
}
