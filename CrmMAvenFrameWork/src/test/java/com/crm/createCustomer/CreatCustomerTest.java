package com.crm.createCustomer;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.commonLib.BaseClass;
import com.crm.commonLib.FileLib;
import com.crm.objectRepository.CreatCustomer;
import com.crm.objectRepository.Home;

public class CreatCustomerTest extends BaseClass{
@Test
public void creatCustomer() throws Throwable{
	FileLib excel = new FileLib();
	String username=excel.getExcelData("Sheet2", 0, 1);
	String password= excel.getExcelData("Sheet2", 1, 1);
	String confpassword= excel.getExcelData("Sheet2", 2, 1);
	String email= excel.getExcelData("Sheet2", 3, 1);
	String lastname= excel.getExcelData("Sheet2", 4, 1);
	Home home = PageFactory.initElements(driver, Home.class);
	home.CRM_Settings();
	CreatCustomer cc=PageFactory.initElements(driver, CreatCustomer.class);
	cc.navigateToUser();
	cc.navigateToNewUser();
	cc.editCustomerName(username);
	cc.editPassword(password);
	cc.editConfPassword(confpassword);
	cc.editEmail(email);
	cc.lastName(lastname);
	cc.lookup();
    cc.getSaveBtn();
	String actMsg= cc.getCptrmsg().getText();
	String expMsg = "Showing Recor";
    boolean status=actMsg.contains(expMsg);
    Assert.assertTrue(status);
   System.out.println("=======Verify Msg ============");
}
}