package com.crm.organizationTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.crm.commonLib.BaseClass;
import com.crm.commonLib.FileLib;
import com.crm.objectRepository.Home;
import com.crm.objectRepository.OrganizationPage;
/**
 * 
 * @author Er-Sushil
 *
 */

public class OrganizationTest extends BaseClass {
	OrganizationPage org = PageFactory.initElements(driver, OrganizationPage.class);
@Test
	public void searchByBillingCityWithnumericData() throws Throwable{
		FileLib flib= new FileLib();
		
		Home hp= PageFactory.initElements(driver, Home.class);
		/*click on the organization button*/
		hp.navigateToOrganizations();
		
		/*search by billing city*/
		OrganizationPage org = PageFactory.initElements(driver, OrganizationPage.class);
	      Thread.sleep(3000);
		 String searchbyvalue =flib.getExcelData("organization", 0, 1);
		 org.selectDropdwn(searchbyvalue);
		 
		 /* data putting to the search box*/
		String Data= flib.getExcelData("organization", 1, 1);
		org.searchtextbox(Data);
		 
		 /*search button click*/
		 org.clickSearch();
		 

}


}