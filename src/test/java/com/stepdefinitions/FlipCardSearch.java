package com.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;
import com.pages.FlipCardPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipCardSearch {
	
	WebDriver driver;
	
	private FlipCardPage flipCardPage;


	@When("user click on search page and search {string}")
	public void user_click_on_search_page_and_search(String string) {
		driver = DriverFactory.getDriver();
		FlipCardPage flipcard = new FlipCardPage(driver);
		flipCardPage =  flipcard.searchBymac("mac");
	}

	@When("user select mac bookpro")
	public void user_select_mac_bookpro() {
		flipCardPage.selectmacbook();
		
	}

	@Then("user is able to confirm Macbook pro")
	public void user_is_able_to_confirm_macbook_pro() {
	   String serachitem = "Apple MacBook Air M4 - (16 GB/256 GB SSD/macOS Sequoia) MW0Y3HN/A";
	   
	   String value = flipCardPage.getvalueofSearchItem();
	   System.out.println("Value is --"+value);
	   
	     
	   
	}


}
