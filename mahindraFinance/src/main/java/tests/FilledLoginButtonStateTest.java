package tests;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class FilledLoginButtonStateTest extends BaseTest {

    @Test
    public void testFilledLoginButtonState() {
        MobileElement usernameField = driver.findElement(By.id("username"));
        MobileElement passwordField = driver.findElement(By.id("password"));
        MobileElement loginButton = driver.findElement(By.id("loginButton"));

        // Assume valid credentials
        String validUsername = "your_valid_username";
        String validPassword = "your_valid_password";

        // Enter valid credentials
        usernameField.sendKeys(validUsername);
        passwordField.sendKeys(validPassword);

        // Verification - check if the 'Login' button is enabled with valid input
        assertTrue(loginButton.isEnabled());
    }
}
