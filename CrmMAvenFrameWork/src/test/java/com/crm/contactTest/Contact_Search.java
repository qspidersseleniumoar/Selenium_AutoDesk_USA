
package com.crm.contactTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.commonLib.BaseClass;
import com.crm.commonLib.FileLib;
import com.crm.objectRepository.Edit_Contact;
import com.crm.objectRepository.Home;
/**
 * 
 * @author Santosh
 *
 */

public class Contact_Search extends BaseClass{
	/**
	 * 
	 * @throws Search Contact Test
	 * 1.Navigate to contact
	 * 2.Enter value to search
	 * 3.Click on Search now
	 */
		@Test
		public void editContact() throws Throwable {
		/*	FileLib excel = new FileLib();
			String src = excel.getExcelData("EditCont", 1, 0);*/
			
			/*Navigate to contact*/
	Home hp = PageFactory.initElements(driver, Home.class);		
	hp.navigateToContacts();
	
	/*Enter value to search*/
	Edit_Contact eco = PageFactory.initElements(driver, Edit_Contact.class);
	eco.sertch("tara");
	
	/*Click on Search now*/
	Edit_Contact srch = PageFactory.initElements(driver, Edit_Contact.class);
	srch.srchbtn();
	
	/*Validate the search contact*/
	String actRes = eco.getExpRes().getText();
	boolean status = actRes.contains("tara");
	Assert.assertTrue(status);
	
	
		}
}
