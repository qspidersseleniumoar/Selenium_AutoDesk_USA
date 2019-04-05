package com.crm.createCustomer;

import java.util.Random;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.commonLib.BaseClass;
import com.crm.commonLib.FileLib;
import com.crm.objectRepository.CreatCustomer;
import com.crm.objectRepository.Home;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

/**
 * @author Anuj
 * 
 */
public class CreatCustomerTest extends BaseClass{
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
public void creatCustomer() throws Throwable{
	
	ExtentTest testlog = extent.startTest("createNewUserTest");
	testlog.log(LogStatus.INFO, "Login to app");
	testlog.log(LogStatus.PASS, "Create Customer");
	//testlog.log(LogStatus.FAIL, "Create Customer");
	//testlog.log(LogStatus.WARNING, "Create Customer");
	testlog.log(LogStatus.INFO, "Logout");
	extent.endTest(testlog);
	Random r = new Random();
	int ranonNum = r.nextInt(10000);

	//FileLib excel = new FileLib();
	

	String username="garima";//eLib.getExcelData("Sheet2", 0, 1);
	String password="qwerty";//eLib.getExcelData("Sheet2", 1, 1);
	String confpassword="qwerty";//eLib.getExcelData("Sheet2", 2, 1);
	String email="abc@gmail.com";//eLib.getExcelData("Sheet2", 3, 1);
	String lastname="bhardwaj";//eLib.getExcelData("Sheet2", 4, 1);
	Home home = PageFactory.initElements(driver, Home.class);
	home.CRM_Settings();
	testlog.log(LogStatus.INFO,"========navigate to CRM Setting==========");
	CreatCustomer cc=PageFactory.initElements(driver, CreatCustomer.class);
	cc.navigateToUser();
	testlog.log(LogStatus.INFO,"========navigate to User==========");
	cc.navigateToNewUser();
	testlog.log(LogStatus.INFO,"========navigate to New User==========");
	cc.editCustomerName(username);
	cc.editPassword(password);
	cc.editConfPassword(confpassword);
	cc.editEmail(email);
	cc.lastName(lastname);
	cc.lookup();
    cc.getSaveBtn();
    testlog.log(LogStatus.INFO,"========New User Created ==========");
	String actMsg= cc.getCptrmsg().getText();
	String expMsg = "Showing Recor";
    boolean status=actMsg.contains(expMsg);
    Assert.assertTrue(status);
    testlog.log(LogStatus.PASS,"=======Verify Msg ============");
}
}