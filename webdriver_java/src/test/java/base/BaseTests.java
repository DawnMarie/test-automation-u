package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pages.HomePage;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    public static void main(String[] args) {
        BaseTests test = new BaseTests();
        test.setUp();
    }

    public void setUp() {
        System.setProperty("webdriver.edge.driver", "resources/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com");

        homePage = new HomePage(driver);

        driver.quit();
    }
}
