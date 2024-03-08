package pages;

import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {

    private final WebDriver driver;
    private final By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFromDropdown(String option) {
        findDropdownElement().selectByVisibleText(option);
    }

    public List<String> getSelectedOptions() {
        List<WebElement> selectedElements = findDropdownElement().getAllSelectedOptions();
        return selectedElements.stream().map(WebElement::getText).collect(Collectors.toList());
    }

    private Select findDropdownElement() {
        return new Select(driver.findElement(dropdown));
    }

}
