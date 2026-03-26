package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.CommonUtils;
import com.utils.ElementUtils;

public class FlipCardPage {
	
	WebDriver driver;
	private ElementUtils elementutils;
	
	public FlipCardPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		elementutils = new ElementUtils(driver);
	}
	
	@FindBy(xpath ="(//ul[contains(@class,'3ofZy')]/child::li)[8]/descendant::a/child::div[2]/child::span")
	private WebElement macBook;
	
	@FindBy(xpath ="//input[@class='Pke_EE']")
	private WebElement clickonSearch;
	
	@FindBy(xpath ="//div[text()='Processor']")
	private WebElement searchItem;
	
	
	
	public FlipCardPage searchBymac(String SearchText)
	{
		elementutils.typeTextIntoElement(clickonSearch, SearchText,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		return new FlipCardPage(driver);
	}
	
	
	public FlipCardPage selectmacbook()
	{
		elementutils.clickOnElement(macBook,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
		return new FlipCardPage(driver);
	}
	
	public String getvalueofSearchItem()
	{
		elementutils.getTextFromElement(searchItem, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
		return getvalueofSearchItem();
	}

}
