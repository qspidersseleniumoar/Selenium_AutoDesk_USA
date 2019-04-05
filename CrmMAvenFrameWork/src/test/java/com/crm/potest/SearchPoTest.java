package com.crm.potest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
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
public class SearchPoTest extends BaseClass {
	/**
	 * @throws Throwable
	 * 1.Navigate to PurchaseOrder
	 * 2.Search PurchaseOrder With PurchaseNo
	 * 3.Click on search 
	 * 4.Verify the Searched PurchaseOrder
	 */
   @Test
    public void searchPoTest() throws Throwable{
	   ExtentTest testStart=extent.startTest("Search Po");
	   testStart.log(LogStatus.INFO, "Getting objects from Home");
	   Home home=PageFactory.initElements(driver, Home.class);
	   home.navigateToMore();
	   testStart.log(LogStatus.INFO, "Naviagting To PurchaseOrder");
	   home.navigateToPurchaseOrder();
	   /*Creating an object for PurchaseOrder for searching*/
	   PurchaseOrderPage po=PageFactory.initElements(driver, PurchaseOrderPage.class);
	   po.search_purchase_Order();
	   po.cilckDD();
	   po.searchBtnClick();
	   WebElement cp=po.getCaptureText();
	   String actual=cp.getText();
	   String expected=eLib.getExcelData("SearchPo", 6, 2);
	   Assert.assertEquals(actual, expected);
	   testStart.log(LogStatus.INFO,"Verification for SearchPo");
	   extent.endTest(testStart);
   }
}
