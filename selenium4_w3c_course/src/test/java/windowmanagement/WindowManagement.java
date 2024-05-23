package windowmanagement;

import basetest.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class WindowManagement extends BaseTest {

    @Test
    public void testNewWindowTab(){
        WebDriver newWindow = driver.switchTo().newWindow(WindowType.TAB);
    }
    @Test
    public void testWorkingInBothWindowTabs(){
        driver.switchTo().newWindow(WindowType.TAB)
                .get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
        System.out.println("Title: "+driver.getTitle());

        driver.findElement(By.id("email_create")).sendKeys("Selenium4@TAU.com");

        driver.findElement(By.id("SubmitCreate")).click();
        Set<String> allWindowTabs = driver.getWindowHandles();
        Iterator<String> iterate = allWindowTabs.iterator();
        String mainFirstWindow = iterate.next();
        driver.switchTo().window(mainFirstWindow);
        driver.findElement(By.id("search_query_top")).sendKeys("Shirt");
        driver.findElement(By.name("submit_search")).click();
        System.out.println("Title: "+driver.getTitle());

    }



}
