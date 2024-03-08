package navigation;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTests {

    @Test
    public void testNavigator() {
        homePage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");
    }

    @Test
    public void testSwitchTab() {
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");
    }

    @Test
    public void testOpenInNewWindow() {
        var originalPage = homePage.clickDynamicLoading();
        originalPage.openExample1InNewWindow();
        By startButton = By.cssSelector("#start button");
        getWindowManager().switchToTab(startButton);
    }
}
