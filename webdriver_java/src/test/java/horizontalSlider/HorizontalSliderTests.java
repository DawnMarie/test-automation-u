package horizontalSlider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTests extends BaseTests {

    @Test
    public void testSliderValue() {
        var horizontalSliderPage = homePage.clickHorizontalSlider();
        horizontalSliderPage.clickSlider();
        horizontalSliderPage.moveSlider(4);
        assertEquals(horizontalSliderPage.getSliderValue(), "4", "The slider is not at the correct value");
    }

}
