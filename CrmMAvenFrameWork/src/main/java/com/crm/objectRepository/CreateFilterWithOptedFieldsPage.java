package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.commonLib.WebDriverCoominLib;

/**
 * 
 * @author moshin
 *
 */
public class CreateFilterWithOptedFieldsPage extends WebDriverCoominLib {
	@FindBy(linkText="Create Filter")
	private WebElement CreateFilter;
	@FindBy(name="viewName")
	private WebElement ViewNAmeEdtBox;
	@FindBy(name="column1")
	private WebElement PriceBookNameDdn;
	@FindBy(xpath="//select[@id='column1']/optgroup[1]/option[4]")
	private WebElement CreatedTimeOPtion;
	@FindBy(id="mi")
	private WebElement AdvanceSearchOptn;
	@FindBy(id="fcol0")
	private WebElement AdvanceRequiredElementsDdn;

	@FindBy(xpath="//select[@class='detailedViewTextBox']/optgroup[1]/option[1]")
	private WebElement PriceBookNameOptn;

	@FindBy(xpath="//select[@class='detailedViewTextBox']/optgroup[1]/option[1]")
	private WebElement containsDdn;

	@FindBy(xpath="//select[@class='repBox']/option[6]")
	private WebElement containsOptn;

	@FindBy(id="fval0")
	private WebElement TextEdtBox;

	@FindBy(xpath="//td[contains(text(),'Showing Records 1')]")
	private WebElement ActMsgVerify;

	public WebElement getActMsgVerify() {
		return ActMsgVerify;
	}
	@FindBy(name="button2")
	private WebElement savebtn;
	public void CreateFilterWithOpted(String BooKName, String repBox){
		CreateFilter.click();
		ViewNAmeEdtBox.sendKeys(BooKName);
		PriceBookNameDdn.click();
		CreatedTimeOPtion.click();
		AdvanceSearchOptn.click();
		AdvanceRequiredElementsDdn.click();
		PriceBookNameOptn.click();
		containsDdn.click();
		containsOptn.click();
		TextEdtBox.sendKeys(repBox);
		savebtn.click();
		
	}
	
}
