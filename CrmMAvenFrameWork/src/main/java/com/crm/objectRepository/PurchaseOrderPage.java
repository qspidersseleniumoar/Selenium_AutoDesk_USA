package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PurchaseOrderPage {

	@FindBy(xpath="//img[@title='Create Purchase Order...']")
	private WebElement poCreateImg;

	public WebElement getPoCreateImg() {
		return poCreateImg;
	}
	
	public void navigateToCreatePo()
	{
		poCreateImg.click();
	}
	
	
}
