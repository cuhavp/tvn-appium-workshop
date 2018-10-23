package parallel;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class IOSParallelTest {

    @Test
    public void testOnServer1() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "11.4");
        capabilities.setCapability("deviceName", "iPhone 6");
        capabilities.setCapability("wdaLocalPort", 8100);
        capabilities.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.apple.mobilecal");

        IOSDriver driver = new IOSDriver<>(new URL("http://localhost:10000/wd/hub"), capabilities);
//        actualTest(driver);
    }

    @Test
    public void testOnServer2() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "12.0");
        capabilities.setCapability("deviceName", "iPhone X");
        capabilities.setCapability("wdaLocalPort", 8101);
        capabilities.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.apple.mobilecal");

        IOSDriver driver = new IOSDriver<>(new URL("http://localhost:10001/wd/hub"), capabilities);
//        actualTest(driver);
    }
}
