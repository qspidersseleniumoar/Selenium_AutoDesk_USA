package com.crm.objectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.commonLib.WebDriverCoominLib;

public class SharingAccess {
	WebDriverCoominLib wLib = new WebDriverCoominLib();
	@FindBy(xpath = "//div[@id='customdiv']/table[2]/tbody/tr/td[2]/input[@value='Add Privileges']")
	private WebElement addPrivLeadsBtn;

	@FindBy(id = "Leads_share")
	private WebElement leadsOfDD;

	@FindBy(id = "Leads_access")
	private WebElement leadsAccessedByDD;

	@FindBy(name = "add")
	private WebElement leadsAddBtn;

	@FindBy(id = "share_memberType")
	private WebElement permissionsDD;

	@FindBy(xpath = "//div[@id='customdiv']/table[@class='listTable'][1]/tbody/tr[*]/td[1]")
	private List<WebElement> leadsTableRuleColumn;

	@FindBy(xpath = "//div[@id='customdiv']/table[@class='listTable'][1]/tbody/tr[*]/td[2]")
	private List<WebElement> leadsTableLeadsOfColumn;

	@FindBy(xpath = "//div[@id='customdiv']/table[@class='listTable'][1]/tbody/tr[*]/td[3]")
	private List<WebElement> leadsTableAccessedByColumn;

	@FindBy(xpath = "//div[@id='customdiv']/table[@class='listTable'][1]/tbody/tr[*]/td[4]")
	private List<WebElement> leadsPermissionsColumn;

	@FindBy(xpath = "//div[@id='customdiv']/table[@class='listTable'][1]/tbody/tr[*]/td[5]/a[1]")
	private List<WebElement> leadsRuleEditLnksColumn;

	@FindBy(xpath = "//div[@id='customdiv']/table[@class='listTable'][1]/tbody/tr[*]/td[5]/a[2]")
	private List<WebElement> leadsRuleDelColumn;

	public List<WebElement> getLeadsTableRuleColumn() {
		return leadsTableRuleColumn;
	}

	public List<WebElement> getLeadsTableLeadsOfColumn() {
		return leadsTableLeadsOfColumn;
	}

	public List<WebElement> getLeadsTableAccessedByColumn() {
		return leadsTableAccessedByColumn;
	}

	public List<WebElement> getLeadsPermissionsColumn() {
		return leadsPermissionsColumn;
	}

	public List<WebElement> getLeadsRuleEditLnksColumn() {
		return leadsRuleEditLnksColumn;
	}

	public List<WebElement> getLeadsRuleDelColumn() {
		return leadsRuleDelColumn;
	}

	public void selectLeadsOf(String option) {
		wLib.select(leadsOfDD, option);
	}

	public void selectLeadsAccessedBy(String option) {
		wLib.select(leadsAccessedByDD, option);
	}

	public void selectLeadsPermissions(String option) {
		wLib.select(permissionsDD, option);
	}

	public int tableSize() {
		int tableSize = leadsTableRuleColumn.size();
		return tableSize - 1;
	}

	public WebElement getLeadsAddBtn() {
		return leadsAddBtn;
	}

	public WebElement getAddPrivLeadsBtn() {
		return addPrivLeadsBtn;
	}

}
