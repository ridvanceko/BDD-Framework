package pages.com.productpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductLoginPage {


    public ProductLoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="ctl00_MainContent_username")
    public WebElement username;

    @FindBy(id="ctl00_MainContent_password")
    public WebElement password;

    @FindBy(id="ctl00_MainContent_login_button")
    public WebElement loginButton;


    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        loginButton.click();
    }



}
