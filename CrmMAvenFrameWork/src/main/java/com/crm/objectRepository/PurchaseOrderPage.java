package com.crm.objectRepository;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/**
 * 
 * @author PrathijnaRaoK
 *
 */
public class PurchaseOrderPage {

	@FindBy(xpath="//img[@title='Create Purchase Order...']")
	private WebElement poCreateImg;

	public WebElement getPoCreateImg() {
		return poCreateImg;
	}
	/**
	 * navigate to purchase order
	 */
	public void navigateToCreatePo()
	{
		poCreateImg.click();
	}
	
	

}