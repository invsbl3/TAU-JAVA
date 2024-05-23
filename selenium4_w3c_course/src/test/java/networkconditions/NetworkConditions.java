package networkconditions;

import basetest.BaseTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v123.network.Network;
import org.openqa.selenium.devtools.v123.network.model.ConnectionType;
import org.testng.annotations.BeforeMethod;

import java.util.Optional;

import org.testng.annotations.Test;

public class NetworkConditions extends BaseTest {
    @Test
    public void enableSlowConnection() {
        DevTools devTools = ((ChromeDriver) driver).getDevTools();
        devTools.createSession();
        devTools.send(Network.enable(
                Optional.empty(),
                Optional.empty(),
                Optional.empty()
        ));
        devTools.send(Network.emulateNetworkConditions(
                false,
                150,
                10000,
                8000,
                Optional.of(ConnectionType.CELLULAR4G)
        ));
        driver.get("https://applitools.com/");
        System.out.println("Enable Slow Network: " + driver.getTitle());
    }

    @Test
    public void doNotEnableNetwork() {
        driver.get("https://applitools.com/");
        System.out.println("Do Not Enable Network: " + driver.getTitle());
    }
}
