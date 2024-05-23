package locators;

import basetest.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

public class RelativeLocators extends BaseTest {

    @Test
    public void testRelativeLocator() {
        driver.get("http://www.automationpractice.pl/index.php");
        WebElement userName = driver.findElement(By.xpath("//div[@class[contains(.,'login-error')]]/div/p[1]"));
        WebElement password = driver.findElement(By.xpath("//div[@class[contains(.,'login-error')]]/div/p[2]"));

        System.out.println("username: " + userName);
        System.out.println("password: " + password);
    }

    @Test
    public void testListOfElements() {
        List<WebElement> allSocialMedia = driver.findElements(with(By.tagName("a")).below(By.className("orangehrm-login-footer")));
        for (WebElement socialMedia : allSocialMedia) {
            System.out.println(socialMedia.getAttribute("href"));
        }
    }
}
