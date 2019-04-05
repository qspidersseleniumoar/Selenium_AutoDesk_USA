package com.crm.productTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.commonLib.BaseClass;
import com.crm.commonLib.FileLib;
import com.crm.objectRepository.CreateFilter;
import com.crm.objectRepository.Home;


@Listeners(com.crm.commonLib.SampleList.class)
public class CreateFilterProduct extends BaseClass{
   /*
    * author kishan
    * parameters create filter by specified name as provided
    * throws throwable
    */
	@Test
	public void Createfilterproduct() throws Throwable {
		FileLib excel=new FileLib();
		String viewname1=excel.getExcelData("products", 6, 0);
		/*navigate to home page and navigate to products*/
		Home home = PageFactory.initElements(driver, Home.class);
		home.navigateToProducts();
		/*navigate to product page and enter fields*/
		CreateFilter cf=PageFactory.initElements(driver, CreateFilter.class);
		cf.Createfilterobjectrepos(viewname1);
		/*verify create filter*/
		 cf.viewnamecapt().click();
		String actdata=cf.viewnamecapt().getText();
		boolean status=actdata.contains(viewname1);
		Assert.assertEquals(status, true);		
	}
	
}
