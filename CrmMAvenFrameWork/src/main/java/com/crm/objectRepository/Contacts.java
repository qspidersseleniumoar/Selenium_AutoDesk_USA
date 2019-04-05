package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contacts {
	@FindBy(xpath="//img[@title='Create Contact...']")
	WebElement newContBtn;
	
	@FindBy(xpath="//input[@name='search_text']")
	WebElement search;
	
	@FindBy(xpath="//input[@value=' Search Now ']")
	WebElement searchButton;
	
	public void navigateToCreateContact()
	{
		newContBtn.click();
	}
	
	public void searchCont(String contname){
		search.sendKeys(contname);
		searchButton.click();

		
}
}








