package com.crm.quotesTest;

import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.commonLib.BaseClass;
import com.crm.objectRepository.Home;
import com.crm.objectRepository.QuotePage;
import com.crm.objectRepository.QuotesEdit;
/**
 * 
 * @author safwana
 *
 */

public class Modify_Quotes_Edit_Filter_Without_SubjectColumn extends BaseClass {
	@Test
	public void modify()
	{
	    
		Home hp=PageFactory.initElements(driver, Home.class);
		hp.navigateToMore();
		/*navigate to Quotes*/
		hp.navigateToQuotes();
		QuotePage qp=PageFactory.initElements(driver, QuotePage.class);
		/*select quotes from the dropdown*/
		qp.selectQuotes();
		/*clink on edit button*/
		qp.clickOnEdit();
		QuotesEdit qet=PageFactory.initElements(driver, QuotesEdit.class);
		qet.selectNone();
		qet.ClickOnSave();
		Alert at = driver.switchTo().alert();
		String actmesg = at.getText();
        /*compare the actual msg withla expected message*/
		System.out.println(actmesg);
		String expmsg = "Must have one Required field to be selected";
		boolean status = actmesg.toLowerCase().contains(expmsg.toLowerCase());
		SoftAssert s=new SoftAssert();
		s.assertTrue(status, "Fail");
		at.accept();

	}

}
