package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.commonLib.BaseClass;
import com.crm.commonLib.WebDriverCoominLib;

public class EditPurchaseOrder {
	
	WebDriverCoominLib lib= new WebDriverCoominLib();
	CreatePurchaseOrderPage cpo  = PageFactory.initElements(BaseClass.driver, CreatePurchaseOrderPage.class);	
	@FindBy(name = "Edit")
	private WebElement editBtn;
	
	@FindBy(xpath = "//select[@name='postatus']")
	private WebElement editStatus;
	
	public WebElement getEditBtn() {
		return editBtn;
	}
	public WebElement getEditStatus() {
		return editStatus;
	}	
	
	public void editSubject()
	{
		editBtn.click();
	}	
	public void clearSubject()
	{
		cpo.getEnterSubject().clear();
	}
	public void editNewSubject(String newSubjectName)
	{
		cpo.getEnterSubject().sendKeys(newSubjectName);
	}
	public void editStatusName()
	{
		editStatus.click();
		lib.select(editStatus, "Approved");
	}
	public void savePurchaseOrderWithNewSubject()
	{
		cpo.getSavePurchaseOrder().click();
		
	}
}

