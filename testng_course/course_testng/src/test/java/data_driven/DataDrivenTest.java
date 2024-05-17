package data_driven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;
// import org.testng.asserts.SoftAssert;


public class DataDrivenTest {

    public final String printFormat = "%-20s%20s%20s\n";


    // public static final SoftAssert softAssert = new SoftAssert();

    public static WebDriver driver = new ChromeDriver();

    @BeforeTest
    @Parameters({"BrowserType"})
    public void setBrowser(String browserType) {
        if (
                browserType.equalsIgnoreCase("Google Chrome") && !(driver.getClass().getSimpleName()).equalsIgnoreCase("ChromeDriver")
        ) {
            driver = new ChromeDriver();
            System.out.println(driver.getClass().getSimpleName());
        }

        if (
                browserType.equalsIgnoreCase("Edge") && !(driver.getClass().getSimpleName()).equalsIgnoreCase("EdgeDriver")

        ) {
            driver = new EdgeDriver();
        }
        // driver.manage().window().maximize();

        System.out.println("\nBrowser: " + browserType);
    }

    @BeforeTest(dependsOnMethods = "setBrowser")
    public void printTestHeader() {
        // System.out.println("Log In Credentials: ");
        System.out.printf(printFormat, "User Name", "Password", "Successful Login?");
    }

    @Test(dataProviderClass = DataForTest.class, dataProvider = "loginDataPractice")
    public void logIn(String userName, String password) {

        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.findElement(By.id("username")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("submit")).click();

        String actualResult = driver.getCurrentUrl();
        String expectedResult = "practicetestautomation.com/logged-in-successfully/";

        boolean loggedIn = actualResult.contains(expectedResult);

        // softAssert.assertTrue(loggedIn, "Incorrect Login");
        // softAssert.assertAll("Incorrect Login");
        System.out.printf(printFormat, userName, password, loggedIn);
    }


    @AfterTest
    public void closeBrowser(){
        driver.close();
    }
    @AfterSuite
    public void quitBrowser() {
        driver.quit();
    }

}
