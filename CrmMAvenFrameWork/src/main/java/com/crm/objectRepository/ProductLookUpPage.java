package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/**
 * 
 * @author PrathijnaRaoK
 *
 */

public class ProductLookUpPage {
	
	@FindBy(xpath="//a[text()='micro phone']")
	private WebElement productmicrophone;

	public WebElement getProductmicrophone() {
		return productmicrophone;
	}
	

}
