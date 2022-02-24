package stepDefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTestSteps {
    WebDriver driver;
    WebDriverWait wait;

    @Given("^User is on Login page$")
    public void userIsOnLoginPage() throws Throwable {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 15);
        driver.get("https://www.training-support.net/selenium/login-form");
        driver.manage().window().maximize();
    }

    @When("^User enters username and password$")
    public void userEntersUsernamePasssword() throws Throwable{
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        username.sendKeys("admin");
        password.sendKeys("password");
        login.click();
    }

    @When("^User enters \"(.*)\" and \"(.*)\"$")
    public void userEntersExample(String username, String password) throws Throwable{
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("^Read the page title and confirmation message$")
    public void userReadPageTitle() throws Throwable{
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("action-confirmation")));
        String pageTitle = driver.getTitle();
        String confirmMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Page title is: " + pageTitle);
        System.out.println("Login message is: " + confirmMessage);
    }

    @And("^Close the Browser$")
    public void closeBrowser() throws Throwable{
        driver.close();
    }
}
