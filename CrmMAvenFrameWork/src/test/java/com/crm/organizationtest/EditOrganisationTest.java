package com.crm.organizationtest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.commonLib.BaseClass;
import com.crm.commonLib.FileLib;
import com.crm.commonLib.WebDriverCoominLib;
import com.crm.objectRepository.CreateNewOrganization;
import com.crm.objectRepository.EditOrganizationPage;
import com.crm.objectRepository.Home;

/**
 * Author -Bipin
 * parameters edit Editorganisation
 * throws throwable
 */
public class EditOrganisationTest extends BaseClass {
	FileLib excel = new FileLib();
	@Test
	public void EditOgranisationTest() throws Throwable{
		/**
		 * @throws edit organization Test
		 * 1.navigate to organization
		 * 2.navigate to editorganization page
		 * 3.navigate to organization and website page
		 * 4.validate edit organization
		 */
		
	    String web="www.wesite.com";//excel.getExcelData("editorg", 1, 0);
		String Orgname="worldbank";//excel.getExcelData("editorg", 0, 1);
		 /* click on organization */
		Home home = PageFactory.initElements(driver, Home.class);
		home.navigateToOrganizations();
		/*click on edit button */
		EditOrganizationPage edit=PageFactory.initElements(driver, EditOrganizationPage.class);
		edit.navigateToEditOrg();
		/*Edit oganization and wesite field*/
		CreateNewOrganization neworg=PageFactory.initElements(driver,  CreateNewOrganization.class);
		neworg.createOrganization(Orgname, web);
		/*verify edit organisation*/
		String actual=edit.getTextcapture().getText();
		System.out.println(actual);
		String expected="worldbank";
		Assert.assertEquals(actual, expected);
		
		
		
	}
	
	
	

}
