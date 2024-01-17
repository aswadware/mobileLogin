package tests;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class ForgotPasswordRedirectTest extends BaseTest {

    @Test
    public void testForgotPasswordRedirect() {
        MobileElement forgotPasswordLink = driver.findElement(By.id("forgotPasswordLink"));

        // Click the 'Forgot Password' link
        forgotPasswordLink.click();

        // Verification - check if the user is redirected to the password recovery page
        String currentUrl = driver.getCurrentUrl();
        assertEquals(currentUrl, "expected_recovery_page_url");
    }
}
