package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.crm.commonLib.BaseClass;
import com.crm.commonLib.WebDriverCoominLib;



 

public class Home extends WebDriverCoominLib{
	@FindBy(xpath="//img[@src='themes/softed/images/Home.PNG']")
	WebElement home;
	@FindBy(linkText="Calendar")
	WebElement Calendar;
	@FindBy(linkText="Leads")
	WebElement Leads;               	 		 		 	 		 		 		
	@FindBy(linkText="Contacts")
	WebElement Contacts;
	@FindBy(linkText="Opportunities")
	WebElement Opportunities;
	@FindBy(linkText="Products")
	WebElement Products;
	@FindBy(linkText="Organizations")
	WebElement Organizations;
	@FindBy(linkText="Email")
	WebElement Email;
	@FindBy(linkText="Trouble Tickets")
	WebElement Trouble_Tickets;
	@FindBy(linkText="Dashboard")
	WebElement Dashboard;
	@FindBy(linkText="More")
	WebElement More;
	@FindBy(xpath="//img[@title='Chat...']")
	WebElement chat;
	@FindBy(linkText="Campaigns")
	WebElement Campaigns;
	@FindBy(linkText="Reports")
	WebElement Reports;
	@FindBy(linkText="SMSNotifier")
	WebElement SMSNotifier;
	@FindBy(linkText="Comments")
	WebElement Comments;
	@FindBy(linkText="Quotes")
	WebElement Quotes;
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	WebElement admin;
	@FindBy(linkText="Sign Out")
	WebElement Sign_Out;
	@FindBy(xpath="//img[@src='themes/softed/images/info.PNG']")
	WebElement info_img;
	@FindBy(linkText="My_Preferences")
	WebElement My_Preferences;
	@FindBy(linkText="Help")
	WebElement Help;
	@FindBy(linkText="CRM Settings")
	WebElement CRM_Settings;
	@FindBy(xpath="//img[@src='themes/softed/images/mainSettings.PNG']")
	WebElement setting_img;
	@FindBy(name="Purchase Order")
	WebElement purchaseOrder;

	
	public void navigateTohome(){
		waitAndClick(home);

	}
	public void navigateToCalendar(){  
		waitAndClick(Calendar);

	
	}
	public void navigateToLeads(){
		waitAndClick(Leads);

	}
	public void navigateToOrganizations(){ 
		waitAndClick(Organizations);
	}
	public void navigateToContacts(){
		waitAndClick(Contacts);

	}
	public void navigateToOpportunities(){
		waitAndClick(home);

	}
	public void navigateToProducts(){
		waitAndClick(Products);

	}
	 
	public void navigateToEmail(){
		waitAndClick(Email);

	}
	public void navigateToDashboard(){
		waitAndClick(Dashboard);

	}
	public void navigateToMore(){
		mouseMovement(More);
	 }
	public void navigateToCampaign(){

		mouseMovement(More);
			waitAndClick(Campaigns);

	} 
	public void navigateToReports(){
		waitAndClick(Reports);

	}
	public void navigateToSMSNotifier(){
		waitAndClick(SMSNotifier);

	}
	public void navigateToComments(){
		waitAndClick(Comments);

	}
	public void navigateToQuotes(){
		waitAndClick(Quotes);

		Quotes.click();
		}
	 
	public void signOut(){
		waitAndClick(home);
		mouseMovement(admin);
		waitAndClick(Sign_Out);
		}
	public void My_Preferences(){

		mouseMovement(admin);
		waitAndClick(My_Preferences);
		}
	 
	public void Help(){

		mouseMovement(info_img);
		waitAndClick(Help);
		}
	public void CRM_Settings(){

		
		mouseMovement(setting_img);
		waitAndClick(CRM_Settings);
		}
	
	public void navigateToPurchaseOrder(){

		mouseMovement(More);
			waitAndClick(purchaseOrder);

	} 

	 }
