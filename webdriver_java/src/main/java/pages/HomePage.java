package pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public ContextMenuPage clickContextMenu() {
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    public DropdownPage clickDropDown() {
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoading() {
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public FileUploadPage clickFileUpload() {
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public ForgotPasswordPage clickForgotPassword() {
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    public LoginPage clickFormAuthentication() {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public FramesPage clickFrames() {
        clickLink("Frames");
        return new FramesPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSlider() {
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public HoversPage clickHovers() {
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScroll() {
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

    public AlertsPage clickJavaScriptAlerts() {
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public KeyPressesPage clickKeyPresses() {
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public LargeAndDeepDomPage clickLargeAndDeepDom() {
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }

    public MultipleWindowsPage clickMultipleWindows() {
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }

    public WysiwygEditorPage clickWysiwygEditor() {
        clickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }
}
