package com.crm.potest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.commonLib.BaseClass;
import com.crm.commonLib.FileLib;
import com.crm.commonLib.WebDriverCoominLib;
import com.crm.objectRepository.CreatePurchaseOrderPage;
import com.crm.objectRepository.Home;
import com.crm.objectRepository.ProductCreateNew;
import com.crm.objectRepository.ProductLookUpPage;
import com.crm.objectRepository.PurchaseOrderInformationPage;
import com.crm.objectRepository.PurchaseOrderPage;
import com.crm.objectRepository.VendorLookUpPage;
import com.sun.accessibility.internal.resources.accessibility;

/**
 * 
 * @author PrathijnaRaoK
 *
 */
public class CreatePOTest extends BaseClass{
	/**
	 *  Testcase to create purchase order with mandatoryfields
	 * @throws Throwable
	 */	
	
	
	@Test
	public void createPurchaseOrdertest() throws Throwable{
		FileLib elib = new FileLib();
		String sub=elib.getExcelData("createPO",1,2);
		String billingAddress=elib.getExcelData("createPO",1,4);
		String qty=elib.getExcelData("createPO",1,7);
		String price=elib.getExcelData("createPO",1,8);
		String produc=elib.getExcelData("createPO",1,10);
		
		
		ProductCreateNew product=PageFactory.initElements(driver, ProductCreateNew.class);
		Home hp=PageFactory.initElements(driver, Home.class);
		
		/*create product*/
		hp.navigateToProducts();
		product.navigatetocreateprdtname();
		product.enterprdtname(produc);
		product.savebtn();
		
		/*create purchase order*/
		hp.navigateToMore();
		hp.navigateToPurchaseOrder();
		PurchaseOrderPage pop=PageFactory.initElements(driver, PurchaseOrderPage.class);
		pop.navigateToCreatePo();
		CreatePurchaseOrderPage cpop=PageFactory.initElements(driver, CreatePurchaseOrderPage.class);
		cpop.createPo(sub, billingAddress, qty, price);
		
		PurchaseOrderInformationPage poip=PageFactory.initElements(driver, PurchaseOrderInformationPage.class);
		String actmsg=poip.getsuccessmsg().getText();
		String expmsg=elib.getExcelData("createPO",1,9);
		/*Verification*/
		boolean status=actmsg.contains(expmsg);
		Assert.assertTrue(status);
		
	}
	
	/**
	 * Test case to create purchase order without selecting the vendor
	 * @throws Throwable
	 */
	@Test 
	public void createPurchaseOrderWithoutVendorTest() throws Throwable
	{
		
		FileLib elib = new FileLib();
		String sub=elib.getExcelData("createPO",2,2);
		String billingAddress=elib.getExcelData("createPO",2,4);
		String qty=elib.getExcelData("createPO",2,7);
		String price=elib.getExcelData("createPO",2,8);
		String produc=elib.getExcelData("createPO",2,10);
		
		
		WebDriverCoominLib lib= new WebDriverCoominLib();
		ProductLookUpPage plp=PageFactory.initElements(driver, ProductLookUpPage.class);
		
		ProductCreateNew product=PageFactory.initElements(driver, ProductCreateNew.class);
		Home hp=PageFactory.initElements(driver, Home.class);
		
		/*create product*/
		hp.navigateToProducts();
		product.navigatetocreateprdtname();
		product.enterprdtname(produc);
		product.savebtn();
		/*navigate to purchase order*/
		hp.navigateToMore();
		hp.navigateToPurchaseOrder();
		PurchaseOrderPage pop=PageFactory.initElements(driver, PurchaseOrderPage.class);
		pop.navigateToCreatePo();
		CreatePurchaseOrderPage cpop=PageFactory.initElements(driver, CreatePurchaseOrderPage.class);
		/*Enter the subject*/
		cpop.getEnterSubject().sendKeys(sub);
		/*Enter billing address*/
		cpop.getBillingAddress().sendKeys(billingAddress);
		/*copy the billing address to shipping address*/
		cpop.getCopyBillingAddress().click();
		/*select product*/
		cpop.getSelectProduct1().click();
		lib.getAllWindowIds();
		lib.switchToChild();
		plp.getProductmicrophone().click();
		lib.switchToParent();
		/*Enter the Quantity*/
		cpop.getQuantity1().sendKeys(qty);
		/*Enter the price*/
		cpop.getListPrice1().sendKeys(price);
		/*click on save*/
		cpop.getSavePurchaseOrder().click();
		/*switch to alert*/
		Alert alt=driver.switchTo().alert();
		String actmsg=alt.getText();
		alt.accept();
		String expmsg=elib.getExcelData("createPO",2,9);
		/*verification*/
		boolean status=actmsg.contains(expmsg);
		Assert.assertTrue(status);
		
		
	}
	
	

}
