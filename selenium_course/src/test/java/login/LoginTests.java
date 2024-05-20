package login;
import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;
import static org.testng.Assert.*;
public class LoginTests extends BaseTest {
    @Test
    public void testSuccessfullLogin() {
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUserName(loginPage.userName);
        loginPage.setPassword(loginPage.password);
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        String successfulLoginMessage = "You logged into a secure area!";
        String errorMsg = "Not Equal Message in secure area!";
        assertTrue(secureAreaPage.getAlertText().contains(successfulLoginMessage), errorMsg);
    }

}
