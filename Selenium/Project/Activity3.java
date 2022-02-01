package HR_Mngt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Activity3 {
    private WebDriver driver;

    @Test
    public void Act3() throws InterruptedException {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        //Get to URL
        driver.navigate().to("http://alchemy.hguy.co/orangehrm");
        Reporter.log("URL is entered in the search bar and is accessed");
        //Find WebElements
        WebElement username_Txt = driver.findElement(By.id("txtUsername"));
        WebElement password_Txt = driver.findElement(By.id("txtPassword"));
        WebElement login_Btn = driver.findElement(By.id("btnLogin"));
        //Enter Credentials
        username_Txt.sendKeys("orange");
        Reporter.log("Username field is given value as 'orange'");
        password_Txt.sendKeys("orangepassword123");
        Reporter.log("Password field is given value as 'orangepassword123'");
        login_Btn.submit();
        Reporter.log("Login button is clicked");
        //Verify Dashboard screen is loaded
        Thread.sleep(3000);
        WebElement dashboard_Lnk = driver.findElement(By.xpath("//h1"));
        dashboard_Lnk.isDisplayed();
        Reporter.log("Dashboard Screen is Loaded");
        //Close the Browser
        driver.close();
        Reporter.log("Closing the Browser window after successful verification of Windows Title");
    }
}
