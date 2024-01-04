package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {
        private WebDriver driver;
        public void set(){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://google.com");
        }

        public static void main(String[] args) {
            Testing obj1 = new Testing();
            obj1.set();
        }
    }


