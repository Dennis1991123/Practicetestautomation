package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.ElementUtils;

public class Practice {
	
	WebDriver driver;
	private ElementUtils elementutils;
	
	public Practice(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		elementutils = new ElementUtils(driver);
	}
	
	@FindBy(xpath ="//a[text()='Practice']" )
	private WebElement couserhyperlink ;

}
