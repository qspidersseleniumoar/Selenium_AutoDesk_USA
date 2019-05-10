package com.crm.leadsTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.commonLib.BaseClass;
import com.crm.objectRepository.Home;
import com.crm.objectRepository.MassDeleteProjectas;

public class LeadsDeleteTest extends BaseClass {
	@Test
	public void DeletTest() {

		/* navigate to Leads page */

		Home home = PageFactory.initElements(driver, Home.class);
		home.navigateToLeads();

		/* click on delete all check box */

		MassDeleteProjectas mass = PageFactory.initElements(driver, MassDeleteProjectas.class);
		mass.clickonchkbox();

		/* delete all the details */

		mass.clickonDelete();

		/* alert handle */

		Alert at = driver.switchTo().alert();
		String Actulmas = at.getText();

		System.out.println(Actulmas);

		String expMsg = "Are you sure you want to delete the selected 1 records?";

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(Actulmas, expMsg);
		at.dismiss();
		sa.assertAll();

	}

}
