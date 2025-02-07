package testing;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class VehicleClaimTest {

    public static void main(String[] args) {

       // AndroidDriver<AndroidElement> driver;

        // Setup desired capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "realme RMX2161");
        caps.setCapability("appPackage", "com.example.vehicleinsurance");
        caps.setCapability("appActivity", "com.example.vehicleinsurance.LoginActivity");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        try {
            // Initialize the Appium driver
        	 AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);

            // Perform addition operation
        	 WebElement num1Field = driver.findElement(By.id("com.example.vehicleinsurance:id/editTextTextusername"));
        	 System.out.println("NumField 1 : "+num1Field);
              num1Field.sendKeys("Usernameuser@.com");

              WebElement num2Field = driver.findElement(By.id("com.example.vehicleinsurance:id/editTextTextpassword"));
              num2Field.sendKeys("Password123");

              //WebElement addButton = driver.findElement(By.id("com.example.calculatorapp:id/login_button"));
            //addButton.click();

            // Navigate to the second screen
            WebElement navigateButton = driver.findElement(By.id("com.example.vehicleinsurance:id/login"));
            navigateButton.click();
            
          
            
            WebElement taskText = driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Welcome to log in activity')]"));
            
            if (taskText.isDisplayed()) {
            	System.out.println("Successfully navigated to Dashboard Activity");
                System.out.println("Successfully logined into the app");
            } else {
                System.out.println("Not able to navigate!!!.");
            }

            driver.quit();

        } catch (MalformedURLException e) {
            e.printStackTrace();}}

    
}