package dev.dawnmarie.chapter3;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class UserSearchTests {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.edge.driver", "src/main/resources/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        System.out.println("1. Open Edge & Application");
    }

    @Test
    public void signIn() {
        WebElement textUsername = driver.findElement(By.name("username"));
        //Highlighter.highlightElement(driver, textUsername);
        textUsername.sendKeys("Admin");

        WebElement textPassword = driver.findElement(By.name("password"));
        //Highlighter.highlightElement(driver, textPassword);
        textPassword.sendKeys("admin123");

        WebElement buttonLogin = driver.findElement(By.className("orangehrm-login-button"));
        //Highlighter.highlightElement(driver, buttonLogin);
        buttonLogin.click();

        System.out.println("2. Sign In");
    }

    @Test
    public void userSearch() {
        WebElement menuAdmin = driver.findElement(By.xpath("//span[text()='Admin']"));
        //Highlighter.highlightElement(driver, menuAdmin);
        menuAdmin.click();

        WebElement textUserName = driver.findElement(By.xpath("//label[text()='Username']/../following-sibling::div/input"));
        //Highlighter.highlightElement(driver, textUserName);
        textUserName.sendKeys("Admin");

        WebElement buttonSearch = driver.findElement(By.xpath("//button[contains(@type,\"submit\")]"));
        //Highlighter.highlightElement(driver, buttonSearch);
        buttonSearch.click();

        System.out.println("3. Search For User");
    }

    @Test
    public void userSignOut() {
        WebElement linkWelcome = driver.findElement(By.xpath("//li[contains(@class,'oxd-userdropdown')]"));
        //Highlighter.highlightElement(driver, linkWelcome);
        linkWelcome.click();

        WebElement linkLogout = driver.findElement(
                By.xpath("//a[contains(@href,'logout')]"));
        //Highlighter.highlightElement(driver, linkLogout);
        linkLogout.click();

        System.out.println("4. Sign Out");
    }

    @AfterClass
    public void tearDown() {
        driver.close();
        System.out.println("5. Close Edge & Application");
    }
}
