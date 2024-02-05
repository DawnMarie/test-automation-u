package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class BaseTests {

    private WebDriver driver;

    public static void main(String[] args) {
        BaseTests test = new BaseTests();
        test.setUp();
    }

    public void setUp() {
        System.setProperty("webdriver.edge.driver", "resources/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com");

        WebElement shiftingLink = driver.findElement(By.linkText("Shifting Content"));
        shiftingLink.click();

        WebElement firstLink = driver.findElement(By.linkText("Example 1: Menu Element"));
        firstLink.click();

        List<WebElement> linksToCount = driver.findElements(By.cssSelector("ul li"));

        System.out.println(linksToCount.size());
        driver.quit();
    }
}
