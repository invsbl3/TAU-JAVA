package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    public static final String url = "https://the-internet.herokuapp.com/";
    public WebDriver driver;

    // constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication() {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropDown() {
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public HoversPage clickHovers() {
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public ForgotPasswordPage clickForgotPassword() {
        clickLink(ForgotPasswordPage.linkText);
        return new ForgotPasswordPage(driver);
    }

    public void clickLink(String linkText) {
        String searchString = "//a[contains(.,'" + linkText + "')]";
        driver.findElement(By.xpath(searchString)).click();
    }
}
