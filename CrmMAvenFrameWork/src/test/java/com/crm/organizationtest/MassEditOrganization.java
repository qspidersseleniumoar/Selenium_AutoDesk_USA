package com.crm.organizationtest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.commonLib.BaseClass;
import com.crm.commonLib.FileLib;
import com.crm.objectRepository.CreateNewOrganization;
import com.crm.objectRepository.EditOrganizationPage;
import com.crm.objectRepository.Home;
/**
 * Author -Bipin
 * parameters edit Editorganisation
 * throws throwable
 */

public class MassEditOrganization extends BaseClass {
	@Test
	
	public void massEditOrgTest() throws Throwable{
		FileLib excel = new FileLib();
		String pnum="93156897";//excel.getExcelData("editorg", 2, 0);
		String webname="www.editorg";//excel.getExcelData("editorg", 1, 2);
		
		/*navigate to organization*/
		Home home = PageFactory.initElements(driver, Home.class);
		home.navigateToOrganizations();
		/* 1.select all organsation
		 * 2.click mass delete
		 * 3.edit phone no
		 * 4.edit website
		  */
       EditOrganizationPage massedit=PageFactory.initElements(driver, EditOrganizationPage.class);
	   massedit.selectall();
	   massedit.massclick();
	   massedit.phoneEdit(pnum);
	   massedit.editwebsite(webname);
	   /*navigate to savebutton*/
	   CreateNewOrganization save=PageFactory.initElements(driver, CreateNewOrganization.class);
	   save.saveclk();
	   /* verify edit organisation*/
	   
	    String actual=massedit.getnewwebsite().getText();
		System.out.println(actual);
		String expected="www.neworg.com";
		Assert.assertEquals(actual, expected);
}
}