package web;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SafariIphone {

    @Test
    void openSafari() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone X");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.IOS);
        caps.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserType.SAFARI);
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        RemoteWebDriver driver = new IOSDriver( new URL("http://127.0.0.1:4723/wd/hub"),caps);
        driver.get("https://testingvn.com");
    }

}
