package base;

import com.google.common.io.Files;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;


    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver(getChromeOptions());
        //WebDriver eventFiringWebDriver = new EventFiringDecorator().decorate(driver);
        // driver = new EdgeDriver();
        // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        driver.get(HomePage.url);
        homePage = new HomePage(driver);
        setCookie();
    }

    @AfterClass
    public void quitBrowser() {
        driver.quit();
    }

    @AfterMethod
    public void recordFailure(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            var camera = (TakesScreenshot) driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("resources/screenshots/"+result.getName()+".png"));
                System.out.println("Screenshot taken: " + screenshot.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("disable-infobars");
       // options.addArguments("--headless=new");
        return options;
    }

    public void setCookie(){
        Cookie cookie = new Cookie.Builder("with milk", "chocolate-tasteful").domain("the-internet.herokuapp.com").build();
        driver.manage().addCookie(cookie);
    }
    public WindowManager getWindowManager() {
        return new WindowManager(driver);
    }
}
