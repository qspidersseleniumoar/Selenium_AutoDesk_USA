package com.crm.productTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.commonLib.BaseClass;
import com.crm.commonLib.FileLib;
import com.crm.objectRepository.Home;
import com.crm.objectRepository.ProductCreateNew;

@Listeners(com.crm.commonLib.SampleList.class)
public class ProductTest extends BaseClass{
	
	@Test
	public void createprouct() throws Throwable {
		FileLib excel = new FileLib();
		String productname=excel.getExcelData("products", 1, 0);
		String productnum=excel.getExcelData("products", 1, 1);
		/*navigate to home page and navigate to products*/
		Home home = PageFactory.initElements(driver, Home.class);
		home.navigateToProducts();
		/*navigate to product page and enter fields*/
		ProductCreateNew pr=PageFactory.initElements(driver, ProductCreateNew.class);
		pr.navigatetocreateprdtname();
		pr.enterproductnumberedt(productnum);
		pr.enterprdtname(productname);
		pr.savebtn();
		String actutalproctname=pr.productnamedetail().getText();
		  System.out.println(actutalproctname);
		  boolean stat = actutalproctname.contains(productname);
		  Assert.assertEquals(stat, true);
	}

}
