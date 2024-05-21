package frames;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTests extends BaseTest {
    @Test
    public void tesWysiwyg(){
     var editorPage = homePage.clickWysiwygEditor();
    editorPage.clearTextArea();

    String text1 = "hello";
    String text2 = "world";

    editorPage.setTextArea(text1);
    editorPage.decreaseIndention();
    editorPage.setTextArea(text2);
    assertEquals(editorPage.getTextFomEditor(), text1+text2,"unmatching texts");
    }
}

