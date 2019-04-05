package com.crm.productTest;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.crm.commonLib.BaseClass;
import com.crm.objectRepository.Home;
import com.crm.objectRepository.ProductDelete;

@Listeners(com.crm.commonLib.SampleList.class)
 /*
 * author prashant
 * product mass delete
 */

public class MassDelete extends BaseClass{
	
	/*
	 * MassDelete
	 * 1. Navigate to product module
	 * 2. click on select all
	 * 3. click on delete button
	 * 4. click OK on alert popup 
	 */

	@Test
	public void massDelete() throws Throwable {
		/*navigate to products*/
		
		Home hp=PageFactory.initElements(driver, Home.class);
		hp.navigateToProducts();
		
		/*perform mass delete operation in products*/
		
		ProductDelete pd =PageFactory.initElements(driver, ProductDelete.class);
		pd.selectcheckbox();
		pd.delete();
		pd.switchToAlert();
		
		/*verify mass delete product*/
		
		String actmsg=pd.verifymsg().getText();
		boolean status=actmsg.contains(actmsg);
		Assert.assertEquals(status, true) ;
		
	}
	

}
