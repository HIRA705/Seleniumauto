package tests;

import Pages.LoginPage;
import base.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
@Test
    public void testvalidlogin(){
        driver.get("https://practicetestautomation.com/practice-test-login/");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterusername("student");
        loginPage.enterpassword("Password123");
        loginPage.clicksubmitbutton();


    }
}
