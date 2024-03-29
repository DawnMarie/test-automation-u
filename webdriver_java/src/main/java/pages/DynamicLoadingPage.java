package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage extends BasePage {

    private final String linkXpath_Format = ".//a[contains(text(), '%s')]";
    private final By link_Example1 = By.xpath(String.format(linkXpath_Format, "Example 1"));
    private final By link_Example2 = By.xpath(String.format(linkXpath_Format, "Example 2"));

    public DynamicLoadingPage(WebDriver driver) {
        super(driver);
    }

    public DynamicLoadingExample1Page clickExample1() {
        driver.findElement(link_Example1).click();
        return new DynamicLoadingExample1Page(driver);
    }

    public DynamicLoadingExample2Page clickExample2() {
        driver.findElement(link_Example2).click();
        return new DynamicLoadingExample2Page(driver);
    }

    public DynamicLoadingExample1Page openExample1InNewWindow() {
        driver.findElement(link_Example1).sendKeys(Keys.CONTROL, Keys.RETURN);
        driver.findElement(link_Example1).click();

        return new DynamicLoadingExample1Page(driver);
    }

}
