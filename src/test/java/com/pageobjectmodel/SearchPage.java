package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {                  //SearcgPage is Class
	public WebDriver driver;                   //driver is Instance variable outside the method and inside class
	
	public SearchPage(WebDriver driver) {                  //SearchPage is Method. driver is local variable is inside method 
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchField;
	public void getSearchField(String itemName) {
		searchField.sendKeys(itemName);
	}
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement searchIcon;
	public void clickSearchIcon() {
	searchIcon.click();
	}
	
	@FindBy(xpath="//span[contains(text(),'\"iPhone 12\"')]")
	public WebElement searchedItemPage;
	//public void getSearchedItemPage() {
	//	searchedItemPage.getText();
	
}
                               


