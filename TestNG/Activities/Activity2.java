package TestNG_Activities;

import jdk.jfr.Enabled;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class Activity2 {
    private WebDriver driver;

    @BeforeTest
    public void setup(){
        driver = new FirefoxDriver();
        //Open browser
        driver.get("https://www.training-support.net/selenium/target-practice");
    }

    @Test
    public void act1(){
        String title = driver.getTitle();
        Assert.assertEquals(title, "Target Practice");
    }

    @Test
    public void act2(){
        WebElement but = driver.findElement(By.xpath("//button[@class='ui black button']"));
        Assert.assertEquals(but.getText(), "Blue");
    }

    @Test (enabled = false)
    public void act3(){
        System.out.println("Test3 is skipped");
    }

    @Test
    public void act4() throws SkipException{
        throw new SkipException("Test4 is skipped");
    }

    @AfterTest
    public void teardown(){
        driver.close();
    }
}
