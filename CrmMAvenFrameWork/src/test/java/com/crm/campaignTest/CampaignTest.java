package com.crm.campaignTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.commonLib.BaseClass;
import com.crm.commonLib.FileLib;
import com.crm.commonLib.WebDriverCoominLib;
import com.crm.objectRepository.CampaignInfo;
import com.crm.objectRepository.Campaigns;
import com.crm.objectRepository.CreateNewCamp;
import com.crm.objectRepository.Home;

/**
 * This class contains test method related to Campaign Module
 * @author Raghav
 *
 */
public class CampaignTest extends BaseClass{
	FileLib fLib=new FileLib();
	WebDriverCoominLib wLib=new WebDriverCoominLib();
	
	/**
	 * This is a test method used to edit a campaign and verify it
	 * @throws Throwable
	 */
	@Test
	public void editCampaignAndVerify() throws Throwable
	{
		Thread.sleep(3000);
		Home hp=PageFactory.initElements(driver, Home.class);
		hp.navigateToCampaign();
		
		Campaigns cmp=PageFactory.initElements(driver, Campaigns.class);
		cmp.newCamp();
		
		CreateNewCamp cnp=PageFactory.initElements(driver, CreateNewCamp.class);
		cnp.createCamp(fLib.getExcelData("campaign", 1, 1));
		
		
		CampaignInfo ci=PageFactory.initElements(driver, CampaignInfo.class);
		wLib.waitAndClick(ci.editBtn());
		
		cnp.targetAudTest(fLib.getExcelData("campaign", 1, 2));
		
		cnp.saveCampaignTest();
		
		SoftAssert sa=new SoftAssert();		
		sa.assertEquals(ci.getTargAudText().getText(), fLib.getExcelData("Campaign", 1, 2));
		sa.assertAll();
		Reporter.log(ci.getTargAudText().getText()+" PASS",true);
		
		
	}
}
