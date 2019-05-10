package com.crm.objectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.commonLib.BaseClass;
import com.crm.commonLib.WebDriverCoominLib;

public class OrganizationPage extends WebDriverCoominLib {
	@FindBy(xpath = "//img[@alt='Create Organization...']")
	WebElement Org;

	public void navigateToOrgPage() {
		Org.click();
	}

	/* method for dropdown text box */
	@FindBy(xpath = "//div[@id='basicsearchcolumns_real']/select[@id='bas_searchfield']")
	private WebElement searchDropdown;

	public void selectDropdwn(String SearchBoxValue) {
		Select sel = new Select(searchDropdown);
		sel.selectByVisibleText(SearchBoxValue);
	}

	@FindBy(name = "search_text")
	private WebElement searchtextbox;

	public void searchtextbox(String Data) {
		searchtextbox.sendKeys(Data);
	}

	@FindBy(xpath = "//input[@name='submit']")
	private WebElement clikSearch;

	public void clickSearch() {
		clikSearch.click();

	}

	Home hp = PageFactory.initElements(BaseClass.driver, Home.class);
	@FindBy(name = "accountname")
	private WebElement orgNameEdtBox;

	@FindBy(xpath = "//input[@name='assigntype' and @value='U']")
	private WebElement assignToUserCheckBox;

	@FindBy(xpath = "//input[@name='assigntype' and @value='T']")
	private WebElement assignToGroupCheckBox;

	@FindBy(name = "assigned_group_id")
	private WebElement assignToDD;

	@FindBy(xpath = "//input[@accesskey='S']")
	private WebElement QuickCreateSaveBtn;

	@FindBy(xpath = "//table[@class='lvt small']/tbody/tr[1]/td/input[@id='selectCurrentPageRec']")
	private WebElement selectAllOrgCheckBox;

	@FindBy(xpath = "//table[@class='lvt small']/tbody/tr[*]/td[1]/input")
	private List<WebElement> orgCheckBoxList;

	@FindBy(xpath = "(//input[@value='Delete'])[2]")
	private WebElement orgDeleteBtn;

	public void QuickCreateOrganizationAssignToUser(String module, String orgName, String userOption) {
		hp.selectFromQuickCreate(module);
		orgNameEdtBox.sendKeys(orgName);
		assignToUserCheckBox.click();
		select(assignToDD, userOption);
		QuickCreateSaveBtn.click();
	}

	public void QuickCreateOrganizationAssignToGroup(String module, String orgName, String groupOption) {
		hp.selectFromQuickCreate(module);
		orgNameEdtBox.sendKeys(orgName);
		assignToUserCheckBox.click();
		select(assignToDD, groupOption);
		QuickCreateSaveBtn.click();
	}

	public void deletAllOrganizations() {
		selectAllOrgCheckBox.click();
		orgDeleteBtn.click();
		acceptAlert(BaseClass.driver);
	}

	public int orgTableSize() {
		int tableSize = orgCheckBoxList.size() - 1;
		return tableSize;
	}
}
