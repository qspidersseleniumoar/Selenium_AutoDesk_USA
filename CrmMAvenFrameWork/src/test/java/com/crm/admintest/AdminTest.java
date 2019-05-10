package com.crm.admintest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.commonLib.BaseClass;
import com.crm.objectRepository.Admin;
import com.crm.objectRepository.Home;
import com.crm.objectRepository.SharingAccess;

/**
 * 
 * @author Tarannum, Praveen
 *
 */

public class AdminTest extends BaseClass {
	@Test
	public void edit_OrgAndCont_CustomPrivilegeRule() throws Throwable {
		Home home = PageFactory.initElements(driver, Home.class);
		/* Cursor is at crm setting */
		home.MoveToSettingImg(wlib);
		home.clickOnSettingImg(wlib);

		/* click on setting link */
		Admin admin = PageFactory.initElements(driver, Admin.class);

		/* click on SharingAndAccess Link */
		admin.clickOnSharingAndAccessLnk(wlib);

		/* Click on add Privilleges Button */
		admin.clickOnaddprivillegesBtn(wlib);
		/* scroll down */
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");

		/* fetching data from excel and select an entity accessedBy */
		String option1 = eLib.getExcelData("Admin", 4, 3);
		admin.selectByaccesseddropDown(wlib, option1);

		/* fetching data from excel and select an entity by permission */
		String option2 = eLib.getExcelData("Admin", 3, 4);
		admin.selectByPermissiondropDown(wlib, option2);

		/* click on Add Rule button */
		admin.clickOnAddBtn(wlib);

		/* Assert validation */
		String actual_val = admin.getActual_val().getText();
		boolean status = actual_val.contains("Role");
		Assert.assertTrue(status);

	}

	@Test
	public void addCustomRulesToLeads() {
		/* step1: navigate to settings page from home page */
		Home hp = PageFactory.initElements(driver, Home.class);
		hp.navigateToSettigsPage();

		/* step2: click on sharing access link from settings page */
		Admin ap = PageFactory.initElements(driver, Admin.class);
		ap.getSharingAndAccessLnk().click();

		/* step3: add privileges to leads */
		/* clicking on add privileges button */
		SharingAccess sa = PageFactory.initElements(driver, SharingAccess.class);
		sa.getAddPrivLeadsBtn().click();
		/* selection rules and permissions */
		sa.selectLeadsOf("CEO");
		sa.selectLeadsAccessedBy("Sales Manager");
		sa.selectLeadsPermissions("Read Only");
		/* clicking on add button to save the rules */
		sa.getLeadsAddBtn().click();

		/* step4: validating the added rule */
		boolean status = sa.getLeadsTableLeadsOfColumn().get(sa.tableSize() - 1).getText().toLowerCase().contains("ceo")
				&& sa.getLeadsTableAccessedByColumn().get(sa.tableSize() - 1).getText().toLowerCase()
						.contains("sales manager")
				&& sa.getLeadsPermissionsColumn().get(sa.tableSize() - 1).getText().toLowerCase().contains("read only");

		Assert.assertTrue(status, "Validation == FAIL");

	}
}
