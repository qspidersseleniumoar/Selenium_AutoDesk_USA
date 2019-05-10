package com.crm.invoiceTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.crm.commonLib.BaseClass;
import com.crm.objectRepository.Home;
import com.crm.objectRepository.QuotePage;

public class QuotesTrashTest extends BaseClass {
	@Test
	public void DeleteTest() {

		/* navigate to quotes page */

		Home home = PageFactory.initElements(driver, Home.class);
		home.navigateToQuotes();

		QuotePage quo = PageFactory.initElements(driver, QuotePage.class);
	
	}

}
