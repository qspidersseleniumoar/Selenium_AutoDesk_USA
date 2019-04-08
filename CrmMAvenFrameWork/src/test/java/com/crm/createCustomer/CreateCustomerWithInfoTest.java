package com.crm.createCustomer;

import java.util.Random;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.commonLib.BaseClass;
import com.crm.objectRepository.CreateCustomerWithInfo;
import com.crm.objectRepository.Home;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
/**
 * @author Anuj
 * 
 */
public class CreateCustomerWithInfoTest extends BaseClass {
	/**
	 * 
	 * @throws CreateCustomerTest
	 * 1. navigate to Setting Icon
	 * 2. click on Crm Settings
	 * 3. Click on USER module
	 * 4. Click on NewUser
	 * 5. Create New User with Mandatory credentials
	 * 6. Click on Save
	 */
	@Test
	public void createCustomerWithMoreInfoTest() throws Throwable  {
		ExtentTest testlog = extent.startTest("createNewUserTest");
		testlog.log(LogStatus.INFO, "Login to app");
		testlog.log(LogStatus.PASS, "Create Customer");
		//testlog.log(LogStatus.FAIL, "Create Customer");
		//testlog.log(LogStatus.WARNING, "Create Customer");
		testlog.log(LogStatus.INFO, "Logout");
		extent.endTest(testlog);
		Random r = new Random();
		int ranonNum = r.nextInt(10000);

		  String  customername ="garima2";//fLib.getExcelData("Sheet1",16,1); 
		  String  password ="qwerty2";//fLib.getExcelData("Sheet1",17,1); 
		  String  confpassword ="qwerty2";//fLib.getExcelData("Sheet1",18,1); 
		  String email="abcd@gmail.com";//eLib.getExcelData("Sheet2", 3, 1);
		  String lastName="bhardwaj2";//eLib.getExcelData("Sheet2", 4, 1);
		  String expMsg = "Showing Recor";// fLib.getExcelData("Sheet1",5,1);
		  String titleEdt ="user";//fLib.getExcelData("Sheet1",21,1);
		  String departmentEdt ="hr";//fLib.getExcelData("Sheet1",22,1);
		  String officephoneEdt ="78129748";//fLib.getExcelData("Sheet1",23,1);
		  String mobilephoneEdt ="930220345";//fLib.getExcelData("Sheet1",24,1);
		  String otheremailEdt ="avfsd@gmail.com";// fLib.getExcelData("Sheet1",25,1);
		  String secondaryemailEdt ="acfqe@gmail.com";//fLib.getExcelData("Sheet1",26,1);
		  Home hp = PageFactory.initElements(driver, Home.class);
		               hp.CRM_Settings();
		  testlog.log(LogStatus.INFO,"========navigate to CRM Setting==========");
		  CreateCustomerWithInfo cc = PageFactory.initElements(driver, CreateCustomerWithInfo.class);
		             cc.navigateToUser();
		  testlog.log(LogStatus.INFO,"========navigate to User==========");
			              cc.navigateToNewUser();
			   testlog.log(LogStatus.INFO,"========navigate to New User==========");
				cc.editCustomerName(customername);
				cc.editPassword(password);
		        cc.editConfPassword(confpassword);
		        cc.editEmail(email);
		        cc.lastName(lastName);
		        cc.lookup();
		        cc.titleEdt(titleEdt);
		        cc.departmentEdt(departmentEdt);
		        cc.officephoneEdt(officephoneEdt);
		        cc.mobilephoneEdt(mobilephoneEdt);
		        cc.otheremailEdt(otheremailEdt);
		        cc.secondaryemailEdt(secondaryemailEdt);
		        cc.changeBtn();
		        cc.getSaveBtn().click();
		  String actMsg = cc.getCptrmsg().getText();
		  boolean status = actMsg.contains(expMsg);
		  Assert.assertTrue(status);
		  testlog.log(LogStatus.PASS,"===========Msg Verified=============");
		 
		}

	}


