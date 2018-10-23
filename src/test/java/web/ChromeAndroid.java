package web;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ChromeAndroid {


    @Test
    void openChromeAndroid() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"android");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        caps.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserType.CHROME);
        RemoteWebDriver driver = new RemoteWebDriver( new URL("http://127.0.0.1:4723/wd/hub"),caps);
        driver.get("https://testingvn.com");
    }

}
