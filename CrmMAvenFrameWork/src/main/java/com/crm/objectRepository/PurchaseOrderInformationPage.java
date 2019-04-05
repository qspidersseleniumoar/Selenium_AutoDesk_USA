package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/**
 * 
 * @author PrathijnaRaoK
 *
 */
public class PurchaseOrderInformationPage {
	
	@FindBy(xpath="//span[@class='lvtHeaderText']")
	private WebElement successmg;

	public WebElement getsuccessmsg() {
		return successmg;
	}
		

}
