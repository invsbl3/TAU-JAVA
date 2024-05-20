package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.security.auth.login.Configuration;

public class ForgotPasswordPage {
    private final WebDriver driver;
    public static final String emailToPut = "foo@email.com";
    public static final String linkText = "Forgot Password";

    private static final String url = "https://the-internet.herokuapp.com/forgot_password";

    By loginButton = By.cssSelector("form#forgot_password button");

    By emailField = By.cssSelector("input#email");


    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public boolean isRightUrl(){
        return driver.getCurrentUrl().equals(this.url);
    }


    public void setEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void clickEmailButton() {
        driver.findElement(loginButton).click();
        System.out.println("Clicked send email button");
    }
}
