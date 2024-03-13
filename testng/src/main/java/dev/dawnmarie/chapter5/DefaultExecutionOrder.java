package dev.dawnmarie.chapter5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

/**
 * Please note this testing site is no longer available.
 */
@Test
public class DefaultExecutionOrder
{
    WebDriver driver;

    @BeforeClass
    public void setUp () throws Exception
    {
        System.setProperty("webdriver.edge.driver", "src/main/resources/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("http://automationpractice.com/index.php");
    }

    @Test(priority = 1)
    public void signIn ()
    {
        driver.findElement(By.xpath("//div[@class='header_user_info']/a")).click();

        WebElement emailAddress = driver.findElement(By.id("email"));
        //Highlighter.highlightElement(driver, emailAddress);
        emailAddress.sendKeys("TestNG@Framework.com");

        WebElement password = driver.findElement(By.id("passwd"));
        //Highlighter.highlightElement(driver, password);
        password.sendKeys("TestNG1234");

        WebElement buttonSignIn = driver.findElement(By.id("SubmitLogin"));
        //Highlighter.highlightElement(driver, buttonSignIn);
        buttonSignIn.click();

        System.out.println("1. Sign In");
    }

    @Test(priority = 2)

    public void searchTShirt ()
    {
        WebElement menu = driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li/a[text()='T-shirts']"));
        //Highlighter.highlightElement(driver, menu);
        menu.click();

        WebElement searchBox = driver.findElement(By.id("search_query_top"));
        //Highlighter.highlightElement(driver, searchBox);
        searchBox.sendKeys("Blue");

        WebElement buttonSearch = driver.findElement(By.xpath("//*[@id='searchbox']/button"));
        //Highlighter.highlightElement(driver, buttonSearch);
        buttonSearch.click();

        System.out.println("2. Search For T-Shirt");
    }

    @Test(priority = 3)

    public void signOut ()
    {
        WebElement linkSignOut = driver.findElement(By.className("logout"));
        //Highlighter.highlightElement(driver, linkSignOut);
        linkSignOut.click();

        System.out.println("3. Sign Out");
    }

    @AfterClass
    public void tearDown () throws Exception
    {
        driver.quit();
    }
}