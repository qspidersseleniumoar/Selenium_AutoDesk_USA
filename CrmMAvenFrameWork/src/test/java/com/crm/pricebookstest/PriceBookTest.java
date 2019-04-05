package com.crm.pricebookstest;

import java.util.Random;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.commonLib.BaseClass;
import com.crm.commonLib.FileLib;
import com.crm.objectRepository.CreatePriceBookPage;
import com.crm.objectRepository.Home;
import com.crm.objectRepository.PriceBookInfo;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

/**
 * 
 * @author moshin
 *
 */
public class PriceBookTest extends BaseClass{
	/**
	 * @throws Create price book test
	 * 1.navigate to price book form more drop down
	 * 2.click on create on create price book 
	 * 3.fill the mandatory details 
	 * 4. save the price book 
	 * 5.verify the message
	 */
	@Test
	public void createPriceBookWithDescription() throws Throwable{
		
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
		String PbookName="mi phones2";//excel.getExcelData("Sheet1", 1, 2);
		String dese="5.5 inch touch screen with 1080*1920 resulution"; //excel.getExcelData("Sheet1", 1, 3);
		
		 /* navigate to price book via more drop down */
		Home home = PageFactory.initElements(driver, Home.class);
		home.navigateToMore();
		testlog.log(LogStatus.INFO,"=======navigate to more=========");
		/*navigate to price book and create price book*/
		CreatePriceBookPage cpb=PageFactory.initElements(driver, CreatePriceBookPage.class);
		cpb.navigateToPriceBook();
		Reporter.log("=======click on Price book=========");
		cpb.navigateToCreatePriceBook();
		testlog.log(LogStatus.INFO,"=======click on  create Price book=========");

		cpb.navigateToPriceNameEdtBox(PbookName);
		cpb.navigateToDescription(dese);
		cpb.clickOnSaveButton();
		testlog.log(LogStatus.INFO,"=======click on save button=========");
		/* verify message*/
		PriceBookInfo pbi=PageFactory.initElements(driver, PriceBookInfo.class);
		String expmsg=" - Price Book Information";
		String successmsg=pbi.getVerifiedText().getText();
		boolean succes=successmsg.contains(expmsg);
		//String successmsg=pbi.getVerifiedText().getText();
		 Assert.assertTrue(succes);
		 testlog.log(LogStatus.PASS,"========msg is verified=======");
	}

}
