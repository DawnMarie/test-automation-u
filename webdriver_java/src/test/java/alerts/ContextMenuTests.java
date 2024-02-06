package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testContextMenuAlert() {
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.clickHotSpot();
        String text = contextMenuPage.alert_getText();
        contextMenuPage.alert_clickToAccept();
        assertEquals(text, "You selected a context menu", "Context menu alert did not appear as expected");
    }

}
