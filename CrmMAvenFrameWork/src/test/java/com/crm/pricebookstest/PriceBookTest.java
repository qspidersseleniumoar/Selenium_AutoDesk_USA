package com.crm.pricebookstest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.commonLib.BaseClass;
import com.crm.commonLib.FileLib;
import com.crm.objectRepository.CreatePriceBookPage;
import com.crm.objectRepository.Home;
import com.crm.objectRepository.PriceBookInfo;

public class PriceBookTest extends BaseClass{
	@Test
	public void createPriceBookWithDescription() throws Throwable{
		FileLib excel = new FileLib();
		String PbookName=excel.getExcelData("Sheet1", 1, 2);
		String dese= excel.getExcelData("Sheet1", 1, 3);
		
		 /* navigate to price book via more drop down */
		Home home = PageFactory.initElements(driver, Home.class);
		home.navigateToMore();
		/*navigate to price book and create price book*/
		CreatePriceBookPage cpb=PageFactory.initElements(driver, CreatePriceBookPage.class);
		cpb.navigateToPriceBook();
		cpb.navigateToCreatePriceBook();

		cpb.navigateToPriceNameEdtBox(PbookName);
		cpb.navigateToDescription(dese);
		cpb.clickOnSaveButton();
		/* verify message*/
		PriceBookInfo pbi=PageFactory.initElements(driver, PriceBookInfo.class);
		String expmsg=" - Price Book Information";
		String successmsg=pbi.getVerifiedText().getText();
		boolean succes=successmsg.contains(expmsg);
		//String successmsg=pbi.getVerifiedText().getText();
		 Assert.assertTrue(succes);
		 System.out.println("========msg is verified=======");
	}

}
