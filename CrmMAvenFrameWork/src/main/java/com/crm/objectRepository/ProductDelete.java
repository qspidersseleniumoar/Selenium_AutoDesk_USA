package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.crm.commonLib.WebDriverCoominLib;
/*
 * author prashant
 * product mass delete
 */
public class ProductDelete extends WebDriverCoominLib{
	
	
	@FindBy(xpath="//span[@class='genHeaderSmall']")
	WebElement verifymsg;
	
	@FindBy(xpath="//input[@id='selectCurrentPageRec']")
	WebElement select;
	
	@FindBy(xpath="(//input[@value='Delete'])[1]")
	WebElement Delete;
	
	
     
	
	public WebElement verifymsg() {
		return verifymsg;
	}
	

	public void selectcheckbox(){
		select.click();
	}
	
	public void delete(){
	Delete.click();
	}
	
}

