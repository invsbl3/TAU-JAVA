package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LoginDataSteps {
    private WebDriver driver;

    @Given("The user access the Login Page One")
    public void the_user_access_the_login_page1() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @When("The user put valid access data One")
    public void the_user_put_valid_access_data1(DataTable dataTable) {
        List<String> data = dataTable.asList();
        driver.findElement(By.id("username")).sendKeys(data.get(0));
        driver.findElement(By.id("password")).sendKeys(data.get(1));
        //driver.findElement(By.cssSelector("#login button")).click();
        driver.findElement(By.cssSelector("form#login button")).click();
    }

    @Then("The user see a login confirmation message One")
    public boolean the_user_see_a_login_confirmation_message1() {
        String text = driver.findElement(By.id("flash")).getText();
        return text.contains("You logged into a secure area");
    }

    @Then("The user logs out One")
    public void the_user_logs_out() {
        driver.findElement(By.xpath("//a[@class[contains(.,'button')]]")).click();
    }


}
