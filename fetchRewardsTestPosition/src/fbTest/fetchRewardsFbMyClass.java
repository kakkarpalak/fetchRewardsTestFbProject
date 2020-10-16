package fbTest;
 
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.remote.MobileCapabilityType;
 
public class fetchRewardsFbMyClass {
	
	public AppiumDriver<MobileElement> driver;
	
	@BeforeMethod
	public void setUp() throws MalformedURLException{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "My Phone");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "#####"); //pass android version eg. 8.0.0
		caps.setCapability("appPackage", "com.facebook.katana");
		caps.setCapability("appActivity", "com.facebook.katana.LoginActivity");
		caps.setCapability("noReset", "false");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps); 
	}
	
	@Test
	public void MainFunctionality() throws MalformedURLException, InterruptedException{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
		
		MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Username");
		el1.sendKeys("######");//pass username eg. email id or phone number
		
		MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Password");
		el2.sendKeys("######"); //pass password eg. Test@123
		
		MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Log In");
		el3.click();
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS); 
		
		MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Search Facebook");
		el4.click();
		
		MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.EditText");
		el5.sendKeys("fetch rewards");
		
	    ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.SEARCH));
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		
		MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]");
		el6.click();
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		MobileElement el7 = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"like button\"]/android.view.ViewGroup/android.view.ViewGroup");
		el7.click();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
 
}