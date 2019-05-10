package com.crm.orgnisationtest;

/**
 * @author Sneha
 */
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.commonLib.BaseClass;
import com.crm.commonLib.WebDriverCoominLib;
import com.crm.objectRepository.CreateNewOrganization;
import com.crm.objectRepository.Home;

public class OrgnisationTest extends BaseClass {
	@Test
	public void deleteOrgnisation() throws Throwable {

		String orgName = eLib.getExcelData("Sneha", 0, 3);
		String orgWeb = eLib.getExcelData("Sneha", 1, 1);
		Home hm = PageFactory.initElements(driver, Home.class);
		/* Create orgnisation */
		CreateNewOrganization co = PageFactory.initElements(driver, CreateNewOrganization.class);
		hm.navigateToOrganizations();
		co.getCreateOrg().click();
		Thread.sleep(2000);
		co.createOrganization(orgName, orgWeb);
		Thread.sleep(2000);
		//co.saveclk();
		/* verify org created or not */
		String expectd = "Organization";
		String actual = co.getExpRes().getText();
		System.out.println(actual);
		boolean status1 = actual.contains(expectd);
		Assert.assertTrue(status1);
		/* Delete org */
		Thread.sleep(2000);
		hm.navigateToOrganizations();
		Thread.sleep(2000);
		co.getChkBox().click();
		co.getDelettab().click();
		/* verify all org got deleted or not */
		WebDriverCoominLib wlib = new WebDriverCoominLib();
		wlib.switchToAlert();
		String expected = "No Organization Found";
		String actul = co.getNoOrgFnd().getText();
		boolean status2 = actul.contains(expected);
		Assert.assertTrue(status2);
	}
}