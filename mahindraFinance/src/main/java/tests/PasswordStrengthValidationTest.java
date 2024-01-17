package tests;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class PasswordStrengthValidationTest extends BaseTest {

    @Test
    public void testPasswordStrengthValidation() {
        MobileElement passwordField = driver.findElement(By.id("password"));
        MobileElement submitButton = driver.findElement(By.id("submitButton"));

        // Assume weak, medium, and strong passwords
        String weakPassword = "weak123";
        String mediumPassword = "MediumPassword123";
        String strongPassword = "Strong@Password123";

        // Enter a weak password
        passwordField.sendKeys(weakPassword);
        submitButton.click();

        // Verification - check if a validation message for weak password is displayed
        MobileElement validationMessage = driver.findElement(By.id("passwordValidationMessage"));
        assertEquals(validationMessage.getText(), "Password is too weak. Please use a stronger password.");

        // Similar steps for medium and strong password validations...
    }
}
