package com.crm.searchContByTitleTest;



	import org.openqa.selenium.support.PageFactory;
	import org.testng.Assert;
	import org.testng.Reporter;
	import org.testng.annotations.Test;

	import com.crm.commonLib.BaseClass;
	import com.crm.commonLib.FileLib;
	import com.crm.objectRepository.Campaigns;
	import com.crm.objectRepository.Contacts;
	import com.crm.objectRepository.CreateContact;
	import com.crm.objectRepository.CreateNewCamp;
	import com.crm.objectRepository.Home;
import com.crm.objectRepository.SearchConByTitle;

import com.relevantcodes.extentreports.ExtentTest;
	import com.relevantcodes.extentreports.LogStatus;
	/*
	 * 
	 * author:-saurabh
	 * 
	 */

	public class SearchByTitleTest extends BaseClass {
		/*
		 *@throws contactTest
		 *navigate to contact module
		 * click on create organisation button
		 * create organisation
		 * verify
		 */
		@Test
		public void createContactTest() throws Throwable{
			ExtentTest testlog = extent.startTest("ContactTest");
			testlog.log(LogStatus.INFO, "Login successfully");

			FileLib excel = new FileLib();
			
			/*String lastName=excel.getExcelData("contact", 1, 2);
			String firstName=excel.getExcelData("contact", 1, 3); 
			String Title=excel.getExcelData("contact", 1, 4);*/
			
			/* navigate to contact */
			Home home = PageFactory.initElements(driver, Home.class);
			home.navigateToContacts();
			testlog.log(LogStatus.PASS, "Navigate to Contact");
			
			
			/* navigate to create contact page*/
			Contacts cont= PageFactory.initElements(driver, Contacts.class);
			cont.navigateToCreateContact();
			testlog.log(LogStatus.PASS, "Navigate to create Contact page"); 

			
		
			/* create contacts*/
			CreateContact newcont =PageFactory.initElements(driver,CreateContact.class);
			newcont.lastnameeditbox("sara");
			newcont.firstnameeditbox("has");
			newcont.titleeditbox("for lead2");
		    newcont.contSave();
		    testlog.log(LogStatus.PASS, "Contact created");
		    
		   
		    /*verify create contact*/
		      String actRes=newcont.getExpRes().getText();
		     boolean status=actRes.contains("sara");
		     Assert.assertTrue(status);
		     testlog.log(LogStatus.PASS, "Contact verified");
		     testlog.log(LogStatus.INFO, "Logout");
		}
	
	@Test(priority=2)
	public void searchByTitle() throws Throwable{
		
	Home home = PageFactory.initElements(driver, Home.class);
	home.navigateToContacts();
		
	SearchConByTitle search=PageFactory.initElements(driver, SearchConByTitle.class);
    search.searchEditBox("for lead2");
    search.selectTitleFromDD();
    search.searchBtn();
    String expmsg="Showing Records";
    String actmsg=search.verifymsg().getText();
    boolean status=actmsg.contains(expmsg);
    Assert.assertTrue(status);
	}
		
	}



