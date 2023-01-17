package com.basicfunction.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Instagram {
	
	WebDriver Idriver;
	
	public Instagram(WebDriver rdriver)
	{
		Idriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="//android.widget.FrameLayout[@content-desc=\"Profile\"]/android.view.ViewGroup")
	WebElement Profile;
	
	@FindBy(id="com.instagram.android:id/row_profile_header_textview_following_title")
	WebElement Following;
	
	@FindBy(id="com.instagram.android:id/row_profile_header_textview_followers_title")
	WebElement followers;
	
	@FindBy(xpath="//android.widget.FrameLayout[@content-desc=\"Reels\"]/android.widget.ImageView")
	WebElement reels;
	
	public void Profile() {
		Profile.click();
	}
	
	public void Following() {
		Following.click();
	}
	
	public void followers() {
		followers.click();
	}
	
	public void Reels() {
		reels.click();
	}
	
}


