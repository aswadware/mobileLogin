package tests;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.Assert.assertFalse;

public class EmptyLoginButtonStateTest extends BaseTest {

    @Test
    public void testEmptyLoginButtonState() {
        MobileElement loginButton = driver.findElement(By.id("loginButton"));

        // Verification - check if the 'Login' button is initially disabled
        assertFalse(loginButton.isEnabled());
    }
}
