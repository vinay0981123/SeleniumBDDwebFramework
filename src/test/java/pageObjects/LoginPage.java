package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver ldriver;
    @FindBy(xpath = "//b[contains(text(),'My Current Role')]")
    @CacheLookup
    WebElement lnkMyCurrentRole;
    public  LoginPage(WebDriver rdriver){
        ldriver = rdriver;
        PageFactory.initElements(ldriver , this);
    }

    public void enterUsername(){

    }
    public void enterPassword(){

    }
    public void btnLogin(){

    }
}
