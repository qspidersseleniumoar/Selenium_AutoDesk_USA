package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.commonLib.WebDriverCoominLib;

public class QuotePage {

	@FindBy(xpath = "//input[@value=' Search Now ']")
	private WebElement quotesearchBtn;
	@FindBy(id = "viewname")
	private WebElement viewedit;
	WebDriverCoominLib wlib = new WebDriverCoominLib();

	@FindBy(xpath = "//table[@class='lvt small']/tbody/tr[3]/td[1]/input[@name='selected_id']")
	private WebElement chkbox;
	@FindBy(xpath = "//a[text()='Edit']")
	private WebElement editbtn;

	public void selectQuotes() {
		wlib.select(viewedit, "Open Quotes");
	}

	public void clickOnChkBox() {
		wlib.waitAndClick(chkbox);
	}

	public void clickOnEdit() {
		wlib.waitAndClick(editbtn);
	}

}
