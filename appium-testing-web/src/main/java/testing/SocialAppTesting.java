package testing;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SocialAppTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "realme RMX2161");
            capabilities.setCapability("appPackage", "com.example.social");
            capabilities.setCapability("appActivity", "com.example.social.MainActivity"); 
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
 
            AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), capabilities);
 
            // Wait for the RecyclerView to load
            Thread.sleep(3000);
 
            // Click on the first News item in the RecyclerView
            List<WebElement> users = driver.findElements(MobileBy.className("android.widget.TextView"));
            if (!users.isEmpty()) {
                users.get(0).click();
            }
            Thread.sleep(2000);
       	 
            // Verify News details
            WebElement useremail = driver.findElement(MobileBy.id("com.example.social:id/name_text_view"));
            System.out.println("User Name: " + useremail.getText());
 
            WebElement UserDescription = driver.findElement(MobileBy.id("com.example.social:id/name_text_view"));
            System.out.println("User Description: " + UserDescription.getText());
            System.out.println("Test Successfully completed!!");
 
            // Close the driver
            driver.quit();
 
        } catch (Exception e) {
            e.printStackTrace();}

	}

}
