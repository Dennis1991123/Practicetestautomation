package com.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;
import com.pages.Home;

import io.cucumber.java.en.When;

public class CoursePage {
	
	WebDriver driver;
	
	
	
	@When("User click Course hyperlink")
	public void user_click_course_hyperlink() {
	   driver = DriverFactory.getDriver();
	   Home home = new Home(driver);
	   home.clickCourses();
	}

}
