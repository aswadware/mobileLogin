package tests;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class InvalidLoginTest extends BaseTest {

    @Test
    public void testInvalidLogin() throws InterruptedException {
        MobileElement usernameField = driver.findElement(By.id("username"));
        MobileElement passwordField = driver.findElement(By.id("password"));
        MobileElement loginButton = driver.findElement(By.id("loginButton"));
        MobileElement errorMessageBox = driver.findElement(By.id("errorMessageBox"));

        String invalidUsername = "your_invalid_username";
        String invalidPassword = "your_invalid_password";

        // Perform login with invalid credentials
        usernameField.sendKeys(invalidUsername);
        passwordField.sendKeys(invalidPassword);
        loginButton.click();

        // Add a wait to observe the result (you may want to add proper synchronization)
        Thread.sleep(5000);

        // Verification - check if the error message is displayed
        if (errorMessageBox.isDisplayed()) {
            String errorMessage = errorMessageBox.getText();
            System.out.println("Error message displayed: " + errorMessage);
        } else {
            System.out.println("Error message not displayed. Test failed.");
        }
    }
}
