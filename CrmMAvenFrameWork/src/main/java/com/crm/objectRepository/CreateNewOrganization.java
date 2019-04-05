package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.commonLib.BaseClass;


public class CreateNewOrganization extends BaseClass{
	
	  
	
		@FindBy(xpath="//input[@class='detailedViewTextBox' and @name='accountname']")
		WebElement orgname;
		
		@FindBy(xpath="//input[@class='detailedViewTextBox' and @name='website']")
		WebElement website;
		
		@FindBy(xpath="//input[@class='detailedViewTextBox' and @name='tickersymbol']")
		WebElement ticker;
		
		@FindBy(xpath="//input[@type='radio' and @value='T']")
		WebElement radio;
		
		@FindBy(xpath="//input[@class='crmbutton small save']")
		WebElement save;
		
		@FindBy(xpath="//span[contains(text(),'Information')]")
		WebElement expRes;
		
		public WebElement getExpRes() {
			return expRes;
		}
		
		public void setExpRes(WebElement expRes) {
			this.expRes = expRes;
		}

		public WebElement getOrgname() {
			return orgname;
		}

		public void setOrgname(WebElement orgname) {
			this.orgname = orgname;
		}

		public WebElement getWebsite() {
			return website;
		}

	   public void setWebsite(WebElement website) {
			this.website = website;
		}

		public WebElement getTicker() {
			return ticker;
		}

		public void setTicker(WebElement ticker) {
			this.ticker = ticker;
		}

		public WebElement getRadio() {
			return radio;
		}

		public void setRadio(WebElement radio) {
			this.radio = radio;
		}

		public WebElement getSave() {
			return save;
		}

		public void setSave(WebElement save) {
			this.save = save;
		}

		public void createOrganization(String Orgname,String web)
		{
			
              orgname.sendKeys(Orgname);		
              website.sendKeys(web);
              radio.click();
              save.click();
		}}
		
		