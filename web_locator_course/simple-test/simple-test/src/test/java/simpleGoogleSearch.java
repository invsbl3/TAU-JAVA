import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;

public class simpleGoogleSearch {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeTest
    public void initWebDriver() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    }

    @Test
    public void searchGoogle() {
        GoogleSearchPage searchPage = new GoogleSearchPage(driver, wait);
        searchPage.loadPage();
        String query = "Beautiful Coffee with Chantilly Cream";
        searchPage.getSearchTexts(query);
    }

    @AfterTest
    public void closeWebDriver() {
        driver.quit();
    }
}
