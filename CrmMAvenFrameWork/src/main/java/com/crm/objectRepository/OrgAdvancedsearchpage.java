package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.commonLib.BaseClass;
import com.crm.commonLib.WebDriverCoominLib;

public class OrgAdvancedsearchpage extends BaseClass{

	@FindBy(linkText="Go to Advanced Search")
	WebElement AdvSrch;
	

	
	@FindBy(xpath="//select[@class='repBox']")
	WebElement drpdown;
	
	@FindBy(linkText="equals")
	WebElement eql;
	
	@FindBy(xpath="//input[@class='repBox']")
	WebElement textbox;
	
	@FindBy(xpath="//table[@class='searchUIAdv3 small']/tbody/tr[1]/td[@class='small']/input[@class='crmbutton small create']")
	WebElement button;
	
	@FindBy(xpath="//td[contains(text(),'1 - 1 of 1')]")
	WebElement ExpRes;

	public WebElement getExpRes() {
		return ExpRes;
	}

	public void setExpRes(WebElement expRes) {
		ExpRes = expRes;
	}

	public WebElement getButton() {
		return button;
	}

	public void setButton(WebElement button) {
		this.button = button;
	}

	public WebElement getTextbox() {
		return textbox;
	}

	public void setTextbox(WebElement textbox) {
		this.textbox = textbox;
	}

	public WebElement getDrpdown() {
		return drpdown;
	}

	public void setDrpdown(WebElement drpdown) {
		this.drpdown = drpdown;
	}

	public WebElement getEquals() {
		return eql;
	}

	public void setEquals(WebElement equals) {
		this.eql = eql;
	}

	public WebElement getAdvSrch() {
		return AdvSrch;
	}

	public void setAdvSrch(WebElement advSrch) {
		AdvSrch = advSrch;
	}
	
	public void search(String Orgname)
	{
		AdvSrch.click();
		WebDriverCoominLib web=new WebDriverCoominLib();
		drpdown.click();
		web.select(drpdown,1);
		textbox.sendKeys(Orgname);
		button.click();
		
		
		
	}
}
