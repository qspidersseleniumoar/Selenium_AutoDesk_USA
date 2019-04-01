package com.crm.campaignTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.commonLib.BaseClass;
import com.crm.commonLib.FileLib;
import com.crm.objectRepository.CampaignInfo;
import com.crm.objectRepository.Campaigns;
import com.crm.objectRepository.CreateNewCamp;
import com.crm.objectRepository.Home;
 
@Listeners(com.crm.commonLib.SampleList.class)
 

		public class CampTest extends BaseClass {
			 
			@Test 
			public void createcampTest() throws Throwable{
				
				FileLib excel = new FileLib();
				String campName=excel.getExcelData("campaign", 1, 2);
			
			 /* navigate to campaign */
				Home home = PageFactory.initElements(driver, Home.class);
				home.navigateToCampaign();
			
			 /* navigate to create campaign*/
				Campaigns camp= PageFactory.initElements(driver, Campaigns.class);
				camp.newCamp();
			/* create campaign*/
				CreateNewCamp newcamp =PageFactory.initElements(driver, CreateNewCamp.class);
				newcamp.createCamp(campName);
			 /* verify campaign name*/	
				CampaignInfo caminfo = PageFactory.initElements(driver, CampaignInfo.class);
				String campnameedit = caminfo.getVerifyCampname().getText();
				 Assert.assertEquals(campnameedit.trim(), campName);
	 		}
			
			
			}
	

