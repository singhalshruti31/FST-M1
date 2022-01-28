package TestNG_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity5 {
    private WebDriver driver;

    @BeforeTest (alwaysRun = true)
    public void setup(){
        driver = new FirefoxDriver();
        //Open Browser
        driver.get("https://www.training-support.net/selenium/target-practice");
    }

    @Test (groups = {"HeaderTests", "ButtonTests"})
    public void PageTitle(){
        String title = driver.getTitle();
        System.out.println("Page Title :: "+title);
        //Assert Page Title
        Assert.assertEquals(title, "Target Practice");
    }

    @Test (dependsOnMethods = {"PageTitle"},groups = {"HeaderTests"})
    public void ThirdElement(){
        WebElement third = driver.findElement(By.id("third-header"));
        Assert.assertEquals(third.getText(),"Third header");
    }

    @Test (dependsOnMethods = {"PageTitle"}, groups = {"HeaderTests"})
    public void FifthElement(){
        WebElement fifth = driver.findElement(By.xpath("//h5"));
        System.out.println(fifth.getCssValue("color"));
        Assert.assertEquals(fifth.getCssValue("color"),"rgb(33, 186, 69)");
    }

    @Test (dependsOnMethods = {"PageTitle"}, groups = {"ButtonTests"})
    public void OliveButton(){
        WebElement olive = driver.findElement(By.xpath("//button[contains(@class,'olive')]"));
        Assert.assertEquals(olive.getText(),"Olive");
    }

    @Test (dependsOnMethods = {"PageTitle"}, groups = {"ButtonTests"})
    public void FirstButton(){
        WebElement but = driver.findElement(By.xpath("//button[contains(@class,'brown')]"));
        System.out.println(but.getCssValue("color"));
        Assert.assertEquals(but.getCssValue("color"),"rgb(255, 255, 255)");
    }

    @AfterTest
    public void teardown(){
        //Close Browser
        driver.close();
    }
}
