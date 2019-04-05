package com.crm.objectRepository;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.commonLib.BaseClass;
import com.crm.commonLib.WebDriverCoominLib;
/**
 * 
 * @author PrathijnaRaoK
 *
 */
public class CreatePurchaseOrderPage{
	
	WebDriverCoominLib lib= new WebDriverCoominLib();
	VendorLookUpPage vlp=PageFactory.initElements(BaseClass.driver, VendorLookUpPage.class);
	ProductLookUpPage plp=PageFactory.initElements(BaseClass.driver, ProductLookUpPage.class);
	
	@FindBy(name="subject")
	private WebElement enterSubject;
	
	@FindBy(xpath="//input[@name='vendor_name']/following-sibling::img")
	private WebElement selectVendor;
	
	@FindBy(name="bill_street")
	private WebElement billingAddress;
	
	@FindBy(xpath="//b[text()='Copy Billing address']/preceding-sibling::input[@name='cpy']")
	private WebElement copyBillingAddress;
	
	@FindBy(id="searchIcon1")
	private WebElement selectProduct1;
	
	@FindBy(id="searchIcon2")
	private WebElement selectProduct2;
	
	@FindBy(id="qty1")
	private WebElement quantity1;
	
	@FindBy(id="listPrice1")
	private WebElement listPrice1;
	
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement savePurchaseOrder;
	
	
	public WebDriverCoominLib getLib() {
		return lib;
	}


	public VendorLookUpPage getVlp() {
		return vlp;
	}


	public ProductLookUpPage getPlp() {
		return plp;
	}


	public WebElement getEnterSubject() {
		return enterSubject;
	}


	public WebElement getSelectVendor() {
		return selectVendor;
	}


	public WebElement getBillingAddress() {
		return billingAddress;
	}


	public WebElement getCopyBillingAddress() {
		return copyBillingAddress;
	}


	public WebElement getSelectProduct1() {
		return selectProduct1;
	}


	public WebElement getSelectProduct2() {
		return selectProduct2;
	}


	public WebElement getQuantity1() {
		return quantity1;
	}


	public WebElement getListPrice1() {
		return listPrice1;
	}


	public WebElement getSavePurchaseOrder() {
		return savePurchaseOrder;
	}

	
/**
 * Create the purchase order with mandatory fields
 * @param sub
 * @param billingadr
 * @param qty
 * @param price
 */
	public void createPo(String sub,String billingadr,String qty,String price)
	{
		enterSubject.sendKeys(sub);
		selectVendor.click();
		lib.getAllWindowIds();
		lib.switchToChild();
		vlp.getVendorABB().click();
		lib.switchToParent();
		billingAddress.sendKeys(billingadr);
		copyBillingAddress.click();
		selectProduct1.click();
		lib.getAllWindowIds();
		lib.switchToChild();
		plp.getProductmicrophone().click();
		lib.switchToParent();
		quantity1.sendKeys(qty);
		listPrice1.sendKeys(price);
		savePurchaseOrder.click();
	}
}
