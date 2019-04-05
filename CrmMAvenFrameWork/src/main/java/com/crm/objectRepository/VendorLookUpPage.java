package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/**
 * 
 * @author PrathijnaRaoK
 *
 */
public class VendorLookUpPage {
	
	@FindBy(xpath="//a[text()='ABB']")
	private WebElement vendorABB;

	public WebElement getVendorABB() {
		return vendorABB;
	}
	
	

}
