package basetest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.URI;
import java.net.URL;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {
        URL home = new URI("http://localhost:4444/wd/hub").toURL();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, getChromeOptions());

        driver = new RemoteWebDriver(home, capabilities);
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        System.out.println("Title: " + driver.getTitle());
        driver.get("http://google.com");
        driver.quit();
    }

    @Test
    public void test(){
        driver.get("http://google.com");
        driver.quit();
    }

    private ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("disable-infobars");
        //options.addArguments("--headless=new");
        // options.setCapability("browserVersion", "100");
        options.setCapability("platformName", "Windows");
        options.setCapability("se:name", "My simple test");
        options.setCapability("se:sampleMetadata", "Sample metadata value");

        return options;
    }
}
