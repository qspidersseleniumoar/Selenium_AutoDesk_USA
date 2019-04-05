package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.crm.commonLib.WebDriverCoominLib;

/**
 * 
 * @author smita sahoo
 *
 */
public class DeleteContact {
	WebDriverCoominLib wlib = new WebDriverCoominLib();
	@FindBy(name="search_text")
	WebElement searchText;
	@FindBy(name="submit")
	WebElement searchButton;
	@FindBy(xpath="//a[text()='del']")
	WebElement deleteButton;
	@FindBy(xpath="(//select[@id='bas_searchfield'])[1]")
	WebElement selButton;
	@FindBy(id="selectCurrentPageRec")
	WebElement chkbtn;
	@FindBy(xpath="(//input[@value='Delete'])[1]")
	WebElement delmtpbtn;

	public void deleteContactok()
	{
		deleteButton.click();
		wlib.switchToAlert();
	}
	public void searchContact(String contid)
	{
		searchText.sendKeys(contid);
		searchButton.click();
	}
	public void selBtn(){
		wlib.select(selButton, "firstName ");
		
	}
	public void delmtp(){chkbtn.click();
	delmtpbtn.click();
	wlib.switchToAlert();
}
	public String checkStatus(){
	 return wlib.getAlertTest();}
	
	
}
