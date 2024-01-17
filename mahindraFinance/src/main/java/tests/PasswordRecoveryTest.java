package tests;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class PasswordRecoveryTest extends BaseTest {

    @Test
    public void testPasswordRecovery() throws InterruptedException {
        MobileElement forgotPasswordLink = driver.findElement(By.id("forgotPasswordLink"));
        MobileElement emailField = driver.findElement(By.id("email"));
        MobileElement recoverButton = driver.findElement(By.id("recoverButton"));

        // Assume a registered email address
        String registeredEmail = "your_registered_email@example.com";

        // Click the 'Forgot Password' link
        forgotPasswordLink.click();

        // Enter a registered email address
        emailField.sendKeys(registeredEmail);

        // Click the 'Recover Password' button
        recoverButton.click();

        // Add a wait to observe the result (you may want to add proper synchronization)
        Thread.sleep(5000);

        // Verification - check if a success message is displayed
        MobileElement successMessage = driver.findElement(By.id("successMessage"));
        assertEquals(successMessage.getText(), "Password recovery instructions sent to your email.");

        // Simulate the password recovery process (steps d to h)...
        // ... (You may need to interact with email services or a test email account)

        // Add assertions for steps d to h
    }
}
