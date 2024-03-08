package horizontalSlider;

import static org.testng.Assert.assertEquals;

import base.BaseTests;
import org.testng.annotations.Test;

public class HorizontalSliderTests extends BaseTests {

    @Test
    public void testSliderValue() {
        var horizontalSliderPage = homePage.clickHorizontalSlider();
        horizontalSliderPage.clickSlider();
        horizontalSliderPage.moveSlider(4);
        assertEquals(horizontalSliderPage.getSliderValue(), "4",
                "The slider is not at the correct value");
    }

}
