package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.CommonUtils;
import com.utils.ElementUtils;

public class Login {
	
	WebDriver driver;
	private ElementUtils elementutils;
	
	public Login(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		elementutils = new ElementUtils(driver);
	}
	
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="submit")
	private WebElement loginbutton;
	
	
	
	public Login  enterUsername(String usernameText)
	{
		elementutils.typeTextIntoElement(username, usernameText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		return new Login(driver);
		
		
	}
	
	public Login enterPassword(String passwordtext)
	{
		elementutils.typeTextIntoElement(password, passwordtext, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		return new Login(driver);
	}
	
	public Login clickLoginbutton()
	{
		elementutils.clickOnElement(loginbutton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		return new Login(driver);
	}
	
	

}
