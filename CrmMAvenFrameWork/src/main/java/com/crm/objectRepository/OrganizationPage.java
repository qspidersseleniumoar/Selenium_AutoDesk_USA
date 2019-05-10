package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.crm.commonLib.WebDriverCoominLib;

public class OrganizationPage extends WebDriverCoominLib{
	@FindBy(xpath="//img[@alt='Create Organization...']")
    WebElement Org;
	


	public void navigateToOrgPage() {
		Org.click();
	}
	/* method for dropdown text box*/
	@FindBy(xpath="//div[@id='basicsearchcolumns_real']/select[@id='bas_searchfield']")
	private WebElement searchDropdown;
	
	public void selectDropdwn( String SearchBoxValue) {	
		Select sel=new Select(searchDropdown); 
		sel.selectByVisibleText(SearchBoxValue);
		}
	
	@FindBy(name="search_text")
	private WebElement searchtextbox;
	public void searchtextbox( String Data)
	{
		searchtextbox.sendKeys(Data);
	}
	
	@FindBy(xpath="//input[@name='submit']")
	private WebElement clikSearch;
	public void clickSearch() {
		clikSearch.click();
		
	}
}

