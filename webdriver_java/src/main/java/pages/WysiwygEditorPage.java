package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage extends BasePage {

    private final By textArea = By.id("tinymce");
    private final By decreaseIndentButton = By.cssSelector("button[title='Decrease indent']");

    public WysiwygEditorPage(WebDriver driver) {
        super(driver);
    }

    private void switchToEditArea() {
        String editorIframeId = "mce_0_ifr";
        driver.switchTo().frame(editorIframeId);
    }

    private void switchToMainArea() {
        driver.switchTo().parentFrame();
    }

    public void clearTextArea() {
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void setTextArea(String text) {
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public String getTextFromEditor() {
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }

    public void decreaseIndentation() {
        driver.findElement(decreaseIndentButton).click();
    }
}
