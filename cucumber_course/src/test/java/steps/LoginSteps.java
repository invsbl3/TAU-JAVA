package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {

    private WebDriver driver;

    @Given("The user access the Login Page")
    @Given("The user is in the Form Login Page of The Internet")
    public void the_user_is_in_the_form_login_page_of_the_internet() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @When("The user put valid access data")
    public void the_user_enters_valid_username_and_password_that_matches() {
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        //driver.findElement(By.cssSelector("#login button")).click();
        driver.findElement(By.cssSelector("form#login button")).click();
    }

    @When("The user enters a {string} and {string}")
    public void the_user_enters_valid_username_and_password(String username
    , String password) {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        //driver.findElement(By.cssSelector("#login button")).click();
        driver.findElement(By.cssSelector("form#login button")).click();
    }

    @Then("The user see a login confirmation message")
    @Then("The user should see a successful login message if the login information is valid")
    public boolean the_user_should_see_a_successful_login_message() {
        String text = driver.findElement(By.id("flash")).getText();
        return text.contains("You logged into a secure area");
    }

    @Then("The user logs out.")
    public void theUserLogsOut() {
        driver.findElement(By.xpath("//a[@class[contains(.,'button')]]")).click();
    }
}
