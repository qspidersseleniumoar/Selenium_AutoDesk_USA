package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CampaignInfo {
	
	@FindBy(xpath="//span[@class='dvHeaderText']")
	WebElement verifyText;
	
	@FindBy(id="mouseArea_Campaign Name")
	private WebElement campnameedit;
	
	
	public WebElement getVerifyText() {
		return verifyText;
	}
	public WebElement getVerifyCampname() {
		return campnameedit;
	}
	public WebElement getTargAudText() {
		// TODO Auto-generated method stub
		return null;
	}
	public WebElement editBtn() {
		// TODO Auto-generated method stub
		return null;
	}		
	
	 

}
