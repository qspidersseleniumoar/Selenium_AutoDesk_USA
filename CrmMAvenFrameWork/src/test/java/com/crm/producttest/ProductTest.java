package com.crm.producttest;
/**
 * 
 * @author Sneha, praveen
 *
 */
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.commonLib.BaseClass;
import com.crm.commonLib.WebDriverCoominLib;
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
		
		@Test
		public void CreateProdWithoutProdName() throws Throwable
		{
			WebDriverCoominLib wLib = new WebDriverCoominLib();
			Home hp = PageFactory.initElements(driver, Home.class);
			ProductCreateNew pp = PageFactory.initElements(driver, ProductCreateNew.class);
			
			/* step1: navigate to product page*/
			hp.navigateToProducts();
			
			/* step2: click on + button*/
			pp.navigatetocreateprdtname();
			
			/* step3: click on save*/
			pp.savebtn();
			
			/* step4: get alert text*/
			String actErrorMsg = wLib.getAlertTest();
			
			/* step5: verify the text*/
			String expRes = eLib.getExcelData("Sheet1", 55, 3);
			String[] arr = expRes.split(":");
			String expErrorMsg = arr[1].trim();
			
			boolean status = actErrorMsg.trim().toLowerCase().contains(expErrorMsg.toLowerCase());
			Assert.assertTrue(status, "Error message does not match");
		}

}

