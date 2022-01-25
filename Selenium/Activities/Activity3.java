package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.training-support.net/selenium/simple-form");
        System.out.println("Title of Page :: "+driver.getTitle());
        System.out.println("URL of Page :: "+driver.getCurrentUrl());
        WebElement firstname = driver.findElement(By.id("firstName"));
        WebElement lastname = driver.findElement(By.id("lastName"));
        firstname.sendKeys("Shruti");
        Thread.sleep(2000);
        lastname.sendKeys("Singhal");
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("singhalshruti333@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("number")).sendKeys("9818425634");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='submit']")).submit();
        driver.close();
    }
}
