package consolelogs;

import basetest.BaseTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.log.Log;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ConsoleLogs extends BaseTest {

    @Test
    public void viewBrowserConsoleLogs() {
        // control the devTools
        DevTools devTools = ((ChromeDriver) driver).getDevTools();
        devTools.createSession();
        // enable logs
        devTools.send(Log.enable());
        // listen logs
        //String pf = "%-20s%20s%20s\n";
        //System.out.printf(pf, "Level", "Text", "Broken URL");
        devTools.addListener(Log.entryAdded(), logEntry -> {
            //  System.out.printf(pf, logEntry.getLevel(), logEntry.getText(), logEntry.getUrl());
            System.out.println("--------------------");
            System.out.println("Level: " + logEntry.getLevel());
            System.out.println("Text: " + logEntry.getText());
            System.out.println("Broken URL: " + logEntry.getUrl());
        });
        //load automation
        driver.get("https://the-internet.herokuapp.com/broken_images");
    }
}
