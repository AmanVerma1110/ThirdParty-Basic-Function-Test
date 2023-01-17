package com.test.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class DevicesSetup {

	public void DeviceSetup() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "30812690620008I");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
//		dc.setCapability("appPackage","com.vivo.calculator");
//		dc.setCapability("appActivity", ".Calculator");
//		dc.setCapability("noReset", true);
		
//		URL url = new URL("http://127.0.0.1:4723/wd/hub");
//		
//		AndroidDriver driver = new AndroidDriver(url,dc);
		
//		Thread.sleep(5000);
		
//		driver.findElement(By.id("com.vivo.calculator:id/digit9")).click();
//		driver.findElement(By.id("com.vivo.calculator:id/plus")).click();
//		driver.findElement(By.id("com.vivo.calculator:id/digit6")).click();
//		driver.findElement(By.id("com.vivo.calculator:id/equal")).click();
		
//		Thread.sleep(5000);
		
		
//		driver.quit();
		
//		driver.findElement(By.id(""));
		

		
		
		
	}
	

}
