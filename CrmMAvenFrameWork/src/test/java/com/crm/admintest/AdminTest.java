package com.crm.admintest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.commonLib.BaseClass;
import com.crm.objectRepository.Admin;
import com.crm.objectRepository.Home;

/**
 * 
 * @author Tarannum
 *
 */
public class AdminTest extends BaseClass {
	@Test
	public void edit_OrgAndCont_CustomPrivilegeRule() throws Throwable {
		Home home = PageFactory.initElements(driver, Home.class);
		/*Cursor is at crm setting*/
		home.MoveToSettingImg(wlib);
		home.clickOnSettingImg(wlib);
		
		/*click on setting link*/
		Admin admin = PageFactory.initElements(driver, Admin.class);
		
		/* click on SharingAndAccess Link*/
		admin.clickOnSharingAndAccessLnk(wlib);
		
		/* Click on add Privilleges Button*/
		admin.clickOnaddprivillegesBtn(wlib);
		/* scroll down*/
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		
		/* fetching data from excel and select an entity accessedBy  */
		String option1 = eLib.getExcelData("Admin", 4, 3);
		admin.selectByaccesseddropDown(wlib, option1);
		
		/* fetching data from excel and select an entity by permission  */
		String option2 = eLib.getExcelData("Admin", 3, 4);
		admin.selectByPermissiondropDown(wlib, option2);
		
		/* click on Add Rule button */
		admin.clickOnAddBtn(wlib);
		
		/* Assert validation */
		String actual_val=admin.getActual_val().getText();
		boolean status=actual_val.contains("Role");
		Assert.assertTrue(status);

	}
}
