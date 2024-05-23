package screenshots;

import basetest.BaseTest;
import com.google.common.io.Files;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Screenshots extends BaseTest {
    @Test
    public void takeWebElementScreenshot() {
        driver.get("https://applitools.com/");
        WebElement nextGenerationPlatform = driver.findElement(By.cssSelector("#post-8 h1"));
        File screenshot = nextGenerationPlatform.getScreenshotAs(OutputType.FILE);
        try {
            String path = "resources/screenshots/" + screenshot.getName();
            Files.move(screenshot, new File(path));
            System.out.println(path);
            System.out.println("Screenshot taken: " + screenshot.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void takeWebElementPageSectionScreenshot() throws IOException {
        WebElement applitoolsPageSection = driver.findElement(By.cssSelector("#post-8>header"));
        File source = applitoolsPageSection.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("Applitools Page Section.png"));
    }

    @Test
    public void takeFullPageScreenshot() throws IOException {
        File source = ((FirefoxDriver) driver).getFullPageScreenshotAs(OutputType.FILE);
        FileHandler.copy(source, new File("Full Page Screenshot.png"));
    }
}
