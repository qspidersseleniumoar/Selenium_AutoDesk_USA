package com.crm.potest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.crm.commonLib.BaseClass;
import com.crm.objectRepository.Home;
import com.crm.objectRepository.PurchaseOrderPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

/**
 * 
 * @author AMRUTHA
 *
 */
public class DeletePoTest extends BaseClass {
	/**
	 * @throws Throwable
	 * 1.Navigate to PurchaseOrder
	 * 2.Search the PO with PurchaseNo.
	 * 3.Delete the SearchedPo
	 * 4.Verification for Deleted PO
	 */
@Test
public void deletePurchaseOrderTest() throws Throwable{
	ExtentTest testStart=extent.startTest("Delete Po");
	testStart.log(LogStatus.INFO, "Getting objects from Home");
	Home home=PageFactory.initElements(driver, Home.class);
	testStart.log(LogStatus.INFO, "Navigating to PurchaseOrder");
	home.navigateToMore();
	home.navigateToPurchaseOrder();
	testStart.log(LogStatus.INFO, "Searching and Deleting");
	PurchaseOrderPage poPage=PageFactory.initElements(driver, PurchaseOrderPage.class);
	poPage.search_purchase_Order();
	poPage.searchBtnClick();
	testStart.log(LogStatus.INFO,"Verification for DeletePO");
	poPage.deletebtnInSearchedPo();
	extent.endTest(testStart);
}
}