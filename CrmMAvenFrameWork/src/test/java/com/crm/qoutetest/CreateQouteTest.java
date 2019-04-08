package com.crm.qoutetest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.commonLib.BaseClass;
import com.crm.objectRepository.CreateQuote;
import com.crm.objectRepository.Home;
import com.relevantcodes.extentreports.ExtentTest;

/**
 * 
 * @author Hari
 *
 */
@Listeners(com.crm.commonLib.SampleList.class)
public class CreateQouteTest extends BaseClass{
	
	@Test
	public void createQouteTest() throws Throwable{
		
		ExtentTest testing=extent.startTest("createQuoteTest");
		String subject=eLib.getExcelData("quote", 1, 2);
		String billingAddress=eLib.getExcelData("quote", 1, 3);
		String shippingAddress=eLib.getExcelData("quote", 1, 4);
		String quantity=eLib.getExcelData("quote", 1, 5);
		String listPrice=eLib.getExcelData("quote", 1, 6);
		
		Home hp=PageFactory.initElements(driver, Home.class);
		hp.navigateToQuotes();
		
		CreateQuote cqp=PageFactory.initElements(driver, CreateQuote.class);
		cqp.createQuotation(subject, billingAddress, shippingAddress, quantity, listPrice);
		
		String actualdata=cqp.quoteCreated().getText();
		boolean status=actualdata.contains(subject);
		Assert.assertTrue(status);
		
	}

}
