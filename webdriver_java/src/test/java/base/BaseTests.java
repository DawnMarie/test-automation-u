package base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.WindowManager;

public class BaseTests {

    protected HomePage homePage;
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.edge.driver", "resources/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        goHome();
    }

    @BeforeMethod
    public void goHome() {
        driver.get("https://the-internet.herokuapp.com");
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    public WindowManager getWindowManager() {
        return new WindowManager(driver);
    }
}
