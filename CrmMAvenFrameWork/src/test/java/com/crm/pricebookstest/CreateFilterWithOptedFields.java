package com.crm.pricebookstest;

import java.util.Random;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.commonLib.BaseClass;
import com.crm.objectRepository.CreateFilterWithOptedFieldsPage;
import com.crm.objectRepository.CreatePriceBookPage;
import com.crm.objectRepository.Home;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import junit.framework.Assert;

/**
 * 
 * @author moshin
 *
 */
public class CreateFilterWithOptedFields extends BaseClass {
	/**
	 * 
	 * @throws create Filter with opted field 
	 * 1.navigate to price book from more drop down 
	 *2.click on "Create filter" 
	 *3.Enter view name
	 *4.Select a field from the third drop down present in choose columns tab
	 *5.Select a field from the fourth drop down present in choose columns tab
	 *6.click on AdvancedFilters tab 
	 *7.Select information from the first drop down provided in Advanced Search window
	 *8.Select a condition in the second drop down
	 *9.Provide a piece /full name of a PriceBook in the edit box provided
	 *10.Save the filter
	 *11.Click on "Filters" drop down
	 *12.Selcect "MI Phones3" filter
	 *13.Click on "Filters" drop down
	 *14.logout
	 */
	@Test
	public void CreateFilterWithOptedFilds() throws Throwable{
		
		ExtentTest testlog = extent.startTest("createNewUserTest");
		testlog.log(LogStatus.INFO, "Login to app");
		testlog.log(LogStatus.PASS, "Create Customer");
		//testlog.log(LogStatus.FAIL, "Create Customer");
		//testlog.log(LogStatus.WARNING, "Create Customer");
		testlog.log(LogStatus.INFO, "Logout");
		extent.endTest(testlog);
		Random r = new Random();
		int ranonNum = r.nextInt(10000);


	String BooKName ="realme"; //flib.getExelData("Sheet1", 2, 2);
	String repBox ="me";// flib.getExelData("Sheet1", 2, 3);
	
			 /* navigate to price book via more drop down */
			Home home = PageFactory.initElements(driver, Home.class);
			home.navigateToMore();
			testlog.log(LogStatus.INFO,"=======navigate to more =========");
			CreatePriceBookPage cpb=PageFactory.initElements(driver, CreatePriceBookPage.class);
			cpb.navigateToPriceBook();
			testlog.log(LogStatus.INFO,"=======click on price book=========");
			CreateFilterWithOptedFieldsPage cfp=PageFactory.initElements(driver,CreateFilterWithOptedFieldsPage.class);
			String expmsg="Showing Records 1";
		
	cfp.CreateFilterWithOpted(BooKName, repBox);
	testlog.log(LogStatus.INFO,"========filter created=========");
	String actmsg =cfp.getActMsgVerify().getText();
	boolean status =actmsg.contains(expmsg);
	Assert.assertTrue(status);
	testlog.log(LogStatus.PASS,"========msg is verified========");
	}
	}



