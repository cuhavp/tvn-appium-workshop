package ai;

import org.junit.Before;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

public class IOSApp {
    private String BUNDLE_ID = "com.apple.mobileslideshow";
    private IOSDriver driver;
    private WebDriverWait wait;

    private By search = MobileBy.custom("search");
    private By cancel = MobileBy.AccessibilityId("Cancel");

    @Before
    public void setUp() throws IOException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "iOS");
        caps.setCapability("platformVersion", "11.4");
        caps.setCapability("deviceName", "iPhone 6");
        caps.setCapability("bundleId", BUNDLE_ID);

        HashMap<String, String> customFindModules = new HashMap<>();
        customFindModules.put("ai", "test-ai-classifier");

        caps.setCapability("customFindModules", customFindModules);
        caps.setCapability("shouldUseCompactResponses", false);

        driver = new IOSDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), caps);
        wait  = new WebDriverWait(driver, 10);
    }

    @After
    public void tearDown() {
        try {
            driver.quit();
        } catch (Exception ign) {}
    }

    @Test
    public void testFindElementUsingAI() {
        // find and click on the search button using the classifier
        driver.findElement(search).click();
        driver.findElementByCu

        // prove that the click was successful by locating the 'cancel' button
        wait.until(ExpectedConditions.presenceOfElementLocated(cancel));
    }
}
