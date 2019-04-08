package com.crm.potest;

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
public class EditPOWithStatusTest extends BaseClass{
		/**
		 * @throws editPurchaseOrderStatusTest
		 * 1. Navigate to Purchase Order module
		 * 2. Click on create Purchase Order button
		 * 3. Create Purchase Order
		 * 4. Change status of Purchase Order
		 * 5. Verify
		 */

		@Test
		public void editPurchaseOrderStatusTest() throws Throwable
		{
			ExtentTest testLog = extent.startTest("editPurchaseOrderStatusTest");	
			
			testLog.log(LogStatus.INFO, "Navigate to Purchase Order");
			Home hp=PageFactory.initElements(driver, Home.class);
			hp.navigateToMore();
			hp.navigateToPurchaseOrder();
			
			testLog.log(LogStatus.PASS, "Change Status of Purchase Order");
			EditPurchaseOrder epo = PageFactory.initElements(BaseClass.driver, EditPurchaseOrder.class);
			epo.editSubject();
			epo.editStatusName();
			
			testLog.log(LogStatus.PASS, " Verification of Status in Purchase Order");
			String actSubjName = epo.getEditStatus().getAttribute("value");
			boolean status = actSubjName.contains("Approved");
			Assert.assertEquals(status, true);		
			epo.savePurchaseOrderWithNewSubject();
			
			extent.endTest(testLog);
		}
	}

