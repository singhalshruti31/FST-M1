package HR_Mngt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
    private WebDriver driver;

    @Test
    public void Act1(){
        //Get the URL
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://alchemy.hguy.co/orangehrm");
        Reporter.log("URL is entered in the search bar and is accessed");
        //Get the windows Title
        String title = driver.getTitle();
        Reporter.log("Title of the window is fetched :: "+title);
        //Asserting Windows Title
        Assert.assertEquals(title, "OrangeHRM");
        Reporter.log("Windows Title is verified to be 'OrangeHRM'");
        //Closing the browser window
        if(title.equals("OrangeHRM"))
        driver.close();
        Reporter.log("Closing the Browser window after successful verification of Windows Title");
    }
}
