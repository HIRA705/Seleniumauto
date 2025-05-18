package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    private By usernameField = By.id("username");
    private By PasswordField = By.id("password");
    private By submitbutton=  By.xpath("//*[@id=\"submit\"]");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterusername(String username){
        driver.findElement(By.id("username")).sendKeys("student");
    }
    public void enterpassword(String password){
        driver.findElement(By.id("password")).sendKeys("Password123");
    }

    public void clicksubmitbutton() {
        driver.findElement(submitbutton).click();
    }
}
