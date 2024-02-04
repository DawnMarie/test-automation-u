package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.stream.Collectors;

public class DuckDuckGoResultsPage extends AbstractPage {

    public final static By resultLinks = By.cssSelector("a[data-testid='result-title-a']");

    public DuckDuckGoResultsPage(WebDriver driver) {
        super(driver);
    }

    public List<String> getResultsLinkText() {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(resultLinks));

        //Make sure each result contains the word "dragon"
        List<WebElement> results = getDriver().findElements(resultLinks);
        return results.stream().map(WebElement::getText).collect(Collectors.toList());
    }

}
