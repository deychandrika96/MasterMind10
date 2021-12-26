package com.stepdefinition;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.common.BaseClass;
import com.pageobjectmodel.SearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps extends BaseClass {
	SearchPage sp;
	

@Given("User is am on Amazon home page")
public void user_is_am_on_amazon_home_page() throws Throwable {
     getDriver();
     sp=PageFactory.initElements(driver, SearchPage.class);
   }

@When("User entered the item name on search field {string}")
public void user_entered_the_item_name_on_search_field(String string) throws Throwable {
	sp.getSearchField(string);
   
   }

@When("User clicked on search icon button")
public void user_clicked_on_search_icon_button() throws Throwable {
	 sp.clickSearchIcon();
   }

@Then("User is on searched item page")
public void user_is_on_searched_item_page()throws Throwable {
	//sp.getSearchedItemPage();
	
	Assert.assertEquals(sp.searchedItemPage.getText(), "\"iPhone 12\"");
  }

}


