package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.crm.commonLib.FileLib;
import com.crm.commonLib.WebDriverCoominLib;

public class PurchaseOrderPage extends WebDriverCoominLib{
	@FindBy(xpath="//img[@title='Create Purchase Order...']")
	private WebElement poCreateImg;
 
	@FindBy(linkText="More")
	WebElement More;
	
	@FindBy(name="Purchase Order")
	WebElement purchaseOrder;

	@FindBy(xpath="//input[@class='txtBox']")
	WebElement searchPurchaseorder;
	
	@FindBy(id="bas_searchfield")
	WebElement inDropDown;
	
	@FindBy(name="submit")
	WebElement clickSearch;
	
	@FindBy(xpath="//td[text()='PO1 ']")
	WebElement captureText;
	

	public WebElement getPoCreateImg() {
		return poCreateImg;
	}
	
	public void navigateToCreatePo()
	{
		poCreateImg.click();
	}
	public void navigateToMore(){
		mouseMovement(More);
	 }
	public void navigateToPurchaseOrder(){
        mouseMovement(More);
			waitAndClick(purchaseOrder);
	}
	public void search_purchase_Order() throws Throwable{
		searchPurchaseorder.click();
		FileLib flib=new FileLib();
		searchPurchaseorder.sendKeys(flib.getExcelData("SearchPo", 1, 2));
	}
	public void cilckDD(){
		inDropDown.click();
		select(inDropDown, "PurchaseOrder No");
	}
	public void searchBtnClick(){
		clickSearch.click();
	}
	public void verifySearchedPo(){
		String expValue="PO1";
		String actValue=captureText.getText();
		Assert.assertEquals(actValue, expValue);
	}
}

