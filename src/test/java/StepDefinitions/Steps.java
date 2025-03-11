package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pageObjects.*;
import readData.ReadExcelData;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.logging.Logger;
import java.util.concurrent.TimeUnit;


public class Steps extends PageObjectManager {

        @Given("User launch chrome browser")
        public void user_launch_chrome_browser() {
            WebDriverManager.chromedriver().setup();
            driver = new EdgeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }

        @When("User opens Url")
        public void user_opens_url() {
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        }
        @And("User enters Email and password")
        public void user_enters_email_and_password() {
            login = new LoginPage(driver);
            login.enterUsername();
            login.enterPassword();
        }
        @And("click on login")
        public void click_on_login() {
            login.btnLogin();
        }
        @And("close browser")
        public void close_browser() {
            driver.close();
        }


}


