package testing;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
public class NewsAppTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "realme RMX2161");
            capabilities.setCapability("appPackage", "com.example.newsapp");
            capabilities.setCapability("appActivity", "com.example.newsapp.MainActivity"); 
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
 
            AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), capabilities);
 
            // Wait for the RecyclerView to load
            Thread.sleep(3000);
 
            // Click on the first News item in the RecyclerView
            List<WebElement> newstitles = driver.findElements(MobileBy.className("android.widget.TextView"));
            if (!newstitles.isEmpty()) {
                newstitles.get(0).click();
            }
            Thread.sleep(2000);
       	 
            // Verify News details
            WebElement NewsTitle = driver.findElement(MobileBy.id("com.example.newsapp:id/titleTextView"));
            System.out.println("News Name: " + NewsTitle.getText());
 
            WebElement NewsDescription = driver.findElement(MobileBy.id("com.example.newsapp:id/titleTextView"));
            System.out.println("News Description: " + NewsDescription.getText());
 
            // Close the driver
            driver.quit();
 
        } catch (Exception e) {
            e.printStackTrace();}

	}

}
