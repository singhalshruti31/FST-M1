package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
        System.out.println("Page Title :: "+driver.getTitle());
        WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        WebElement contact = driver.findElement(By.xpath("//input[@type='tel']"));
        firstname.sendKeys("Shruti");
        Thread.sleep(2000);
        lastname.sendKeys("Singhal");
        Thread.sleep(2000);
        email.sendKeys("shruti.singhal@ibm.com");
        Thread.sleep(2000);
        contact.sendKeys("9817672456");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.switchTo().alert().accept();
        driver.close();
    }
}
