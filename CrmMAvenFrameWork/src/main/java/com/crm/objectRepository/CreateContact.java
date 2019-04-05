package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
	@FindBy(name="firstname")
	WebElement fnameEdt;
	@FindBy(name="lastname")
	WebElement lnameEdt;
	@FindBy(name="title")
	WebElement titleEdt;
	
	
	
	@FindBy(xpath="//input[@value='  Save  ']")
	WebElement saveContactBtn;
	
	@FindBy(xpath="//span[contains(text(),'Information')]")
	WebElement expRes;
	
	
	public WebElement getExpRes() {
		return expRes; 
	}

	public void lastnameeditbox(String lName)
	{
		lnameEdt.sendKeys(lName);
		
	}
	
	public void firstnameeditbox(String fName)
	{
		fnameEdt.sendKeys(fName);
	   
	}
	
	public void titleeditbox(String title)
	{
		titleEdt.sendKeys(title);
	   
	}
	
	
	public void contSave()
	{
		saveContactBtn.click();
	}

	
}
