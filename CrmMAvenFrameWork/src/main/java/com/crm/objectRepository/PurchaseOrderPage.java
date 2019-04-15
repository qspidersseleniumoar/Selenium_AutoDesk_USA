package com.crm.objectRepository;


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.commonLib.BaseClass;
import com.crm.commonLib.FileLib;
import com.crm.commonLib.WebDriverCoominLib;
/**
 * 
 * @author PrathijnaRaoK
 *
 */
public class PurchaseOrderPage extends BaseClass  {
	
	WebDriverCoominLib wcl=new WebDriverCoominLib();
	
	@FindBy(xpath="//img[@title='Create Purchase Order...']")
	private WebElement poCreateImg;
    /*Search TextBox*/
	@FindBy(xpath="//input[@class='txtBox']")
	WebElement searchPurchaseorder;
	
	@FindBy(id="bas_searchfield")
	WebElement inDropDown;
	/*Click on Search*/
	@FindBy(name="submit")
	WebElement clickSearch;
	/*Capturing Searched Data*/
	@FindBy(xpath="//td[text()='PO1 ']")
	WebElement captureText;
	
	public WebElement getCaptureText() {
		return captureText;
	}
	/*Navigate to Delete*/
	@FindBy(xpath="//a[text()='del']")
	WebElement deleteTheSearchedPo;
	
	

	
	public WebElement getDeleteTheSearchedPo() {
		return deleteTheSearchedPo;
	}
	public void navigateToCreatePo()
	{
		poCreateImg.click();
	}
	public WebElement getPoCreateImg() {
		return poCreateImg;
	}
	/*SearcingPO from ExcelFile*/
	public void search_purchase_Order() throws Throwable{
		searchPurchaseorder.click();
		FileLib flib=new FileLib();
		searchPurchaseorder.sendKeys(flib.getExcelData("SearchPo", 1, 2));
	}
	/*Handle DropDown for PO*/
	public void cilckDD(){
		wcl.select(inDropDown, "PurchaseOrder No");
		/*inDropDown.click();
		select(inDropDown, "PurchaseOrder No");*/
	}
	/*Click on SearchButton*/
	public void searchBtnClick(){
		clickSearch.click();
	}
	/*Verifying the Searched PurchaseOrder*/
	public void verifySearchedPo(){
		String expValue="PO5";
		String actValue=captureText.getText();
		Assert.assertEquals(actValue, expValue);
	}
	/*Handling Delete PopUp*/
	public void deletebtnInSearchedPo(){
		deleteTheSearchedPo.click();
		Alert alt=driver.switchTo().alert();
		String actualmsg=alt.getText();
		alt.accept();
		String expected="Are You Sure You want to Delete?";
		Assert.assertEquals(actualmsg, expected);
	
	}
	/*Verification for Deleting of SearchedPO
	public void verifyTheDeletedPo(){
	String actual=wcl.getAlertTest();
	String expected="Are You Sure You want to Delete?";
	Assert.assertEquals(actual, expected);
	
	}*/
}
