package com.crm.productTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.crm.commonLib.BaseClass;
import com.crm.commonLib.FileLib;
import com.crm.objectRepository.Home;
import com.crm.objectRepository.ProductCreateNew;
import com.crm.objectRepository.ProductDelete;

public class CreateAndDeleteProductTest extends BaseClass {

	@Test
	public void CreDelTest() throws Throwable {

		FileLib flib = new FileLib();
		String creat = flib.getExcelData("campaign", 1, 1);

		/* navigate to product page */

		Home home = PageFactory.initElements(driver, Home.class);
		home.navigateToProducts();

		/* create new product */

		ProductCreateNew pcn = PageFactory.initElements(driver, ProductCreateNew.class);
		pcn.navigatetocreateprdtname();

		pcn.enterprdtname(creat);
		pcn.savebtn();

		Thread.sleep(8000);

		/* navigate back to product page */

		/*
		 * ProductDelete hom=PageFactory.initElements(driver, ProductDelete.class);
		 * hom.ProductsLink();
		 * 
		 * 
		 * 
		 * Delete created product
		 * 
		 * ProductDelete del = PageFactory.initElements(driver, ProductDelete.class);
		 * del.SingleDele();
		 */

	}
}
