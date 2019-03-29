package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Campaigns {
	
	
	@FindBy(xpath="//img[@title='Create Campaign...']")
	WebElement newCamp;
	@FindBy(xpath="//input[@name='search_text']")
	WebElement search;
	@FindBy(xpath="//input[@value=' Search Now ']")
	WebElement searchButton;
	
	public void newCamp()
	{
		newCamp.click();
	}
	public void searchCamp(String campname){
		search.sendKeys(campname);
		searchButton.click();
	}
	

}
