package com.crm.projectTest;
/**
 * @author SUDEEP
 * MassDelete
 */

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.commonLib.BaseClass;
import com.crm.objectRepository.Home;
import com.crm.objectRepository.MassDeleteProjectas;

public class MassDeleteProjectsClass extends BaseClass {
	/**
	 * Navigate to more dropdown
	 * go to more and click on Project
	 * click on Checkbox
	 * click on Delete
	 * Handle Alert
	 * verify Mass Delete msg
	 */
	@Test
	public void massDeleteProjects() {
		//navigate to more Dropdown
		Home hp=PageFactory.initElements(driver, Home.class);
		hp.navigateToMore();
		MassDeleteProjectas mdp = PageFactory.initElements(driver, MassDeleteProjectas.class);
		//go to more and click on Project
		mdp.clickOnProject();
		//click on Checkbox
		mdp.clickonchkbox();
		//click on Delete
		mdp.clickonDelete();
		//Handle Alert
		mdp.switchToAlert();
		//verify Mass Delete msg
		String expmsg="No Project Found !";
	    String actmsg=mdp.verifymsg().getText();
	    boolean status =actmsg.contains(expmsg);
		Assert.assertTrue(status);
		System.out.println("=====msg bverified=====");
	}
	

}
