package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected final WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

}
