package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.commonLib.BaseClass;

public class ProductCreateNew extends BaseClass {
	@FindBy(xpath = "//img[@alt='Create Product...']")
	private WebElement Createbtn;

	@FindBy(name = "productname")
	private WebElement productnameedt;

	@FindBy(id = "productcode")
	private WebElement productnumberedt;

	@FindBy(id = "jscal_field_sales_start_date")
	private WebElement saleStartEdit;

	
	
	@FindBy(name = "productcategory")
	private WebElement catagorySelct;

	@FindBy(id = "jscal_field_sales_end_date")
	private WebElement saleEndEdit;

	@FindBy(id = "vendor_part_no")
	private WebElement vendorPartNoEdit;

	@FindBy(id = "productsheet")
	private WebElement proSheetNoEdit;

	@FindBy(name = "manufacturer")
	private WebElement manufactureSelct;

	@FindBy(name = "start_date")
	private WebElement supportStartDateEdit;

	@FindBy(name = "expiry_date")
	private WebElement supportEndDateEdit;

	@FindBy(name = "website")
	private WebElement websiteEdit;

	@FindBy(id = "mfr_part_no")
	private WebElement partNoEdit;

	@FindBy(id = "serial_no")
	private WebElement serialNoEdit;

	@FindBy(xpath = "//img[@alt='Select']")
	private WebElement vendornameclick;

	@FindBy(xpath = "//input[@value='  Save  ']")
	private WebElement savebtn;

	@FindBy(xpath = "//span[@class='lvtHeaderText']")
	private WebElement productnamedetail;

	public void navigatetocreateprdtname() {
		Createbtn.click();
	}

	public void enterprdtname(String producname) {
		productnameedt.sendKeys(producname);
	}

	public void enterproductnumberedt(String productnumber) {
		productnumberedt.sendKeys(productnumber);
	}

	public void salesStartDate(String salesStart) {
		saleStartEdit.sendKeys(salesStart);
	}

	public void salesEndDate(String salesEnd) {
		saleEndEdit.sendKeys(salesEnd);
	}

	public void catagorySelect(String catName) {
		wlib.select(catagorySelct, catName);
	}

	public void vendorPartNo(String vPartNo) {
		vendorPartNoEdit.sendKeys(vPartNo);
	}

	public void productSheetNo(String pSheetNo) {
		proSheetNoEdit.sendKeys(pSheetNo);
	}

	public void manufactureSelect(String mfrName) {
		wlib.select(manufactureSelct, mfrName);
	}

	public void supportStartDate(String supportStart) {
		supportStartDateEdit.sendKeys(supportStart);
	}

	public void supportEndDate(String supportEnd) {
		supportEndDateEdit.sendKeys(supportEnd);
	}

	public void webSiteEdit(String website) {
		websiteEdit.sendKeys(website);
	}

	public void mfrPartNo(String mPartNo) {
		partNoEdit.sendKeys(mPartNo);
	}

	public void serialNo(String serial) {
		serialNoEdit.sendKeys(serial);
	}

	public void savebtn() {
		savebtn.click();
	}

	public WebElement productnamedetail() {
		return productnamedetail;
	}

	public void vendornameclick() {
		vendornameclick.click();
	}

}
