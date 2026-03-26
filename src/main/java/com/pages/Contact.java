package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.utils.ElementUtils;

public class Contact {
	
	WebDriver driver;
	private ElementUtils elementutils;
	
	public Contact(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		elementutils = new ElementUtils(driver);
	}
	

}
