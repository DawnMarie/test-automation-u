package forgotPassword;

import static org.testng.Assert.assertTrue;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

public class ForgetPasswordTests extends BaseTests {

    @Test
    public void testSuccessfulForgotPassword() {
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmail("self@dawn-marie.dev");
        EmailSentPage emailSentPage = forgotPasswordPage.clickRetrievePasswordButton();
        assertTrue(emailSentPage.getConfirmationMessage().contains("Your email's been sent!"),
                "Confirmation message is incorrect.");
    }
}
