package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        System.out.println("Page Title is :: "+driver.getTitle());
        WebElement a = driver.findElement(By.id("about-link"));
        if(a!=null)
            System.out.println("Found element by using ID");
        WebElement b = driver.findElement(By.className("green"));
        if(b!=null)
            System.out.println("Found element by using Class Name");
        WebElement c = driver.findElement(By.linkText("About Us"));
        if(c!=null)
            System.out.println("Found element by using Link Text");
        WebElement d = driver.findElement(By.cssSelector("#about-link"));
        if(d!=null)
            System.out.println("Found element by using CSS Selector");
        System.out.println("Text in the Element is :: "+d.getText());
        driver.close();
    }
}
