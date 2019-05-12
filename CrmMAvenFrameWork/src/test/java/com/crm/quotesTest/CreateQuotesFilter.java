package com.crm.quotesTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.commonLib.BaseClass;
import com.crm.objectRepository.CreateFilter;
import com.crm.objectRepository.Home;

public class CreateQuotesFilter extends BaseClass {
	@Test
	public void createQuoteFilterWithoutSubjectColumn() {
		/* step1: navigate to quotes page */
		Home hp = PageFactory.initElements(driver, Home.class);
		hp.navigateToQuotesPage();
		/* step2: click on create filter */
		CreateFilter cf = PageFactory.initElements(driver, CreateFilter.class);
		wlib.waitAndClick(cf.getCreatfillnk());
		/* step3: Enter view name */
		cf.getViewnamedt().sendKeys("testFilter");
		wlib.selectAdvanced(cf.getSelectclick1(), "none");
		wlib.waitAndClick(cf.getSavebtn());
		/* step4: check if created filter is available in Filter options */
		boolean status = wlib.checkForOptionPresence(cf.getViewnamecapt(), "testfilter");
		Assert.assertTrue(status, "no such option found");

	}

}
