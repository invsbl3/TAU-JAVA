package js;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DropdownPage;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertTrue;

public class JavaScriptTests extends BaseTest {
    @Test
    public void testScrollToTable() {
        homePage.clickLargeAndDeepDom().scrollToTable();
        String stopbeforequit = "I want to see the scroll made before close, so breakpointed here... it worked!";
    }

    @Test
    public void testScrollToFifthParagraph() {
        homePage.clickInfiniteScroll().scrollToParagraph(15);
        // bad habits to stop in debug mode is creating variables like this.
        String dontGoAway = "say what to say";
    }

    @Test
    public void dropdownWithJS() {
        DropdownPage dropdownPage = homePage.clickDropDown();
        dropdownPage.changeDropDownToMultipleWithJavaScript();
        dropdownPage.selectFromDropDown("Option 1");
        dropdownPage.selectFromDropDown("Option 2");
        ArrayList<String> options = new ArrayList<String>();
        options.add("Option 1");
        options.add("Option 2");

        ArrayList<String> selectedOptions = dropdownPage.getSelectedOptions();
        assertTrue(selectedOptions.containsAll(options), "Options not Match!");
        // they are selected, but when I inspect the page-code in the stop bellow, the
        // Option 2 has no attribute selectec='selected'
        // but, in the GUI, both options are selected, and the variable
        String stop = "stop";
    }
}
