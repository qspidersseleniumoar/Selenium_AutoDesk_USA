package com.crm.objectRepository;
/**
 * @author SUDEEP
 * Create Projects ObjRepository
 */

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import com.crm.commonLib.WebDriverCoominLib;

public class CreateProject extends WebDriverCoominLib {
	
	@FindBy(xpath="//a[@name='Projects']")
	private WebElement clkonprojects;
	
	@FindBy(xpath="//img[@alt='Create Projects...']")
	private WebElement createnewprojects;
	
	@FindBy(xpath="//input[@name='projectname']")
	private WebElement Edtbox; 
	 
	@FindBy(xpath="//input[@class='crmButton small save']")
	private WebElement clkSave;
	
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement verifymsg;
	
	public void clickOnProject() {
		waitForElemetPresent(clkonprojects);
}
	
	public void createNewProjects() {
		waitForElemetPresent(createnewprojects);
	}
	public void editBox(String name) {
		Edtbox.sendKeys(name);
	}
	public void savebtn() {
		clkSave.click();
	}
	public WebElement verifyMsg() {
		return verifymsg;
	}
}