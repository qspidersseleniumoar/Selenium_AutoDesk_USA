package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.commonLib.WebDriverCoominLib;

public class Home extends WebDriverCoominLib {
	@FindBy(xpath = "//img[@src='themes/softed/images/Home.PNG']")
	WebElement home;
	@FindBy(linkText = "Calendar")
	WebElement Calendar;
	@FindBy(linkText = "Leads")
	WebElement Leads;
	@FindBy(linkText = "Contacts")
	WebElement Contacts;
	@FindBy(linkText = "Opportunities")
	WebElement Opportunities;
	@FindBy(linkText = "Products")
	WebElement Products;
	@FindBy(linkText = "Organizations")
	WebElement Organizations;
	@FindBy(linkText = "Email")
	WebElement Email;
	@FindBy(linkText = "Trouble Tickets")
	WebElement Trouble_Tickets;
	@FindBy(linkText = "Dashboard")
	WebElement Dashboard;
	@FindBy(linkText = "More")
	WebElement More;
	@FindBy(xpath = "//img[@title='Chat...']")
	WebElement chat;
	@FindBy(linkText = "Campaigns")
	WebElement Campaigns;
	@FindBy(linkText = "Reports")
	WebElement Reports;
	@FindBy(linkText = "SMSNotifier")
	WebElement SMSNotifier;
	@FindBy(linkText = "Comments")
	WebElement Comments;
	@FindBy(linkText = "Quotes")
	WebElement Quotes;
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	WebElement admin;
	/* --------------------- */
	@FindBy(linkText = "CRM Settings")
	WebElement crmSettingLnk;

	@FindBy(xpath = "//img[contains(@src,'mainSettings.PNG')]")
	WebElement settingImg;
	/*----------------------*/
	@FindBy(linkText = "Sign Out")
	WebElement Sign_Out;
	@FindBy(xpath = "//img[@src='themes/softed/images/info.PNG']")
	WebElement info_img;
	@FindBy(linkText = "My_Preferences")
	WebElement My_Preferences;
	@FindBy(linkText = "Help")
	WebElement Help;
	@FindBy(linkText = "CRM Settings")
	WebElement CRM_Settings;
	@FindBy(xpath = "//img[@src='themes/softed/images/mainSettings.PNG']")
	WebElement setting_img;
	@FindBy(name = "Purchase Order")
	WebElement purchaseOrder;
	@FindBy(name = "Vendors")
	WebElement vendor;

	public void navigateTohome() {
		waitAndClick(home);

	}

	public void navigateToCalendar() {
		waitAndClick(Calendar);

	}

	public void navigateToLeads() {
		waitAndClick(Leads);

	}

	public void navigateToOrganizations() {
		Organizations.click();
	}

	public void navigateToContacts() {
		waitAndClick(Contacts);

	}

	public void navigateToOpportunities() {
		waitAndClick(home);

	}

	public void navigateToProducts() {
		// mouseMovement(More);
		waitAndClick(Products);

	}

	public void navigateToEmail() {
		waitAndClick(Email);

	}

	public void navigateToDashboard() {
		waitAndClick(Dashboard);

	}

	public void navigateToMore() {
		mouseMovement(More);
	}

	public void navigateToCampaign() {

		mouseMovement(More);
		waitAndClick(Campaigns);

	}

	public void navigateToReports() {
		waitAndClick(Reports);

	}

	public void navigateToSMSNotifier() {
		waitAndClick(SMSNotifier);

	}

	public void navigateToComments() {
		waitAndClick(Comments);

	}

	public void navigateToQuotes() {
		mouseMovement(More);
		waitAndClick(Quotes);
	}

	public void signOut() {
		waitAndClick(home);
		mouseMovement(admin);
		waitAndClick(Sign_Out);
	}

	public void My_Preferences() {

		mouseMovement(admin);
		waitAndClick(My_Preferences);
	}

	public void Help() {

		mouseMovement(info_img);
		waitAndClick(Help);
	}

	public void CRM_Settings() {

		mouseMovement(setting_img);
		waitAndClick(CRM_Settings);
	}

	public void navigateToPurchaseOrder() {

		mouseMovement(More);
		waitAndClick(purchaseOrder);

	}

	public void navigateToVender() {

		mouseMovement(More);
		waitAndClick(vendor);

	}

	public void navigateToUserPage() {

	}

	public void navigateToPrice() {
	}

	public void MoveToSettingImg(WebDriverCoominLib wlib) throws Throwable {
		wlib.mouseMovement(settingImg);

	}

	public void clickOnSettingImg(WebDriverCoominLib wlib) throws Throwable {
		crmSettingLnk.click();

	}

	/**
	 * added by praveen
	 */

	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement profileIcon;
	@FindBy(linkText = "Sign Out")
	private WebElement signOutLnk;
	@FindBy(xpath = "//table[@class='small']/tbody/tr/td[@align='right' and @class='small']/table/tbody/tr/td/img[@src='themes/softed/images/mainSettings.PNG']")
	private WebElement settingsIcon;
	@FindBy(xpath = "//div[@id='mainsettings']")
	private WebElement crmSettingsLnk;
	@FindBy(xpath = "//table[@class='hdrTabBg']/tbody/tr/td[@class='tabUnSelected']/a")
	private WebElement homeIcon;
	@FindBy(xpath = "//table[@class='hdrTabBg']/tbody/tr/td[@class='small']/table/tbody/tr/td[*]/a[contains(text(),'Calendar')]")
	private WebElement calendarLnk;
	@FindBy(xpath = "//table[@class='hdrTabBg']/tbody/tr/td[@class='small']/table/tbody/tr/td[*]/a[contains(text(),'Leads')]")
	private WebElement leadsLnk;
	@FindBy(xpath = "//table[@class='hdrTabBg']/tbody/tr/td[@class='small']/table/tbody/tr/td[*]/a[contains(text(),'Organizations')]")
	private WebElement organizationsLnk;
	@FindBy(xpath = "//table[@class='hdrTabBg']/tbody/tr/td[@class='small']/table/tbody/tr/td[*]/a[contains(text(),'Contacts')]")
	private WebElement contactsLnk;
	@FindBy(xpath = "//table[@class='hdrTabBg']/tbody/tr/td[@class='small']/table/tbody/tr/td[*]/a[contains(text(),'Opportunities')]")
	private WebElement opportunitiesLnk;
	@FindBy(xpath = "//table[@class='hdrTabBg']/tbody/tr/td[@class='small']/table/tbody/tr/td[*]/a[contains(text(),'Products')]")
	private WebElement productsLnk;
	@FindBy(xpath = "//table[@class='hdrTabBg']/tbody/tr/td[@class='small']/table/tbody/tr/td[*]/a[contains(text(),'Documents')]")
	private WebElement documentsLnk;
	@FindBy(xpath = "//table[@class='hdrTabBg']/tbody/tr/td[@class='small']/table/tbody/tr/td[*]/a[contains(text(),'Email')]")
	private WebElement emailLnk;
	@FindBy(xpath = "//table[@class='hdrTabBg']/tbody/tr/td[@class='small']/table/tbody/tr/td[*]/a[contains(text(),'Trouble Tickets')]")
	private WebElement troubleTicketsLnk;
	@FindBy(xpath = "//table[@class='hdrTabBg']/tbody/tr/td[@class='small']/table/tbody/tr/td[*]/a[contains(text(),'Dashboard')]")
	private WebElement dashboardLnk;
	@FindBy(xpath = "//table[@class='hdrTabBg']/tbody/tr/td[@class='small']/table/tbody/tr/td[*]/a[contains(text(),'More')]")
	private WebElement moreHdrLnk;
	@FindBy(id = "qccombo")
	private WebElement quickCreateDD;
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement plusBtn;

	public void logout() {
		mouseMovement(profileIcon);
		mouseMovement(signOutLnk);
		waitAndClick(signOutLnk);
	}

	public void clickOnCalendarTab() {
		mouseMovement(calendarLnk);
		waitAndClick(calendarLnk);
	}

	public void clickOnLeadsTab() {
		mouseMovement(leadsLnk);
		waitAndClick(leadsLnk);
	}

	public void clickOnOrganizationsTab() {
		mouseMovement(organizationsLnk);
		waitAndClick(organizationsLnk);
	}

	public void clickOnContactsTab() {
		mouseMovement(contactsLnk);
		waitAndClick(contactsLnk);
	}

	public void clickOnOpportunitiesTab() {
		mouseMovement(opportunitiesLnk);
		waitAndClick(opportunitiesLnk);
	}

	public void clickOnProductsTab() {
		mouseMovement(productsLnk);
		waitAndClick(productsLnk);
	}

	public void clickDocumentsTab() {
		mouseMovement(documentsLnk);
		documentsLnk.click();
	}

	public void clickOnEmailTab() {
		mouseMovement(emailLnk);
		emailLnk.click();
	}

	public void clickOnTroubleTicketsTab() {
		mouseMovement(troubleTicketsLnk);
		troubleTicketsLnk.click();
	}

	public void clickOnDashboardTab() {
		mouseMovement(dashboardLnk);
		dashboardLnk.click();
	}

	public void clickOnMoreTab() {
		mouseMovement(moreHdrLnk);
		moreHdrLnk.click();
	}

	public void selectFromQuickCreate(String option) {
		select(quickCreateDD, option);
	}

	public void navigateToSettigsPage() {
		mouseMovement(settingsIcon);
		mouseMovement(crmSettingsLnk);
		crmSettingsLnk.click();
	}

	public void navigateToHomePage() {
		mouseMovement(homeIcon);
		waitAndClick(homeIcon);
	}

	public void clickOnPlusBtn() {
		waitAndClick(plusBtn);
	}
	
	public void navigateToQuotesPage()
	{
		mouseMovement(moreHdrLnk);
		waitAndClick(Quotes);
	}

}
