package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.commonLib.WebDriverCoominLib;

public class OrganizationPage extends WebDriverCoominLib{
	@FindBy(xpath="//img[@alt='Create Organization...']")
    WebElement Org;
	
	public WebElement getOrg() {
		return Org;
	}

	public void setOrg(WebElement org) {
		Org = org;
	}

	public void navigateToOrgPage() {
		Org.click();
	}
}
