package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {

    private final By slider = By.tagName("input");
    private final By value = By.id("range");
    private final WebDriver driver;

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSlider() {
        driver.findElement(slider).click();
    }

    public void moveSlider(double desiredValue) {
        double currentValue = Double.parseDouble(getSliderValue());
        double difference = currentValue - desiredValue;
        if (difference < 0) {
            do {
                moveSliderRight();
                difference = difference + .5;
            } while (difference != 0);
        } else if (difference > 0) {
            do {
                moveSliderLeft();
                difference = difference - .5;
            } while (difference != 0);
        }
    }

    public void moveSliderLeft() {
        driver.findElement(slider).sendKeys(Keys.ARROW_LEFT);
    }

    public void moveSliderRight() {
        driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
    }

    public String getSliderValue() {
        return driver.findElement(value).getText();
    }
}
