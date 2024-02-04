package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SimpleWebTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeEach
    public void initWebDriver(){
        driver = new EdgeDriver();
        wait = new WebDriverWait(driver, 30);
    }

    @Test
    public void searchDuckDuckGo() {
        // Load the page
        driver.get("https://duckduckgo.com");

        //Enter search phrase
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("silver dragon");

        //Click search button
        WebElement searchButton = driver.findElement(By.cssSelector("button[aria-label='Search']"));
        searchButton.click();

        //Wait for results to appear
        wait.until(ExpectedConditions.titleContains("silver dragon"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[data-testid='result-title-a']")));

        //Make sure each result contains the word "dragon"
        List<WebElement> resultLinks = driver.findElements(By.cssSelector("a[data-testid='result-title-a']"));
        List<String> linkTexts = resultLinks.stream().map(WebElement::getText).collect(Collectors.toList());
        assertThat(linkTexts, everyItem(matchesRegex("(?i).*dragon.*")));

    }

    @AfterEach
    public void quitWebDriver() {
        driver.quit();
    }
}
