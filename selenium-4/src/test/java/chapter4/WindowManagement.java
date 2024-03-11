package chapter4;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Site under test in this example is no longer up and functioning
 */
public class WindowManagement {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().minimize();
        driver.get("http://automationpractice.com/index.php");
        System.out.println("Title: " + driver.getTitle());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testNewWindowTab() {
        WebDriver newWindow = driver.switchTo().newWindow(WindowType.TAB);
        driver.manage().window().minimize();
        newWindow.get("http://automationpractice.com/index.php?controller=prices-drop");
        System.out.println("Title: " + newWindow.getTitle());
    }

    @Test
    public void testWorkingInBothWindowTabs() {
        //Automatically open and switch to new window or tab
        driver.manage().window().minimize();
        driver.switchTo().newWindow(WindowType.TAB)
                .get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        System.out.println("Title: " + driver.getTitle());

        // Work in new window or tab
        driver.findElement(By.id("email_create")).sendKeys("Selenium4@tau.com");
        driver.findElement(By.id("SubmitCreate")).click();

        //Get the window ID handles
        Set<String> allWindowTabs = driver.getWindowHandles();
        Iterator<String> iterate = allWindowTabs.iterator();
        String mainFirstWindow = iterate.next();

        // Switch and work in the main window or tab
        driver.manage().window().minimize();
        driver.switchTo().window(mainFirstWindow);
        driver.findElement(By.id("search_query_top")).sendKeys("Shirt");
        driver.findElement(By.name("submit_search")).click();
        System.out.println("Title: " + driver.getTitle());
    }
}
