package wait;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample1Page;
import pages.DynamicLoadingExample2Page;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTest {
    @Test
    public void testExample1() {
        var loadingPage = homePage.clickDynamicLoadingPage();
        DynamicLoadingExample1Page example1Page = loadingPage.clickExample1();
        example1Page.clickStart();
        assertEquals(example1Page.getLoadedText(), "Hello World!", "Expected text not matching!");
    }
    @Test
    public void testExample2() {
        var loadingPage = homePage.clickDynamicLoadingPage();
        DynamicLoadingExample2Page example2Page = loadingPage.clickExample2();
        example2Page.clickStart();
        assertEquals(example2Page.getLoadedText(), "Hello World!", "Expected text not matching!");
    }
}
