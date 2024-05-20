package old;

import org.openqa.selenium.By;
// import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.util.List;

public class BaseTestsOld {
    public static WebDriver driver;
    protected HomePage homePage;


    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        // driver.manage().window().maximize();
        // driver.manage().window().fullscreen();
        // driver.manage().window().setSize(new Dimension(375, 812));
        driver.get("https://the-internet.herokuapp.com");
        HomePage homePage = new HomePage(driver);
    }

    @AfterClass
    public static void closeBrowser() {
        driver.quit();
    }


    public static void oldTests() {
        BaseTestsOld test = new BaseTestsOld();
        test.setUp();
        test.countTitleAndLinks();
        test.closeBrowser();

        test.setUp();
        test.navigateThroughSite();
        test.closeBrowser();

        // if findElement finds more than 1 element,
        // it takes the first one and go ahead not throwing
        // errors!!!!
        test.setUp();
        WebElement link = driver.findElement(By.tagName("a"));
        System.out.println(link.getAttribute("href"));
    }

    public void navigateThroughSite() {
        driver.findElement(By.xpath("//a[contains(. , 'Shifting')]")).click();
        driver.findElement(By.xpath("//a[contains(.,'Example 1')]")).click();
        List<WebElement> linkedList = driver.findElements(By.xpath("//ul[1]/li"));
        for (WebElement text : linkedList) {
            System.out.println("item text:" + text.getText());
        }
    }

    public void countTitleAndLinks() {
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Quantity of links in this page: " + links.size());
        WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
        inputsLink.click();
        System.out.println("Page's Title: " + driver.getTitle());
    }
}
