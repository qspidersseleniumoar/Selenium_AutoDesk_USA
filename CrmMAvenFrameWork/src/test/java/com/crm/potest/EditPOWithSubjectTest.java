package com.crm.potest;

import java.util.Random;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.commonLib.BaseClass;
import com.crm.commonLib.FileLib;
import com.crm.objectRepository.CreatePurchaseOrderPage;
import com.crm.objectRepository.EditPurchaseOrder;
import com.crm.objectRepository.Home;
import com.crm.objectRepository.ProductCreateNew;
import com.crm.objectRepository.PurchaseOrderPage;
import com.crm.objectRepository.Vendor;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

/**
 * 
 * @author Risha
 *
 */

public class EditPOWithSubjectTest extends BaseClass{
	
	/**
	 * 
	 * @throws editPurchaseOrderSubjectTest
	 * 1. Navigate to Purchase Order module
	 * 2. Click on create Purchase Order button
	 * 3. Create Purchase Order
	 * 4. Edit subject of Purchase Order
	 * 5. Verify
	 */
	
	@Test
	public void editPurchaseOrderSubjectTest() throws Throwable
	{
		ExtentTest testLog = extent.startTest("editPurchaseOrderSubjectTest");	
		Random r = new Random();
		int randNum = r.nextInt(10000);
		FileLib elib  = new FileLib();
		
		String sub=elib.getExcelData("EditPO",0,2);
		String vendor=elib.getExcelData("EditPO",2,2);
		String billingAddress=elib.getExcelData("EditPO",3,2);
		String qty=elib.getExcelData("EditPO",5,2);
		String price=elib.getExcelData("EditPO",6,2);
		String productName=elib.getExcelData("EditPO",8,2);
		String editSubjectName = elib.getExcelData("EditPO", 1, 2);
		
		testLog.log(LogStatus.INFO, "Navigate to Create Vendor and Product");
		Home hp = PageFactory.initElements(driver, Home.class);
		hp.navigateToVender();
		Vendor v = PageFactory.initElements(driver, Vendor.class);
		v.createVendor(vendor);
		hp.navigateToProducts();
		ProductCreateNew pdt = PageFactory.initElements(driver, ProductCreateNew.class);
		pdt.navigatetocreateprdtname();
		pdt.enterprdtname(productName);
		pdt.savebtn();
		
		testLog.log(LogStatus.INFO, "Navigate to Purchase Order");
		hp.navigateToPurchaseOrder();
		
		testLog.log(LogStatus.INFO, "Navigate to Purchase Order Page");
		PurchaseOrderPage po = PageFactory.initElements(driver, PurchaseOrderPage.class);
		po.navigateToCreatePo();
		
		testLog.log(LogStatus.INFO, "Navigate to Create Purchase Order");
		CreatePurchaseOrderPage cpo = PageFactory.initElements(driver, CreatePurchaseOrderPage.class);
		cpo.createPo(sub+"_"+randNum, billingAddress, qty, price);
		hp.navigateToPurchaseOrder();
		
		testLog.log(LogStatus.PASS, "Edit subject of Purchase Order");	
		EditPurchaseOrder epo = PageFactory.initElements(BaseClass.driver, EditPurchaseOrder.class);
		epo.editSubject();
		epo.clearSubject();
		epo.editNewSubject(editSubjectName);	
		
		testLog.log(LogStatus.PASS, " Verification of Subject edited in Purchase Order");
		String actSubjName = cpo.getEnterSubject().getAttribute("value");
		boolean status = actSubjName.contains(editSubjectName);
		Assert.assertEquals(status, true);
		epo.savePurchaseOrderWithNewSubject();
		extent.endTest(testLog);
	}

}
