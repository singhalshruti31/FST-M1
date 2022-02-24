package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/ajax");
        String title = driver.getTitle();
        System.out.println("Page title is :: "+title);
        driver.findElement(By.xpath("//button[contains(@class, 'violet')]")).click();
        Thread.sleep(2000);

        //getText() and print it
        String ajaxText = driver.findElement(By.id("ajax-content")).getText();
        System.out.println(ajaxText);

        //Wait for late text
        //wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
        Thread.sleep(4000);

        //Get late text and print it
        String lateText = driver.findElement(By.id("ajax-content")).getText();
        System.out.println(lateText);

        //Close browser
        driver.close();
    }
}