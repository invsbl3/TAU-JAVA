package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private final WebDriver driver;
    private final String url = "https://the-internet.herokuapp.com/login";

    public final String password = "SuperSecretPassword!";
    public final String userName = "tomsmith";

    private final By userNameField = By.id("username");
    private final By passwordField = By.id("password");
    private final By loginButton = By.cssSelector("form#login button");


    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUserName(String userName){
        driver.findElement(userNameField).sendKeys(userName);
    }
    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public SecureAreaPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }

}
