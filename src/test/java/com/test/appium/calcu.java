package com.test.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class calcu {
	
	@Test
	public void testcal() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		DevicesSetup setup = new DevicesSetup();
		
		setup.DeviceSetup();
		dc.setCapability("appPackage","com.vivo.calculator");
		dc.setCapability("appActivity", ".Calculator");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url,dc);
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("com.vivo.calculator:id/digit9")).click();
		driver.findElement(By.id("com.vivo.calculator:id/plus")).click();
		driver.findElement(By.id("com.vivo.calculator:id/digit6")).click();
		driver.findElement(By.id("com.vivo.calculator:id/equal")).click();
//		driver.executeScript(null, null)
		
		driver.quit();
	}

}
