package ai;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

public class IOSPhotoApp {
    private String BUNDLE_ID = "com.apple.mobileslideshow";
    private IOSDriver driver;
    private WebDriverWait wait;

    private By search = MobileBy.custom("search");
    private By cancel = MobileBy.AccessibilityId("Cancel");


    @BeforeTest
    public void setUp() throws IOException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "iOS");
        caps.setCapability("platformVersion", "12.0");
        caps.setCapability("deviceName", "iPhone 6");
        caps.setCapability("bundleId", BUNDLE_ID);

        HashMap<String, String> customFindModules = new HashMap<>();
        customFindModules.put("ai", "test-ai-classifier");

        caps.setCapability("customFindModules", customFindModules);
        caps.setCapability("shouldUseCompactResponses", false);

        driver = new IOSDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), caps);
        wait = new WebDriverWait(driver, 10);
    }

    @AfterTest
    public void tearDown() {
        try {
            driver.quit();
        } catch (Exception ign) {
        }
    }

    @Test
    public void testFindElementUsingAI() throws InterruptedException {
        // find and click on the search button using the classifier
        driver.findElement(search).click();
        Thread.sleep(10000);
        // prove that the click was successful by locating the 'cancel' button
        wait.until(ExpectedConditions.presenceOfElementLocated(cancel));
    }
}
