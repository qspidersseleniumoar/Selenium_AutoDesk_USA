package com.crm.producttest;
/**
 * 
 * @author Sneha
 *
 */
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.commonLib.BaseClass;
import com.crm.objectRepository.Home;
import com.crm.objectRepository.ProductCreateNew;

public class ProductTest extends BaseClass {
	

		@Test
		public void createProductAndVerify() throws Throwable {
			String prodName = eLib.getExcelData("Sneha", 0, 1);
			Home hm = PageFactory.initElements(driver, Home.class);
			ProductCreateNew prodCrt = PageFactory.initElements(driver, ProductCreateNew.class);
			/*navigate to product*/
			hm.navigateToProducts();
			prodCrt.navigatetocreateprdtname();
			prodCrt.enterprdtname(prodName);
			prodCrt.savebtn();
			/*verify Product added or not*/			
			String expmsg="Product Information";
			String actmsg=prodCrt.productnamedetail().getText();
			boolean status=actmsg.contains(expmsg);
			//Assert.assertTrue(status);
			SoftAssert sa = new SoftAssert();
			sa.assertTrue(status, actmsg);
			sa.assertAll();
			System.out.println("=====msg verified======");
			
		
		}

}

