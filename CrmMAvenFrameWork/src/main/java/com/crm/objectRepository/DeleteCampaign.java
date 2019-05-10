package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.commonLib.WebDriverCoominLib;

public class DeleteCampaign {
	WebDriverCoominLib wlib = new WebDriverCoominLib();
	
		
	@FindBy(xpath = "//a[@class='hdrLink']")
	private WebElement camplink;

	
	@FindBy(xpath = "//a[text()='del']")
	   private WebElement delCamp;
	
	public void CampaignsLink() throws Throwable {
		Thread.sleep(1000);
		camplink.click();
	}
	    
	    public void delCamp() throws Throwable {
	    	
	    	delCamp.click();
	    	
	    }
	   
	

}
