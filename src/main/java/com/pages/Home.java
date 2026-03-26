package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.CommonUtils;
import com.utils.ElementUtils;

public class Home {
	
	WebDriver driver;
	private ElementUtils elementutils;
	
	public Home(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		elementutils = new ElementUtils(driver);
	}
	
	
	
	
	@FindBy(xpath ="//a[text()='Courses']" )
	private WebElement courseshyperlink ;
	
	@FindBy(xpath ="//a[text()='Blog']" )
	private WebElement bloghyperlink ;
	
	@FindBy(xpath ="//a[text()='Contact']" )
	private WebElement Contacthyperlink ;
	
	@FindBy(xpath ="//a[text()='Practice']" )
	private WebElement practicehyperlink ;
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="submit")
	private WebElement loginbutton;
	
	
	
	
	public Courses clickCourses()
	{
		elementutils.clickOnElement(courseshyperlink, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		return new Courses(driver);
		
	}
	
	public Blog clickBlog()
	{
		elementutils.clickOnElement(bloghyperlink, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		return new Blog(driver);
		
	}
	
	
	public Contact clickContact()
	{
		elementutils.clickOnElement(Contacthyperlink, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		return new Contact(driver);
		
	}
	
	public Practice clickPractice()
	{
		elementutils.clickOnElement(practicehyperlink, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		return new Practice(driver);
		
	}
	
	
	
	
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
