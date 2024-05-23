package elementposition;

import basetest.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class ElementPositionTest extends BaseTest {
    @Test
    public void getPositionDimension() {
        driver.get("https://testautomationu.applitools.com/learningpaths.html");
        WebElement logoTAU = driver.findElement(
                By.xpath("//div[@id='app']//header//img"));
        Rectangle recTAULogo = logoTAU.getRect();

        List<WebElement> courseCards = driver.findElements(By.xpath("//div[@class[contains(.,'card')]]"));


        String pf = "%-25s%15s%15s%15s%15s\n";
        System.out.printf(pf, "<h3> Course Title </h3>", "x", "y", "width", "height");
        for (WebElement card : courseCards) {
            Rectangle cardDraw = card.getRect();
            String name = card.findElement(By.xpath(".//h3")).getText();
            System.out.printf(pf, name, cardDraw.getX(), cardDraw.getY(), cardDraw.getWidth(), cardDraw.getHeight());
        }
    }

}
