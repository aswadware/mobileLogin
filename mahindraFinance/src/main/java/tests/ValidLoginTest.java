package tests;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ValidLoginTest extends BaseTest {

    @Test
    public void testValidLogin() throws InterruptedException {
        MobileElement usernameField = driver.findElement(By.id("username"));
        MobileElement passwordField = driver.findElement(By.id("password"));
        MobileElement loginButton = driver.findElement(By.id("loginButton"));

        String validUsername = "your_valid_username";
        String validPassword = "your_valid_password";

        // Perform login
        usernameField.sendKeys(validUsername);
        passwordField.sendKeys(validPassword);
        loginButton.click();

        // Add a wait to observe the result (you may want to add proper synchronization)
        Thread.sleep(5000);

        // Add your verification steps here
    }
}
