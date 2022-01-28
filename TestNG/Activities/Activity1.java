package TestNG_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
    private WebDriver driver;

    @BeforeClass
    public void setup(){
        driver = new FirefoxDriver();
        //Open Browser
        driver.get("https://www.training-support.net");
    }

    @Test
    public void Act1(){
        //Get the Page title
        System.out.println("Page Title :: "+driver.getTitle());
        Reporter.log("Page Title :: "+driver.getTitle());
        //Assert the Page Title
        Assert.assertEquals(driver.getTitle(), "Training Support");

        //Click Button
        WebElement but = driver.findElement(By.id("about-link"));
        but.click();

        //Print new Page Title
        System.out.println("Page Title :: "+driver.getTitle());
        Reporter.log("Page Title :: "+driver.getTitle());
    }

    @AfterClass
    public void teardown(){
        //Close Browser
        driver.close();
    }
}
