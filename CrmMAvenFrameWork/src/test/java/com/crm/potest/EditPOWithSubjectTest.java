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
import com.crm.objectRepository.PurchaseOrderPage;
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
		String shippingAddress=elib.getExcelData("EditPO",4,2);
		String qty=elib.getExcelData("EditPO",5,2);
		String price=elib.getExcelData("EditPO",6,2);
		
		testLog.log(LogStatus.INFO, "Navigate to Purchase Order");
		Home hp=PageFactory.initElements(driver, Home.class);
		hp.navigateToMore();
		hp.navigateToPurchaseOrder();
		
		testLog.log(LogStatus.INFO, "Navigate to Purchase Order Page");
		PurchaseOrderPage pop=PageFactory.initElements(driver, PurchaseOrderPage.class);
		pop.navigateToCreatePo();
		
		testLog.log(LogStatus.INFO, "Navigate to Create Purchase Order");
		CreatePurchaseOrderPage cpop=PageFactory.initElements(driver, CreatePurchaseOrderPage.class);
		cpop.createPo(sub+"_"+randNum, billingAddress, qty, price);
		
		testLog.log(LogStatus.PASS, "Edit subject of Purchase Order");
		String editSubjectName = elib.getExcelData("EditPO", 1, 2);
		EditPurchaseOrder epo = PageFactory.initElements(BaseClass.driver, EditPurchaseOrder.class);
		epo.editSubject();
		epo.clearSubject();
		epo.editNewSubject(editSubjectName);	
		
		testLog.log(LogStatus.PASS, " Verification of Subject edited in Purchase Order");
		String actSubjName = cpop.getEnterSubject().getAttribute("value");
		boolean status = actSubjName.contains(editSubjectName);
		Assert.assertEquals(status, true);
		epo.savePurchaseOrderWithNewSubject();
		extent.endTest(testLog);
	}

}
