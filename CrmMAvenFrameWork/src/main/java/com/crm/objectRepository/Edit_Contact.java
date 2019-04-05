
	package com.crm.objectRepository;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	/**
	 * 
	 * @author Santosh
	 *
	 */
	public class Edit_Contact {
		@FindBy(xpath="//table[@class='lvt small']/tbody/tr[3]/td[*]/a[text()='edit']")
		private WebElement edtebtn;
		
		@FindBy(xpath="//a[text()='Contacts']/@href")
		private WebElement clickcontact;
		
		@FindBy(xpath="//input[@value='  Save  ']")
		private WebElement savebtn;
		
		@FindBy(xpath="//input[@name='lastname']")
		private WebElement lastnm;
		
		@FindBy(xpath="//input[@name='search_text']")
		private WebElement searcht;
		
		@FindBy(xpath="//input[@name='submit']")
		private WebElement searchbtn;
		
/*	@FindBy(xpath="//td[contains(text(),'1 - 1 of 1')]")
		WebElement ExpRes;
		
		public WebElement getExpRes() {
			return ExpRes;
		}
*/

		
		public void srchbtn()
		{
			searchbtn.click();
		}
		public void sertch(String er)
		{
			searcht.sendKeys(er);
		}
		
		public void editlastnm(String qw)
		{
			lastnm.sendKeys(qw);
		}
		public void clicksave()
		{
			savebtn.click();
		}
		
		
		public void clickoncontact()
		{
			clickcontact.click();
		}
		
		public void navigatetoedtebtn()
		{
			edtebtn.click();
		}
	}

