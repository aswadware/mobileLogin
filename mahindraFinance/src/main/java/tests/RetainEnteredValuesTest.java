package tests;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class RetainEnteredValuesTest extends BaseTest {

    @Test
    public void testRetainEnteredValues() throws InterruptedException {
        MobileElement usernameField = driver.findElement(By.id("username"));
        MobileElement passwordField = driver.findElement(By.id("password"));
        MobileElement loginButton = driver.findElement(By.id("loginButton"));

        String invalidUsername = "your_invalid_username";
        String invalidPassword = "your_invalid_password";

        // Perform login with invalid credentials
        usernameField.sendKeys(invalidUsername);
        passwordField.sendKeys(invalidPassword);
        loginButton.click();

        // Add a wait to observe the result (you may want to add proper synchronization)
        Thread.sleep(5000);

        // Verification - check if the entered values are retained
        assertEquals(usernameField.getAttribute("value"), invalidUsername);
        assertEquals(passwordField.getAttribute("value"), invalidPassword);
    }
}
