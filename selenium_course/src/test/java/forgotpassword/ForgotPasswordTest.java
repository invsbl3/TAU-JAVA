package forgotpassword;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTest extends BaseTest {

    @Test
    public void putPassword(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        assertTrue(forgotPasswordPage.isRightUrl(),"not in right page!");
        forgotPasswordPage.setEmail(forgotPasswordPage.emailToPut);
        forgotPasswordPage.clickEmailButton();
    }
}
