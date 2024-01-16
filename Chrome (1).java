package FirstAppium.Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Chrome {
WebDriver wdriver;
	
	static AppiumDriver driver;
	AndroidDriver aDriver;
	
	public static void main(String[] args) throws InterruptedException{
		try {
			  openCalc();
		} catch (MalformedURLException e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();	
		}
	}
	
	public static void openCalc() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		
		//for real device
		dc.setCapability("deviceName", "Redmi 9A");
		dc.setCapability("udid", "ZP49JVBIJVGEHYT8");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "10 QP1A.190711.020");
//		dc.setCapability("platformVersion", "10");
		dc.setCapability("appPackage", "com.android.chrome");
		dc.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		dc.setCapability("app1", "org.chromium.chromium.chrome.browser.sync.ui.PasssphraseActivity");
		dc.setCapability("app2", "org.chromium.chrome.browser.firstrun.LightweightFirstRunActivity");
		
		
		//for emulator
//		dc.setCapability("automationName": "UIAutomator2"); 
//		dc.setCapability("app", "C:\\Users\\jay-pc\\Desktop\\Appium\\myfirstapp.apk");
	
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
//		URL url = new URL("http://127.0.0.1.4723/wd/hub");
		driver = new AppiumDriver(url, dc);
				
		System.out.println("app started ");
		Thread.sleep(2000);	
		
	}
}
