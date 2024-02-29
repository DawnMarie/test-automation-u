package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NestedFramesPage extends BasePage {

    private final By topFrameId = By.name("frame-top");
    private final By leftFrameId = By.name("frame-left");
    private final By middleFrameId = By.name("frame-middle");
    private final By rightFrameId = By.name("frame-right");
    private final By bottomFrameId = By.name("frame-bottom");

    public NestedFramesPage(WebDriver driver) {
        super(driver);
    }

    public String getTextFromLeftFrame() {
        switchToTopFrame(leftFrameId);
        String text = driver.findElement(By.tagName("body")).getText();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return text;
    }

    public String getTextFromMiddleFrame() {
        switchToTopFrame(middleFrameId);
        String text = driver.findElement(By.tagName("body")).getText();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return text;
    }

    public String getTextFromRightFrame() {
        switchToTopFrame(rightFrameId);
        String text = driver.findElement(By.tagName("body")).getText();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return text;
    }

    public String getTextFromBottomFrame() {
        switchToBottomFrame();
        String text = driver.findElement(By.tagName("body")).getText();
        driver.switchTo().parentFrame();
        return text;
    }

    private void switchToTopFrame(By frameId) {
        WebElement topFrame = driver.findElement(topFrameId);
        driver.switchTo().frame(topFrame);
        WebElement frame = driver.findElement(frameId);
        driver.switchTo().frame(frame);
    }

    private void switchToBottomFrame() {
        WebElement bottomFrame = driver.findElement(bottomFrameId);
        driver.switchTo().frame(bottomFrame);
    }

}
