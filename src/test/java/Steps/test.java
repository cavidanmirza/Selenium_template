package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class test {
    WebDriver wd;
   @Given("Go to Twitter")
    public void go_to_twitter() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver");
       wd = new ChromeDriver();
       wd.manage().window().maximize();
       wd.get("https:  .com");
       Thread.sleep(1000);
   }

   @When("Click login")
    public void click_to_login_btn() throws InterruptedException {
       WebElement submitButton = wd.findElement(By.xpath(" "));
       submitButton.click();
       Thread.sleep(1000);
   }

   @And("Click email input and write")
    public void click_email_input() throws InterruptedException {
       WebElement email_input = wd.findElement(By.xpath(" "));
       email_input.click();
       Thread.sleep(1000);
       email_input.sendKeys("  ");
       Thread.sleep(1000);
   }

   @And("click next btn")
   public void click_next() throws InterruptedException {
       WebElement clickNext = wd.findElement(By.xpath(" "));
       clickNext.click();
       Thread.sleep(1000);
   }

    @And("Click pswd input and write")
    public void click_psw_input() throws InterruptedException {
        WebElement psw_input = wd.findElement(By.xpath(" "));
        psw_input.click();
        psw_input.sendKeys("  ");
        Thread.sleep(1000);
    }

    @And("Click Login2")
    public void click_login() throws InterruptedException {
        WebElement click_login = wd.findElement(By.xpath("  "));
        click_login.click();
        Thread.sleep(1000);
    }

    @Then("Click New Tweet and write")
    public void new_tweet() throws InterruptedException {
       WebElement newTweet = wd.findElement(By.xpath("  "));
       newTweet.click();
       Thread.sleep(1000);
       newTweet.sendKeys("  ");
       Thread.sleep(1000);
    }

    @Then("Tweet")
    public void tweet_(){
       WebElement tweet = wd.findElement(By.xpath("  "));
       tweet.click();
    }

}

