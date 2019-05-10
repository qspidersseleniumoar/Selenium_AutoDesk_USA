package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.commonLib.WebDriverCoominLib;

/**
 * 
 * @author Tarannum
 *
 */
public class Admin {

	public WebElement getSharingAndAccessLnk() {
		return SharingAndAccessLnk;
	}

	@FindBy(xpath = "//a[contains(text(),'Sharing Access')]")
	WebElement SharingAndAccessLnk;

	@FindBy(xpath = "//b[text()='Organizations & Contacts']/../following-sibling::td/input")
	WebElement addprivillegesBtn;

	@FindBy(xpath = "//select[@id='Organizations_access']")
	WebElement accessedDropdown;

	@FindBy(id = "share_memberType")
	WebElement permissionDropdown;
	@FindBy(name = "add")
	WebElement addBtn;

	@FindBy(xpath = "//table[@class='listTable']//tr[*]/td[3]/*")
	WebElement actual_val;

	public void clickOnSharingAndAccessLnk(WebDriverCoominLib wlib) {
		wlib.waitAndClick(SharingAndAccessLnk);

	}

	public void clickOnaddprivillegesBtn(WebDriverCoominLib wlib) {
		wlib.waitAndClick(addprivillegesBtn);

	}

	public void selectByaccesseddropDown(WebDriverCoominLib wlib, String Option) throws Throwable {
		wlib.select(accessedDropdown, Option);

	}

	public void selectByPermissiondropDown(WebDriverCoominLib wlib, String Option) throws Throwable {
		wlib.select(permissionDropdown, Option);

	}

	public void clickOnAddBtn(WebDriverCoominLib wlib) {
		wlib.waitAndClick(addBtn);

	}

	public WebElement getActual_val() {
		return actual_val;
	}

}
