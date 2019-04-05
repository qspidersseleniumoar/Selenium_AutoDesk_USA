package com.crm.objectRepository;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.commonLib.WebDriverCoominLib;
/**
 * @author Anuj
 * 
 */
public class CreateCustomerWithInfo extends WebDriverCoominLib {
		@FindBy(xpath="//input[@name='user_name']")
		private WebElement customerNameEdt;
		@FindBy(xpath="//input[@name='user_password']")
		private WebElement passwordEdt;
		@FindBy(xpath="//input[@name='confirm_password']")
		private WebElement confpasswordEdt;
		@FindBy(xpath="//input[@name='email1']")
		private WebElement emailEdt;
		@FindBy(xpath="//input[@name='last_name']")
		private WebElement lastNameEdt;
		@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
		private WebElement lookUpEdt;
		@FindBy(xpath="//input[@id='title']")
		private WebElement titleEdt;
		@FindBy(xpath="//input[@id='department']")
		private WebElement departmentEdt;
		@FindBy(xpath="//input[@id='phone_work']")
		private WebElement officephoneEdt;
		@FindBy(xpath="//input[@id='phone_mobile']")
		private WebElement mobilephoneEdt;
		@FindBy(xpath="//input[@id='email2']")
		private WebElement otheremailEdt;
		@FindBy(xpath="//input[@id='secondaryemail']")
		private WebElement secondaryemailEdt;
		@FindBy(xpath="//input[@class='small' and @value='Change']")
		private WebElement changeBtn;
		@FindBy(xpath="//input[@class='small crmbutton save' and @name='button']")
		private WebElement saveBtn;
		@FindBy(xpath="//table[@class='listTableTopButtons']/tbody/tr/td[@class='small'][1]")
		private WebElement cptrmsg;
		@FindBy(xpath="//a[@id='user_H5']")
		WebElement lookupRtrn;
		@FindBy(xpath="//a[contains(text(),'Users')]")
		WebElement Users;
		@FindBy(xpath="//input[@class='crmButton create small']")
		WebElement newusers;
		@FindBy(id="1")
		private WebElement reportTo;

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
			Set<String> set = driver.getWindowHandles();
			/*  Capture the SessionID from the Set Collection  */
			Iterator<String> itr = set.iterator();
			String parentSessionID = itr.next();
			String childSessionID = itr.next();
			/* Pass a Driver control to child sessionID  */
			driver.switchTo().window(childSessionID);
			//LookUp lu= PageFactory.initElements(driver, LookUp.class);
	                 //lu.getLookupRtrn().click();
			lookupRtrn.click();
	        driver.switchTo().window(parentSessionID);
		}
		public void  titleEdt(String title) {
			titleEdt.sendKeys(title);
		}
		public void  departmentEdt(String department) {
			departmentEdt.sendKeys(department);
		}
		public void  officephoneEdt(String officephone) {
			officephoneEdt.sendKeys(officephone);
		}
		public void  mobilephoneEdt(String mobilephone) {
			mobilephoneEdt.sendKeys(mobilephone);
		}
		public void  otheremailEdt(String otheremail) {
			otheremailEdt.sendKeys(otheremail);
		}
		public void  secondaryemailEdt(String secondaryemail) {
			secondaryemailEdt.sendKeys(secondaryemail);
		}
		public WebElement getReportTo() {
			return reportTo;
		}

		public void changeBtn() {
			changeBtn.click();
			Set<String> set = driver.getWindowHandles();
			/*  Capture the SessionID from the Set Collection  */
			Iterator<String> itr = set.iterator();
			String parentSessionID = itr.next();
			String childSessionID = itr.next();
			/* Pass a Driver control to child sessionID  */
			driver.switchTo().window(childSessionID);
			//ChangeBtn cb= PageFactory.initElements(driver, ChangeBtn.class);
	                 //cb.getReportTo().click();
			reportTo.click();
	        driver.switchTo().window(parentSessionID);
		}
		public WebElement getSaveBtn() {
			return saveBtn;
		}
		public WebElement getCptrmsg() {
			return cptrmsg;
		}
	}


