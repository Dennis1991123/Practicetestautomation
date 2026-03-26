package com.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;
import com.pages.Home;
import com.pages.Login;
import com.utils.CommonUtils;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class LoginPage {
	
	WebDriver driver;
	
	private Login loginpage;
	
	
	@Given("User enter username as {string}")
	public void user_enter_username_as(String username) {
		driver = DriverFactory.getDriver();
		Login  login  = new Login(driver);
		loginpage =login.enterUsername(username);
	}

	@Given("User eneter password as {string}")
	public void user_eneter_password_as(String password) {
		
		loginpage.enterPassword(password);
	}

	@When("User click on login button")
	public void user_click_on_login_button() {
		
		loginpage.clickLoginbutton();
	}

	
	

}
