package com.crm.organizationtest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.commonLib.BaseClass;
import com.crm.commonLib.FileLib;
import com.crm.objectRepository.CreateNewOrganization;
import com.crm.objectRepository.Home;
import com.crm.objectRepository.OrganizationPage;

public class OrganizationTest extends BaseClass{
	@Test
	public void createOrganizationTest() throws Throwable{
		/*
		 * author-Barshana
		 * parameters create organization
		 * throws Throwable
		 */
	    FileLib excel = new FileLib();
		String Orgname = excel.getExcelData("organization",1,1);
		String web = excel.getExcelData("organization",2,1);
		

	 /* navigate to organization */
		Home home = PageFactory.initElements(driver, Home.class);
		home.navigateToOrganizations();
     /* navigate to organization page */	
		OrganizationPage orgpage = PageFactory.initElements(driver,OrganizationPage.class);
		orgpage.navigateToOrgPage();
     /* navigate to create organization*/
		CreateNewOrganization org = PageFactory.initElements(driver,CreateNewOrganization.class);
		org.createOrganization(Orgname,web);
		/*verify create organisation*/
		String actRes =org.getExpRes().getText();
		boolean status=actRes.contains(Orgname);
		Assert.assertEquals(status,true);
		
	}

}

		
		