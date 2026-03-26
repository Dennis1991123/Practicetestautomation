package com.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;
import com.pages.Home;

import io.cucumber.java.en.When;

public class BlogPage {
	WebDriver driver;
	
	
	
	@When("User click Blog hyperlink")
	public void user_click_blog_hyperlink() {
		 driver = DriverFactory.getDriver();
		   Home home = new Home(driver);
		   home.clickBlog();
	}


}
