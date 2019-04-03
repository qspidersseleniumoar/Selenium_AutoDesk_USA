package com.crm.potest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.commonLib.BaseClass;
import com.crm.commonLib.FileLib;
import com.crm.objectRepository.CreatePurchaseOrderPage;
import com.crm.objectRepository.Home;
import com.crm.objectRepository.PurchaseOrderInformationPage;
import com.crm.objectRepository.PurchaseOrderPage;import com.sun.accessibility.internal.resources.accessibility;

public class CreatePOTest extends BaseClass{
	/**
	 *  @author PrathijnaRaoK
	 *  Testcase to create purchase order with mandatoryfields
	 * @throws Throwable
	 */	
	
	@Test
	public void createPurchaseOrdertest() throws Throwable{
		FileLib elib = new FileLib();
		String sub=elib.getExcelData("createPO",1,2);
		String vendor=elib.getExcelData("createPO",1,3);
		String billingAddress=elib.getExcelData("createPO",1,4);
		String shippingAddress=elib.getExcelData("createPO",1,5);
		String qty=elib.getExcelData("createPO",1,7);
		String price=elib.getExcelData("createPO",1,8);
		
		Home hp=PageFactory.initElements(driver, Home.class);
		hp.navigateToMore();
		hp.navigateToPurchaseOrder();
		PurchaseOrderPage pop=PageFactory.initElements(driver, PurchaseOrderPage.class);
		pop.navigateToCreatePo();
		CreatePurchaseOrderPage cpop=PageFactory.initElements(driver, CreatePurchaseOrderPage.class);
		cpop.createPo(sub, billingAddress, qty, price);
		
		PurchaseOrderInformationPage poip=PageFactory.initElements(driver, PurchaseOrderInformationPage.class);
		String actmsg=poip.getsuccessmsg().getText();
		String expmsg=elib.getExcelData("createPO",1,9);
		System.out.println("actmsg---"+ actmsg);
		System.out.println("expmsg---"+ expmsg);
		
		boolean status=actmsg.contains(expmsg);
		System.out.println(status);
		Assert.assertTrue(status);
		
	}
	
	

}
