package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class stepDefinition{
    WebDriver driver;


    @Given("^User is on the Promotions page$")
    public void user_is_on_the_Promotions_page() throws Throwable {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\agrebenkina\\IdeaProjects\\geckodriver-v0.19.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://games.williamhill.com/#!/promotions");
    }

    @Given("^User is not logged in$")
    public void user_is_not_logged_in() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement loginButton;
        loginButton = driver.findElement(By.xpath("//a[@href='#!/action/login']"));
    }

    @When("^User clicks on Join now$")
    public void user_clicks_on() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement joinNowButton;
        joinNowButton = driver.findElement(By.xpath(".//a[contains(text(), 'Join Now')]"));
        joinNowButton.click();

    }

    @Then("^SignUp form is opened$")
    public void user_can_signup() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[contains(@ng-src, 'auth.williamhill')]")));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("signupForm"))));
       // driver.findElement(By.id("signupForm"));
        driver.quit();

    }


}
