package contextmenu;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ContextMenuTests extends BaseTest {
    @Test
    public void contextMenuTest() {
        var contextPage = homePage.clickContextMenuPage();
        contextPage.clickHotSpot();
        assertTrue(contextPage.getAlertText().contains("You selected a context menu"), "Not correct alert context message!");
        contextPage.acceptAlert();
    }
}
