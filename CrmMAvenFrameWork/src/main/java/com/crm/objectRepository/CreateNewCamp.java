package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateNewCamp {
		
	@FindBy(name="campaignname")
	WebElement campname;
	@FindBy(xpath="//input[@value='  Save  ']")
	WebElement saveCamp;
	@FindBy(xpath="//select[@name='campaigntype']")
	WebElement camptype;
	
	
	public void createCamp(String campName)
	{
		campname.sendKeys(campName);
		saveCamp.click();
	}
	
	public void createCamp(String campName,String campType)
	{
		campname.sendKeys(campName);
		Select se = new Select(camptype); 
		se.selectByVisibleText(campType);
		saveCamp.click();
	}
	@FindBy(id="sponsor")
	WebElement nameSponser;
	
	public void sponserTest()
	{
		nameSponser.sendKeys("sponser1");
	}
	
	@FindBy(name="budgetcost")
	WebElement budgetCost;
	
	public void budgetTest()
	{
		budgetCost.sendKeys("400");
	}
	
	@FindBy(name="actualcost")
	WebElement actualCost;
	
	public void actualCostTest()
	{
		actualCost.sendKeys("500");
	}
	
	@FindBy(id="targetaudience")
	WebElement targetAud;
	
	public void targerAudTest()
	{
		targetAud.sendKeys("10000");
	}
	
	
	@FindBy(name="numsent")
	WebElement numSent;
	
	public void numSentvalueTest(){
		numSent.sendKeys("50");;
	}
	
	@FindBy(name="targetsize")
	WebElement targetSize;
	
	public void targetSizeTest()
	{
		targetSize.sendKeys("100");;
	}
	
	@FindBy(name="expectedrevenue")
	WebElement expRevenue;
	
	public void expectedRevenueTest()
	{
		expRevenue.sendKeys("500000");;
	}
	
	@FindBy(name="expectedsalescount")
	WebElement expSaleCount;
	
	public void expectedsalescountTest()
	{
		expSaleCount.sendKeys("10");;
	}
	
	@FindBy(name="actualsalescount")
	WebElement actSaleCount;
	
	public void actualsalescountTest()
	{
		actSaleCount.sendKeys("15");;
	}
	
	@FindBy(name="expectedresponsecount")
	WebElement expResponse;
	
	public void expectedresponsecountTest()
	{
		expResponse.sendKeys("1500");;
	}
	
	@FindBy(name="actualresponsecount")
	WebElement actResponse;
	
	public void actualresponsecountTest()
	{
		actResponse.sendKeys("1800");;
	}
	
	@FindBy(name="expectedroi")
	WebElement expRoi;
	
	public void expectedroiTest()
	{
		expRoi.sendKeys("2500");;
	}
	
	@FindBy(name="actualroi")
	WebElement actRoi;
	
	public void actualroiTest()
	{
		actRoi.sendKeys("2200");;
	}
	
	@FindBy(name="description")
	WebElement describeCamp;
	
	public void descrCampTest()
	{
		describeCamp.sendKeys("creating a new campaign");;
	}

	
	
	public void saveCampaignTest()
	{
		saveCamp.click();
	}
	
}
