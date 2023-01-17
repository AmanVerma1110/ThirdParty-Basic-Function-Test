package com.test.appium;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import java.io.IOException;
import io.appium.java_client.android.AndroidDriver;
import com.android.adb.*;
import com.basicfunction.pageobjects.*;
import org.apache.logging.log4j.*;


public class InstaTest {
	
		@SuppressWarnings("static-access")
		@Test
		public void testinsta() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		Adb adb = new Adb();
		Logger log = LogManager.getLogger("YoutubeTest");
		
		
		DevicesSetup setup = new DevicesSetup();
		
		setup.DeviceSetup();
		dc.setCapability("appPackage","com.instagram.android");
		dc.setCapability("appActivity", "com.instagram.mainactivity.MainActivity");
		dc.setCapability("noReset", true);
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url,dc);
		Instagram ig = new Instagram(driver);
		log.info("App Open");
		
		
		
		Thread.sleep(5000);
		
		ig.Reels();
		log.info("Reel Selected");
		for(int i=0;i<15;i++) {
			adb.VolumeDown();
			log.info("Volume Down");
		}
		for(int i=0;i<15;i++) {
			adb.VolumeUP();
			log.info("Volume UP");
		}
		
		
	
//		driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Reels\"]/android.widget.ImageView")).click();
//		Thread.sleep(5000);
//		
//		System.out.println(Adb.command("adb devices"));
//		
//		for(int i=0; i<14; i++) {
//		System.out.println(Adb.command("adb shell input keyevent 25"));
//		}
//		
//		for(int i=0; i<14; i++) {
//		System.out.println(Adb.command("adb shell input keyevent 24"));
	//	}
		
		
//		driver.pressKeyCode(24);
//		Thread.sleep(5000);
//		driver.pressKeyCode(25);
//		Thread.sleep(5000);
		

		driver.quit();

}

}
