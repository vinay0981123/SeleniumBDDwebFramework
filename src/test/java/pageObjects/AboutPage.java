package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutPage {

    WebDriver ldriver;
    @FindBy(xpath = "//b[contains(text(),'My Current Role')]")
    @CacheLookup
    WebElement lnkMyCurrentRole;
    public  AboutPage(WebDriver rdriver){
        ldriver = rdriver;
        PageFactory.initElements(ldriver , this);
    }

    public void clickOnMyCurrentRole(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        lnkMyCurrentRole.click();
    }


}
