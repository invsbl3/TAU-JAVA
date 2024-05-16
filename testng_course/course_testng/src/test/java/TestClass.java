import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.*;

public class TestClass {

    public final SoftAssert softAssert = new SoftAssert();

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Chrome - Set Up System Property");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Open Chrome");
    }

    @BeforeClass
    public void beforeClass() {
        Assert.assertTrue(true, "Open Test Application");
        System.out.println("Open Test Application");
    }


    // note that if `signIn` uses `@BeforeMethod`
    // and `signOut` uses `@AfterMethod`
    // they will execute between each `@Test` method!
    //@BeforeMethod
    @Test(groups = "justUserCheck")
    public void signIn() {
        Assert.assertTrue(true, "Failed Sign In");
        System.out.println("Sign In");
    }

    @Test(dependsOnMethods = "signIn")
    public void searchCustomer() {
        softAssert.assertTrue(true);
        softAssert.assertAll("Failed Search For Customer");
        System.out.println("Search For Customer");
    }

    // check the console log difference with `dependsOn`
    // @Test
    @Test(groups = "searchProduct", dependsOnMethods = "signIn")
    public void searchProduct() {
        softAssert.assertTrue(true);
        softAssert.assertAll("Failed Search For Product");
        System.out.println("Search For Product");
    }

    //@AfterMethod
    @Test(groups = "justUserCheck", dependsOnMethods = "signIn")
    public void signOut() {
        System.out.println("Sign Out");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Close Test Application");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Close Chrome");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Chrome - Clean All Cookies");
    }
}
