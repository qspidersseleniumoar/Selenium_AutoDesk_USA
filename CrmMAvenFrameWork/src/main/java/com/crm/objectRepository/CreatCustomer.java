package com.crm.objectRepository;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.commonLib.BaseClass;
import com.crm.commonLib.WebDriverCoominLib;

public class CreatCustomer extends WebDriverCoominLib {
	@FindBy(xpath="//input[@name='user_name']")
	 WebElement customerNameEdt;
	@FindBy(xpath="//input[@name='user_password']")
	 WebElement passwordEdt;
	@FindBy(xpath="//input[@name='confirm_password']")
	 WebElement confpasswordEdt;
	@FindBy(xpath="//input[@name='email1']")
	 WebElement emailEdt;
	@FindBy(xpath="//input[@name='last_name']")
	 WebElement lastNameEdt;
	@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
	 WebElement lookUpEdt;
	@FindBy(xpath="//input[@class='small crmbutton save' and @name='button']")
	 WebElement saveBtn;
	@FindBy(xpath="//table[@class='listTableTopButtons']/tbody/tr/td[@class='small'][1]")
	 WebElement cptrmsg;
	@FindBy(xpath="//a[@id='user_H5']")
	WebElement lookupRtrn;
	@FindBy(xpath="//a[contains(text(),'Users')]")
	WebElement Users;
	@FindBy(xpath="//input[@class='crmButton create small']")
	WebElement newusers;
	

	public void  editCustomerName(String customername) {
		customerNameEdt.sendKeys(customername);
	}
	public void  editPassword(String password) {
		passwordEdt.sendKeys(password);
	}
	public void  editConfPassword(String confpassword) {
		confpasswordEdt.sendKeys(confpassword);
	}
	public void  editEmail(String email) {
		emailEdt.sendKeys(email);
	}
	public void  lastName(String lastName) {
		lastNameEdt.sendKeys(lastName);
	}
	public WebElement getLookUpEdt() {
		return lookUpEdt;
	}
	public void navigateToUser(){
		waitAndClick(Users);
	}
	public void navigateToNewUser(){
		waitAndClick(newusers);
	}
	public void  lookup() {
		lookUpEdt.click();
		Set<String> set = BaseClass.driver.getWindowHandles();
		/*  Capture the SessionID from the Set Collection  */
		Iterator<String> itr = set.iterator();
		String parentSessionID = itr.next();
		String childSessionID = itr.next();
		/* Pass a Driver control to child sessionID  */
		BaseClass.driver.switchTo().window(childSessionID);
		//LookUp lu= PageFactory.initElements(driver, LookUp.class);
		lookupRtrn.click();
		//getLookUpEdt().click();
		BaseClass.driver.switchTo().window(parentSessionID);
	}
	public void getSaveBtn() {
		waitAndClick(saveBtn);
	}
	public WebElement getCptrmsg() {
		return cptrmsg;
	}
}
