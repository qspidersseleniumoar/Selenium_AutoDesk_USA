package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.commonLib.WebDriverCoominLib;

public class CreatePriceBookPage extends WebDriverCoominLib {
	@FindBy(name="Price Books")
	WebElement PriceBookName;
	@FindBy(xpath="//img[@alt='Create Price Book...']")
	WebElement CreatePriceBook;
	@FindBy(name="bookname")
	WebElement bookName;
	@FindBy(name="description")
	WebElement description;
	@FindBy(name="button")
	WebElement savebutton;
	public void navigateToPriceBook(){
		waitAndClick(PriceBookName);
	}
	public void navigateToCreatePriceBook(){
		waitAndClick(CreatePriceBook);
	}
	public void navigateToPriceNameEdtBox(String PbookName){
		bookName.sendKeys(PbookName);
	}
	public void navigateToDescription( String dese){
		description.sendKeys(dese);
	}
	public void clickOnSaveButton(){
		waitAndClick(savebutton);
	}

}
