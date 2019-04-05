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
import com.crm.objectRepository.Vendor;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.accessibility.internal.resources.accessibility;

/**
 * 
 * @author PrathijnaRaoK
 *
 */
public class CreatePOTest extends BaseClass{
	/**
	 *  Test case to create purchase order with mandatory fields
	 *  1.navigate to purchase order page
	 *  2.navigate to create purchase order page
	 *  3.Enter the Mandatory data and click on save
	 *  4.Verify the creation of purchase order
	 * @throws Throwable
	 */
	@Test
	public void createPurchaseOrderTest() throws Throwable{
		ExtentTest testing=extent.startTest("createPurchaseOrderTest");
		String sub=eLib.getExcelData("createPO",1,2);
		String vendor=eLib.getExcelData("createPO",1,3);
		String billingAddress=eLib.getExcelData("createPO",1,4);
		String qty=eLib.getExcelData("createPO",1,7);
		String price=eLib.getExcelData("createPO",1,8);
		String produc=eLib.getExcelData("createPO",1,10);
		Home hp=PageFactory.initElements(driver, Home.class);
		ProductCreateNew product=PageFactory.initElements(driver, ProductCreateNew.class);
		Vendor vender=PageFactory.initElements(driver, Vendor.class);
		testing.log(LogStatus.INFO,"create product");
		hp.navigateToProducts();
		product.navigatetocreateprdtname();
		product.enterprdtname(produc);
		product.savebtn();
		testing.log(LogStatus.INFO,"create Vendor");
		hp.navigateToVender();
		vender.createVendor(vendor);
		testing.log(LogStatus.INFO,"create purchaseOrder");
		hp.navigateToMore();
		hp.navigateToPurchaseOrder();
		PurchaseOrderPage pop=PageFactory.initElements(driver, PurchaseOrderPage.class);
		pop.navigateToCreatePo();
		CreatePurchaseOrderPage cpop=PageFactory.initElements(driver, CreatePurchaseOrderPage.class);
		cpop.createPo(sub, billingAddress, qty, price);
		PurchaseOrderInformationPage poip=PageFactory.initElements(driver, PurchaseOrderInformationPage.class);
		String actmsg=poip.getsuccessmsg().getText();
		String expmsg=eLib.getExcelData("createPO",1,9);
		/*verify Creation of Purchase order*/
		boolean status= actmsg.contains(expmsg);
		System.out.println(status);
		Assert.assertTrue(status);
		testing.log(LogStatus.PASS,"purchase order is created successfully");
		extent.endTest(testing);
	}
	/**
	 * Test case to create purchase order without selecting the vendor
	 * 1.navigate to purchase order page
	 * 2.navigate to create purchase order page
	 * 3.Enter the Mandatory data,do not select vendor and click on save
	 * 4.Verify that vendor component cannot be empty
	 * @throws Throwable
	 */
	@Test 
	public void createPurchaseOrderWithoutVendorTest() throws Throwable
	{
		ExtentTest testing=extent.startTest("createPurchaseOrderWithoutVendorTest");
		String sub=eLib.getExcelData("createPO",2,2);
		String billingAddress=eLib.getExcelData("createPO",2,4);
		String qty=eLib.getExcelData("createPO",2,7);
		String price=eLib.getExcelData("createPO",2,8);
		String produc=eLib.getExcelData("createPO",2,10);
		WebDriverCoominLib lib= new WebDriverCoominLib();
		ProductLookUpPage plp=PageFactory.initElements(driver, ProductLookUpPage.class);
		ProductCreateNew product=PageFactory.initElements(driver, ProductCreateNew.class);
		Home hp=PageFactory.initElements(driver, Home.class);
		testing.log(LogStatus.INFO,"create product");
		hp.navigateToProducts();
		product.navigatetocreateprdtname();
		product.enterprdtname(produc);
		product.savebtn();
		/*navigate to purchase order*/
		testing.log(LogStatus.INFO,"create purchase order without vendor");
		hp.navigateToMore();
		hp.navigateToPurchaseOrder();
		PurchaseOrderPage pop=PageFactory.initElements(driver, PurchaseOrderPage.class);
		pop.navigateToCreatePo();
		CreatePurchaseOrderPage cpop=PageFactory.initElements(driver, CreatePurchaseOrderPage.class);
		testing.log(LogStatus.INFO,"Enter subject");
		cpop.getEnterSubject().sendKeys(sub);
		testing.log(LogStatus.INFO,"Billing Address");
		cpop.getBillingAddress().sendKeys(billingAddress);
		testing.log(LogStatus.INFO,"copy Billing Address to Shipping Address");
		cpop.getCopyBillingAddress().click();
		testing.log(LogStatus.INFO,"Select product");
		cpop.getSelectProduct1().click();
		lib.getAllWindowIds();
		lib.switchToChild();
		plp.getProductmicrophone().click();
		lib.switchToParent();
		testing.log(LogStatus.INFO,"Enter quantity");
		cpop.getQuantity1().sendKeys(qty);
		testing.log(LogStatus.INFO,"Enter price");
		cpop.getListPrice1().sendKeys(price);
		testing.log(LogStatus.INFO,"Save the purchase order");
		cpop.getSavePurchaseOrder().click();
		/*switch to alert*/
		Alert alt=driver.switchTo().alert();
		String actmsg=alt.getText();
		alt.accept();
		String expmsg=eLib.getExcelData("createPO",2,9);
		/*verification*/
		boolean status=actmsg.contains(expmsg);
		Assert.assertTrue(status);
		testing.log(LogStatus.PASS,"Alert message is displayed");
		extent.endTest(testing);
	}		
}

