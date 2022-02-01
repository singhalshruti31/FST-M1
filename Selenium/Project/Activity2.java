package HR_Mngt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Activity2 {
    private WebDriver driver;

    @Test
    public void Act2(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        //Get to URL
        driver.navigate().to("http://alchemy.hguy.co/orangehrm");
        Reporter.log("URL is entered in the search bar and is accessed");
        //Created one WebElement for Header Image
        WebElement img = driver.findElement(By.xpath("//div[@id='divLogo']//img"));
        //Fetched 'src' attribute from header image
        String src = img.getAttribute("src");
        //Printing URL on console
        System.out.println("URL of Header image :: "+src);
        Reporter.log("URL of Header image :: "+src);
        //Close the Browser
        driver.close();
        Reporter.log("Closing the Browser window after successful verification of Windows Title");
    }
}
