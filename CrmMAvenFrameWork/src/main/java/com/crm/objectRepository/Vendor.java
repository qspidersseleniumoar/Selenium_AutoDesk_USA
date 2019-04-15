package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * 
 * @author PrathijnaRaoK
 *
 */
public class Vendor {

	@FindBy(xpath="//img[@title='Create Vendor...']")
	 private WebElement vendorImg;
	@FindBy(name="vendorname")
	 private WebElement vendorName;
	@FindBy(xpath="//input[@value='  Save  ']")
	 private WebElement saveBtn;
	
	/**
	 * to create vendor
	 */
	public void createVendor(String vendor)
	{
		vendorImg.click();
		vendorName.sendKeys(vendor);
		saveBtn.click();
	}
	public void deletvendor(String vendor)
	{
		
	}
	
}
