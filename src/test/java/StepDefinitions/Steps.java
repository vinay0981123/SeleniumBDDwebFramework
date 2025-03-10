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
import pageObjects.*;
import readData.ReadExcelData;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;
import java.util.concurrent.TimeUnit;

public class Steps extends PageObjectManager {
    private WebDriver driver;
    Logger logger = Logger.getLogger("Steps.class");

        @Given("User launch chrome browser")
        public void user_launch_chrome_browser() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
//            login = new LoginPage(driver);
            driver.get("https://demoqa.com/");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }


}


