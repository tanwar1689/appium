package Appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.net.URL;

public class demo1 {

    private AndroidDriver driver;
    private static final String DEVICE_NAME = "Demo";
    private static final String PLATFORM_VERSION = "14";
    private static final String APP_PACKAGE = "io.appium.android.apis";
    private static final String APP_ACTIVITY = "io.appium.android.apis.ApiDemos";
    private static final String APPIUM_SERVER_URL = "http://127.0.0.1:4723";

    @BeforeEach
    public void setUp() throws Exception {
        // Set up desired capabilities
        UiAutomator2Options options = new UiAutomator2Options()
                .setDeviceName(DEVICE_NAME)
                .setPlatformVersion(PLATFORM_VERSION)
                .setAppPackage(APP_PACKAGE)
                .setAppActivity(APP_ACTIVITY);

        // Initialize the driver
        driver = new AndroidDriver(new URL(APPIUM_SERVER_URL), options);
    }

    @Test
    public void testOpenApiDemosApp() {
        // Simple test to verify the app opened
        System.out.println("ApiDemos application opened successfully!");
        // You can add more assertions here to verify specific elements
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Access'ibility\"]\n")).click();

    }

//    @AfterEach
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}