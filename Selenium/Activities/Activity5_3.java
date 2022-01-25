package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("Page Title :: "+driver.getTitle());
        WebElement inputtext = driver.findElement(By.id("input-text"));
        System.out.println("Is text field Enabled? :: "+inputtext.isEnabled());
        driver.findElement(By.id("toggleInput")).click();
        System.out.println("Is text field Enabled? :: "+inputtext.isEnabled());
        driver.close();
    }
}
