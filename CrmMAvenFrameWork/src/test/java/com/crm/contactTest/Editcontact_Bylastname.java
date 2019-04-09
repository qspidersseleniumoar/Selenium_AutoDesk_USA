
	package com.crm.contactTest;


	import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

	import com.crm.commonLib.BaseClass;
	import com.crm.commonLib.FileLib;
import com.crm.objectRepository.Edit_Contact;
import com.crm.objectRepository.Home;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
/**
 * 
 * @author Santosh
 *
 */

	public class Editcontact_Bylastname extends BaseClass {
		/**
		 * 
		 * @throws Edit Contact List Test
		 * 1.Navigate to Contact
		 * 2.Click on Edit Button
		 * 3.Edit Last Name
		 * 4.Click on Save
		 */
		
		@Test
		public void editContact() throws Throwable {
			ExtentTest testlog =extent.startTest("EditContact");
			testlog.log(LogStatus.INFO,"Loginto Success");
			
			FileLib excel = new FileLib();
			String editlast = excel.getExcelData("EditCont", 1, 0);
			
			/*Navigate to contact*/
			
			
	Home hp = PageFactory.initElements(driver, Home.class);		
	hp.navigateToContacts();
	
	
	testlog.log(LogStatus.PASS, "Edit Contact");
	
	/*Click on Edit button */
	Edit_Contact ec = PageFactory.initElements(driver, Edit_Contact.class);
	ec.navigatetoedtebtn();
	
	testlog.log(LogStatus.FAIL, "Edit Contact");
	
	/*Edit last name*/
	Edit_Contact eco = PageFactory.initElements(driver, Edit_Contact.class);
	eco.editlastnm("tara");
	
	testlog.log(LogStatus.WARNING,"Edit Contact" );
	
	/*Click on Save*/
	Edit_Contact ec1 = PageFactory.initElements(driver, Edit_Contact.class);
	ec1.clicksave();
	
	testlog.log(LogStatus.INFO, "LogOut");
	extent.endTest(testlog);
	
	/*Verify Edit Contact*/
	String actRes = eco.getExpRes().getText();
	boolean status = actRes.contains("tara");
	Assert.assertTrue(status);
		

	} 

}


