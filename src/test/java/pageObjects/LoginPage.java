package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver ldriver;
    @FindBy(xpath = "//input[@name=\"username\"]")
    WebElement username;

    @FindBy(xpath = "//input[@name=\"password\"]")
    WebElement password;

    @FindBy(xpath = "//button[@type]")
    WebElement btnsubmit;

    public  LoginPage(WebDriver rdriver){
        ldriver = rdriver;
        PageFactory.initElements(ldriver , this);
    }

    public void enterUsername(){
            username.sendKeys("Admin");
//            ldriver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
    }
    public void enterPassword(){
            password.sendKeys("admin@123");
    }
    public void btnLogin(){
            btnsubmit.click();
    }
}
