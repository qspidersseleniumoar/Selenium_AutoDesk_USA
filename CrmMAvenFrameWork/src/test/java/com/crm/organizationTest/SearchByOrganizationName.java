package com.crm.organizationTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.crm.commonLib.BaseClass;
import com.crm.commonLib.FileLib;
import com.crm.objectRepository.Home;
import com.crm.objectRepository.SearchConByTitle;

public class SearchByOrganizationName extends BaseClass {
	@Test
	public void SearchOrgTest() throws Throwable {

		FileLib flib = new FileLib();
		String Organa = flib.getExcelData("campaign", 1, 1);

		/* navigate to Organization page */

		Home org = PageFactory.initElements(driver, Home.class);
		org.navigateToOrganizations();

		/* search by name and title */

		SearchConByTitle ser = PageFactory.initElements(driver, SearchConByTitle.class);
		ser.searchEditBox(Organa);

		/* select organization name from Dropdown */
		/*
		 * SearchConByTitle tit = PageFactory.initElements(driver,
		 * SearchConByTitle.class); tit.selectTitleFromDD("Organization Name");
		 *s 
		 * click on select btn SearchConByTitle ser1 = PageFactory.initElements(driver,
		 * SearchConByTitle.class); ser1.searchBtn();
		 */

	}

}
