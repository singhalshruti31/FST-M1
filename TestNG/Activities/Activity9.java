package TestNG_Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity9 {
    private WebDriver driver;

    @BeforeTest
    public void setup(){
        driver = new FirefoxDriver();
        Reporter.log("New Instance is Opened\n");
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
    }

    @BeforeMethod
    public void switchback(){
        driver.switchTo().defaultContent();
        Reporter.log("Driver is switched to Default content \n");
    }

    @Test
    public void simpleAlertTestCase(){
        WebElement simple = driver.findElement(By.id("simple"));
        Reporter.log("Simple button is found on screen \n");
        simple.click();
        Reporter.log("Simple button is clicked \n");
        Alert simplealert = driver.switchTo().alert();
        Reporter.log("Driver is switched to alert message \n");
        Assert.assertEquals(simplealert.getText(),"This is a JavaScript Alert!");
        Reporter.log("Alert text is verified :: "+simplealert.getText()+"\n");
        simplealert.accept();
        Reporter.log("Alert is accepted \n");
    }

    @Test
    public void confirmAlertTestCase(){
        WebElement Confirm = driver.findElement(By.id("confirm"));
        Reporter.log("Confirm Button is found on screen \n");
        Confirm.click();
        Reporter.log("Confirm button is clicked \n");
        Alert confirmalert = driver.switchTo().alert();
        Reporter.log("Driver is switched to alert message \n");
        Assert.assertEquals(confirmalert.getText(),"This is a JavaScript Confirmation!");
        Reporter.log("Alert text is verified :: "+confirmalert.getText()+"\n");
        confirmalert.accept();
        Reporter.log("Alert is accepted \n");
    }

    @Test
    public void promptAlertTestCase() throws InterruptedException {
        WebElement prompt = driver.findElement(By.id("prompt"));
        Reporter.log("Prompt Alert element is found on screen \n");
        prompt.click();
        Reporter.log("Prompt button is clicked \n");
        Alert promptalert = driver.switchTo().alert();
        Reporter.log("Driver is switched to alert message \n");
        Assert.assertEquals(promptalert.getText(),"This is a JavaScript Prompt!");
        Reporter.log("Alert text is verified :: "+promptalert.getText()+"\n");
        Thread.sleep(2000);
        promptalert.sendKeys("This is a JavaScript Prompt!");
        Thread.sleep(2000);
        Reporter.log("Alert TextBox is given value as :: This is a JavaScript Prompt! \n");
        promptalert.accept();
        Reporter.log("Alert is accepted \n");
    }

    @AfterTest
    public void teardown(){
        Reporter.log("Driver is closed");
        driver.close();
    }
}
