package mockgeolocation;

import basetest.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.emulation.Emulation;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.beans.Visibility;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GeoLocation extends BaseTest {
    @Test
    public void mockGeoLocation() {
        // 1- devtools
        HashMap coordinates = new HashMap() {{
            put("latitude", 32.746940);
            put("longitude", -97.092400);
            put("accuracy", 1.0);
        }};
        ((ChromeDriver) driver).executeCdpCommand("Emulation.setGeolocationOverride", coordinates);
        PrintLoc();
    }

    @Test
    public void mockGeoLocationDevTools() {
        DevTools devTools = ((ChromeDriver) driver).getDevTools();
        devTools.createSession();
        devTools.send(Emulation.setGeolocationOverride(
                Optional.of(52.5043),
                Optional.of(13.4501),
                Optional.of(1)
        ));
        PrintLoc();
    }

    public void PrintLoc() {
        driver.get("https://where-am-i.org/");

        WebElement loc = driver.findElement(By.id("address"));
        WebElement lat = driver.findElement(By.id("latitude"));
        WebElement lon = driver.findElement(By.id("longitude"));
        System.out.println("location: " + loc.getText());
        System.out.println("latitude: " + lat.getText());
        System.out.println("longitude: " + lon.getText());

    }
}
