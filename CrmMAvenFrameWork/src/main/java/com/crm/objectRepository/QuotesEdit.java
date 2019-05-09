package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.crm.commonLib.WebDriverCoominLib;

public class QuotesEdit {
	@FindBy(id="column1")
	private WebElement col1;
	
	 @FindBy(id="column2")
	private WebElement col2;
	 @FindBy(id="column5")
	private WebElement col3;
	 @FindBy(id="column6")
	 private WebElement col4;
	 @FindBy(xpath="//input[@class='crmbutton small save']")
	private WebElement savebtn;
	 WebDriverCoominLib wlib=new WebDriverCoominLib();
	 public void selectNone() {
			wlib.select(col1, "None");
			wlib.select(col2, "None");
			wlib.select(col3, "None");
			wlib.select(col4, "None");

		}
		public void ClickOnSave() {
			wlib.waitAndClick(savebtn);
			
		}
}
