package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.training-support.net/selenium/target-practice");
        System.out.println("Page Title :: "+driver.getTitle());
        WebElement thirdheader = driver.findElement(By.xpath("//h3"));
        System.out.println("Text in 3rd header :: "+thirdheader.getText());
        WebElement fifthheader = driver.findElement(By.xpath("//h5"));
        System.out.println("Color of 5th Header :: "+fifthheader.getCssValue("color"));
        WebElement violetbutton = driver.findElement(By.xpath("//button[contains(text(),'Violet')]"));
        System.out.println("Class of Violet Button :: "+violetbutton.getAttribute("class"));
        WebElement greybutton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]"));
        System.out.println("Text in Grey button :: "+greybutton.getText());
        driver.close();
    }
}
