package com.stepdefinitions;

import java.security.PrivateKey;

import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;
import com.pages.Home;
import com.pages.Login;
import com.pages.Practice;

import io.cucumber.java.en.When;

public class PracticePage {

	WebDriver driver;
	
	private  Home homepage ;
	
	private Practice practice ; 
	
	@When("User click Practice hyperlink")
	public void user_click_practice_hyperlink() {
		
		driver = DriverFactory.getDriver();
		Home home = new Home(driver);
		practice= home.clickPractice();
		
	   
	}

	
}
