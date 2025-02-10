package testing;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class vehicleClaimTesting2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "realme RMX2161"); 
        caps.setCapability("appPackage", "com.example.vehicleinsuranceclaim"); 
        caps.setCapability("appActivity", "com.example.vehicleinsuranceclaim.LoginActivity"); 

        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2"); 

        try {
            // Initialize the Appium driver
            AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);
            driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);

            // Register process
            WebElement RegisterButton1 = driver.findElement(By.id("com.example.vehicleinsuranceclaim:id/register1_button"));
            RegisterButton1.click();

            WebElement name1 = driver.findElement(By.id("com.example.vehicleinsuranceclaim:id/name_edit_text"));
            name1.sendKeys("subbu");

            WebElement email = driver.findElement(By.id("com.example.vehicleinsuranceclaim:id/email_edit_text"));
            email.sendKeys("subbu@gmail.com");

            WebElement password = driver.findElement(By.id("com.example.vehicleinsuranceclaim:id/password_edit_text"));
            password.sendKeys("123");

            WebElement phone = driver.findElement(By.id("com.example.vehicleinsuranceclaim:id/phone_edit_text"));
            phone.sendKeys("987");

            WebElement policy = driver.findElement(By.id("com.example.vehicleinsuranceclaim:id/policy_number_edit_text"));
            policy.sendKeys("123");

            WebElement vehicle = driver.findElement(By.id("com.example.vehicleinsuranceclaim:id/vehicle_number_edit_text"));
            vehicle.sendKeys("123");

            WebElement RegisterButton = driver.findElement(By.id("com.example.vehicleinsuranceclaim:id/register_button"));
            RegisterButton.click();

            WebElement num1Field = driver.findElement(By.id("com.example.vehicleinsuranceclaim:id/email_edit_text"));
            num1Field.sendKeys("subbu@gmail.com");

            WebElement num2Field = driver.findElement(By.id("com.example.vehicleinsuranceclaim:id/password_edit_text"));
            num2Field.sendKeys("123");

            WebElement loginButton = driver.findElement(By.id("com.example.vehicleinsuranceclaim:id/login_button"));
            loginButton.click();
            WebElement fileClaimButton = driver.findElement(By.id("com.example.vehicleinsuranceclaim:id/claims_button"));
            fileClaimButton.click();

            WebElement claimDescription = driver.findElement(By.id("com.example.vehicleinsuranceclaim:id/etClaimDescription"));
            claimDescription.sendKeys("vehicle");

            WebElement submitClaimButton = driver.findElement(By.id("com.example.vehicleinsuranceclaim:id/btnSubmitClaim"));
            submitClaimButton.click();

            // Update claim process
            WebElement updateClaimButton = driver.findElement(By.id("com.example.vehicleinsuranceclaim:id/btnUpdateClaim"));
            updateClaimButton.click();

            WebElement claimId = driver.findElement(By.id("com.example.vehicleinsuranceclaim:id/etClaimId"));
            claimId.sendKeys("1");

            WebElement status = driver.findElement(By.id("com.example.vehicleinsuranceclaim:id/etNewStatus"));
            status.sendKeys("approved");

            WebElement updateStatusButton = driver.findElement(By.id("com.example.vehicleinsuranceclaim:id/btnUpdateStatus"));
            updateStatusButton.click();
            WebElement deleteButton = driver.findElement(By.id("com.example.vehicleinsuranceclaim:id/btnDeleteClaim"));
            deleteButton.click();
            WebElement deleteclaimId = driver.findElement(By.id("com.example.vehicleinsuranceclaim:id/etClaimId_Del"));
            deleteclaimId.sendKeys("2");
            WebElement delete = driver.findElement(By.id("com.example.vehicleinsuranceclaim:id/btnDelete"));
            delete.click();
            WebElement LogoutDashBoard = driver.findElement(By.id("com.example.vehicleinsuranceclaim:id/btndashboard"));
            LogoutDashBoard.click();
            
            WebElement logoutButton = driver.findElement(By.id("com.example.vehicleinsuranceclaim:id/logout_button"));
            logoutButton.click();
            System.out.println("Successfully Registered");
            System.out.println("Successfully loggedin");
            System.out.println("Navigated to dashBoardActivity");
            System.out.println("Successfully submitted the claim");
            System.out.println("Successfully updated the claim");
            System.out.println("Successfully deleted the claim");
            System.out.println("back to Navigated to dashBoardActivity");
            System.out.println("Successfully logged out the screen");
            System.out.println("Successfully completed vehicle claim test");
            // Quit the driver
            driver.quit();

        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
