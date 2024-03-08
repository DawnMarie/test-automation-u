package frames;

import static org.testng.Assert.assertEquals;

import base.BaseTests;
import org.testng.annotations.Test;

public class FrameTests extends BaseTests {

    @Test
    public void testWysiwyg() {
        var editorPage = homePage.clickWysiwygEditor();
        editorPage.clearTextArea();

        String text1 = "hello ";
        String text2 = "world";

        editorPage.setTextArea(text1);
        editorPage.decreaseIndentation();
        editorPage.setTextArea(text2);

        assertEquals(editorPage.getTextFromEditor(), text1 + text2,
                "Text from editor is incorrect.");
    }

    @Test
    public void testNestedFrames() {
        var nestedPage = homePage.clickFrames().clickNestedFrames();

        String leftText = "LEFT";
        String bottomText = "BOTTOM";

        assertEquals(nestedPage.getTextFromLeftFrame().strip(), leftText,
                "Left frame is incorrect.");
        assertEquals(nestedPage.getTextFromBottomFrame().strip(), bottomText,
                "Bottom frame is incorrect.");
    }

}
