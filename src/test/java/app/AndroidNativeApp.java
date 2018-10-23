package app;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidNativeApp {
    @Test
    void openChromeAndroid() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"android");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.google.android.calculator");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.android.calculator2.Calculator");
        new AndroidDriver( new URL("http://127.0.0.1:4723/wd/hub"),caps);
    }

}
