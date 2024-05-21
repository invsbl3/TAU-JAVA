package alerts;
import base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class AlertsTests extends BaseTest {

    @Test
    public void testAcceptAlert() {
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        assertTrue(alertsPage.getAlertText().contains("I am a JS Alert"), "different alert text from expected!");
        alertsPage.acceptAlert();
        assertTrue(alertsPage.getResult().contains("You successfully clicked an alert"));
    }

    @Test
    public void testConfirmAlert() {
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        assertTrue(alertsPage.getAlertText().contains("I am a JS Confirm"), "different alert text from expected!");
        alertsPage.acceptConfirm();
        assertTrue(alertsPage.getResult().contains("You clicked: Ok"));
    }

    @Test
    public void testPromptAlert() {
        var alertsPage = homePage.clickJavaScriptAlerts();
        int maxIter = 10;
        for (int i = 0; i < maxIter; i++) {
            String text = "do you have the time, to listen to me whine " + (i + 1) + " times?";
            alertsPage.triggerPrompt();
            assertTrue(alertsPage.getAlertText().contains("I am a JS prompt"), "different alert text from expected!");

            alertsPage.putTextAndConfirmPrompt(text);
            assertTrue(alertsPage.getResult().contains("You entered: " + text), "not matching text");
        }
    }
}