package pages;

import org.openqa.selenium.WebDriver;

public class FramesPage extends BasePage {

    public FramesPage(WebDriver driver) {
        super(driver);
    }

    public NestedFramesPage clickNestedFrames() {
        clickLink("Nested Frames");
        return new NestedFramesPage(driver);
    }

    public IFramePage clickIFrame() {
        clickLink("iFrame");
        return new IFramePage(driver);
    }
}
