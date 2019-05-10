package com.crm.campaignTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.commonLib.BaseClass;
import com.crm.commonLib.FileLib;
import com.crm.objectRepository.Campaigns;
import com.crm.objectRepository.CreateNewCamp;
import com.crm.objectRepository.DeleteCampaign;
import com.crm.objectRepository.DeleteContact;
import com.crm.objectRepository.Home;

public class Delete_CampaignWith_CampaignName extends BaseClass {

	@Test
	public void DeleteCampTest() throws Throwable {

		/* getting data from excel */
		FileLib excel = new FileLib();
		String campName = excel.getExcelData("campaign", 1, 1);

		/* navigate to campaign */
		Home home = PageFactory.initElements(driver, Home.class);
		home.navigateToCampaign();

		/* navigate to create campaign */
		Campaigns camp = PageFactory.initElements(driver, Campaigns.class);
		camp.newCamp();

		/* navigate to create new campaign */
		CreateNewCamp campg = PageFactory.initElements(driver, CreateNewCamp.class);
		campg.createCamp(campName);
		Thread.sleep(5000);
		/* navigate again to campaign */
		//Home hom = PageFactory.initElements(driver, Home.class);
		home.navigateToCampaign();
		Thread.sleep(5000);
		
		/* delete the created element */
		DeleteCampaign del = PageFactory.initElements(driver, DeleteCampaign.class);
		del.delCamp();

		
		Alert at=driver.switchTo().alert();
		String actmsg=at.getText();
	
		System.out.println(actmsg);
		String expmsg="Are You Sure You want to Delete?";
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actmsg, expmsg);
		at.accept();
		sa.assertAll();
		
		

	}

}
