package FirstAppium.Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class APK {
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
		dc.setCapability("appium:app", "D:\\APK\\app-debug.apk");
		
		//for emulator
//		dc.setCapability("automationName": "UIAutomator2"); 
//		dc.setCapability("app", "C:\\Users\\jay-pc\\Desktop\\Appium\\myfirstapp.apk");
	
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
	//	URL url = new URL("http://127.0.0.1.4723/wd/hub");
		driver = new AppiumDriver(url, dc);
		
		driver.findElement(By.id("com.example.firebaseproject:id/add_user_BTN")).click();
		Thread.sleep(2000);	
		
		WebElement entername = driver.findElement(By.id("com.example.firebaseproject:id/name_id"));
		entername.sendKeys("ved");
		WebElement con = driver.findElement(By.id("com.example.firebaseproject:id/contact_id"));
		con.sendKeys("987654321");
		WebElement address = driver.findElement(By.id("com.example.firebaseproject:id/address_id"));
		address.sendKeys("vastral");
		WebElement email = driver.findElement(By.id("com.example.firebaseproject:id/email_id"));
		email.sendKeys("ved@gmail.com");
		WebElement pass = driver.findElement(By.id("com.example.firebaseproject:id/password_id"));
		pass.sendKeys("12345");
		WebElement btn = driver.findElement(By.id("com.example.firebaseproject:id/addUserBTN_id"));
		btn.click();
		
		System.out.println("app started ");
		Thread.sleep(2000);	
		
	}
}
