package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.URI;
import java.net.URL;

public class BaseTest {

    @BeforeMethod
    public void setup() throws Exception {
        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.setCapability("browserVersion", "100");
        chromeOptions.setCapability("platformName", "Windows");
        chromeOptions.setCapability("se:name", "My simple test");
        chromeOptions.setCapability("se:sampleMetadata", "Sample metadata value");

        URL link = new URI("http://localhost:4444/wd/hub").toURL();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        WebDriver driver = new RemoteWebDriver(link, capabilities);
        driver.get("http://www.google.com");
        driver.quit();
    }
    @Test
    public void simpleTest(){
        System.out.println("test");
    }

}
