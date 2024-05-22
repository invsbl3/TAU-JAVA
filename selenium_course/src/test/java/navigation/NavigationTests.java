package navigation;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class NavigationTests extends BaseTest {

    @Test
    public void testNavigator(){
        homePage.clickDynamicLoadingPage().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://www.google.com");
    }
    @Test
    public void testSwitchTab(){
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");
    }

    @Test
    public void testSomeTabs(){
        homePage.clickInfiniteScroll();
        getWindowManager().switchToNewWindow();
        String page2Code = getWindowManager().getWindowCode();
//        HomePage page2 = new HomePage(homePage.driver);
        getWindowManager().goTo(HomePage.url);
        getWindowManager().switchToTab("Infinite Scroll");
        getWindowManager().switchtoTabCode(page2Code);

        // im trying to figure out how to put this work into objects and connect them well
        // have to mature some concepts and practices here, but im getting on my way...

    }
}
