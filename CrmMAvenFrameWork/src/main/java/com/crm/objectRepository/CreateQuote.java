package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.commonLib.BaseClass;
import com.crm.commonLib.FileLib;
import com.crm.commonLib.WebDriverCoominLib;

public class CreateQuote extends BaseClass{
	
	WebDriverCoominLib lib= new WebDriverCoominLib();
	CreateNewOrganization createOrg=PageFactory.initElements(driver, CreateNewOrganization.class);
	ProductCreateNew selectProduct=PageFactory.initElements(driver, ProductCreateNew.class);
	
	@FindBy(name="viewName")
	private WebElement nameTxtBox;	
	
	@FindBy(xpath="//img[@alt='Create Quote...']")
	private WebElement createQouteBtn;
	
	@FindBy(linkText="Create Filter")
	WebElement createFilter;	

	@FindBy(name="subject")
	private WebElement subjectEdt;
	
	@FindBy(xpath="//input[@name='contact_name']/following-sibling::img[@src='themes/softed/images/select.gif']")
	private WebElement organizationNameIcn;
	
	@FindBy(xpath="//a[text()='HP']")
	private WebElement organizationName;
	
	@FindBy(name="bill_street")
	private WebElement billingAddressEdt; 
	
	@FindBy(name="ship_street")
	private WebElement shippingAddressEdt;
	
	@FindBy(id="searchIcon1")
	private WebElement productIcon;
	
	@FindBy(id="popup_product_9")
	private WebElement productName;
	
	@FindBy(id="qty1")
	private WebElement quantityEdt;
	
	@FindBy(id="listPrice1")
	private WebElement listPriceEdt;
	
	@FindBy(name="column2")
	WebElement column2;	
	
	@FindBy(xpath="//input[@class='crmbutton small save']")
	private WebElement saveBtn;
	
	@FindBy(id="viewname")
	WebElement filterDropdown;
	
	public WebElement getFilterDropdown() {
		return filterDropdown;
	}

	public WebElement getNameTxtBox() {
		return nameTxtBox;
	}

	public WebElement getCreateFilter() {
		return createFilter;
	}
	
	public WebElement getSubjectEdt() {
		return subjectEdt;
	}

	public WebElement getOrganizationNameEdt() {
		return organizationNameIcn;
	}

	public WebElement getBillingAddressEdt() {
		return billingAddressEdt;
	}

	public WebElement getShippingAddressEdt() {
		return shippingAddressEdt;
	}

	public WebElement getQuantityEdt() {
		return quantityEdt;
	}

	public WebElement getListPriceEdt() { 
		return listPriceEdt;
	}
	
	public WebElement getColumn2() {
		return column2;
	}

	public void setColumn2(WebElement column2) {
		this.column2 = column2;
	}
	
	public void createQuotation(String subject, String billingAddress, String shippingAddress, String quantity, String listPrice) throws Throwable
	{
		createQouteBtn.click();
		subjectEdt.sendKeys(subject);
		organizationNameIcn.click();
		lib.getAllWindowIds();
		lib.switchToChild();
		organizationName.click();
		lib.switchToParent(); 
		billingAddressEdt.sendKeys(billingAddress);	
		shippingAddressEdt.sendKeys(shippingAddress);
		productIcon.click();
		lib.getAllWindowIds();
		lib.switchToChild();
		productName.click();
		lib.switchToParent();
		quantityEdt.sendKeys(quantity);
		listPriceEdt.sendKeys(listPrice);
		saveBtn.click();
	}
	public void createFilter(String name) {
		createFilter.click();
		nameTxtBox.sendKeys(name);		
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	
}
