package com.crm.organizationtest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.commonLib.BaseClass;
import com.crm.commonLib.FileLib;
import com.crm.objectRepository.Home;
import com.crm.objectRepository.OrgAdvancedsearchpage;

public class OrgAdvancedsearchTest extends BaseClass{
	@Test
	public void AdvancedsearchTest() throws Throwable{
		/*
		 * author-Barshana
		 * parameters organization advanced search
		 * throws Throwable
		 */
	    FileLib excel = new FileLib();
		String Orgname = excel.getExcelData("organization",1,1);
		
	 /* navigate to organization */
		Home home = PageFactory.initElements(driver, Home.class);
		home.navigateToOrganizations();
     /* navigate to organization page */	
		OrgAdvancedsearchpage page = PageFactory.initElements(driver,OrgAdvancedsearchpage.class);
		page.search(Orgname);
		
		String actRes =page.getExpRes().getText();
		boolean status=actRes.contains("1 - 1 of 1");
		Assert.assertEquals(status,true);
		
	}
     
}
