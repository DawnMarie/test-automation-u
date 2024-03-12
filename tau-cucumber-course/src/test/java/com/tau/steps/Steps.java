package com.tau.steps;

import static org.junit.Assert.assertTrue;

import com.tau.base.BaseUtil;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;
import javax.sound.midi.Soundbank;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Steps extends BaseUtil {

    private BaseUtil baseUtil;

    public Steps(BaseUtil util) {
        this.baseUtil = util;
    }

    private WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.edge.driver", "src/test/resources/msedgedriver.exe");
        driver = new EdgeDriver();
    }

    @Given("I am in the login page")
    @Given("I am in the login page of the Para Bank Application")
    public void i_am_in_the_login_page_of_the_Para_Bank_Application() {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("I enter valid {string} and {string} with {string}")
    public void i_enter_valid_credentials(String username, String password, String userFullName) {

        baseUtil.userFullName = userFullName;

        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("username")).submit();
    }

    @Then("I should be taken to the Overview page")
    public void i_should_be_taken_to_the_Overview_page() throws InterruptedException {

        Thread.sleep(5000);

        String actualUserFullName = driver.findElement(By.className("smallText")).getText();

        System.out.println(baseUtil.userFullName);

        assertTrue(actualUserFullName, actualUserFullName.contains(baseUtil.userFullName));

        driver.findElement(By.linkText("Log Out")).click();
    }

    @After
    public void quit() {
        driver.quit();
    }

}
