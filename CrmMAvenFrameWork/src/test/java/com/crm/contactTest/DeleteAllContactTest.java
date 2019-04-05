package com.crm.contactTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.commonLib.BaseClass;
import com.crm.commonLib.FileLib;
import com.crm.objectRepository.DeleteContact;
import com.crm.objectRepository.Home;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


/**
 * 
 * @author smita sahoo
 *
 */
public class DeleteAllContactTest extends BaseClass {
    @Test
    public void deleteContact() throws Throwable{
    	
    	ExtentTest testlog  = extent.startTest("DeleteAllCSontactTest");
    	testlog.log(LogStatus.INFO, "LOGIN is success");
    	
    	
    	
    	//FileLib excel= new FileLib();
    	//String firstName  = excel.getExcelData("contact", 1, 2);
    	
    	testlog.log(LogStatus.INFO, "navigate to contact");
    	
    	Home home = PageFactory.initElements(driver, Home.class);
    	home.navigateToContacts(); 
       
        
    	
    	testlog.log(LogStatus.INFO, "delete all contact");
        DeleteContact dc = PageFactory.initElements(driver, DeleteContact.class);
        dc.delmtp();
        
        String actMsg = dc.checkStatus();
        String expMSg = "Are you sure you want ";
        boolean status = actMsg.contains(expMSg);
        Assert.assertTrue(status);
        testlog.log(LogStatus.INFO, "LOGOUT TO APP");
    	extent.endTest(testlog);
        

}
}


