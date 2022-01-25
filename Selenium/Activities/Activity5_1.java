package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("Page Title :: "+driver.getTitle());
        WebElement checkbox = driver.findElement(By.name("toggled"));
        System.out.println("Is Checkbox Visible on screen :: "+checkbox.isDisplayed());
        driver.findElement(By.id("toggleCheckbox")).click();
        System.out.println("Is Checkbox Visible on screen :: "+checkbox.isDisplayed());
        driver.close();
    }
}
