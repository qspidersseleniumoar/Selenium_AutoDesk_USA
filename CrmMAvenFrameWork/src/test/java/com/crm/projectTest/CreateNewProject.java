package com.crm.projectTest;
/**
 * @author SUDEEP
 * CreateNewProject
 */
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.crm.commonLib.BaseClass;
import com.crm.objectRepository.CreateProject;
import com.crm.objectRepository.Home;

import junit.framework.Assert;

public class CreateNewProject extends BaseClass {
	/**
	 * Navigate to more dropdown
	 * navigate to more dropdown and click on Project
	 * click on CreateNewProjects
	 * give data in EditBox
	 * After Entering Data click Save Button
	 * verify Create Projects
	 */
	@Test
	public void createNewProject() {
		String name="railways";
		//Navigate to more dropdown
		Home hp=PageFactory.initElements(driver, Home.class);
		hp.navigateToMore();
		//navigate to more dropdown and click on Project
		CreateProject cp = PageFactory.initElements(driver, CreateProject.class);
		cp.clickOnProject();
		//click on CreateNewProjects
		cp.createNewProjects();
		//give data in EditBox
		cp.editBox(name);
		//After Entering Data click Save Button
		cp.savebtn();
		 
		//verify Create Projects
		String expmsg="railways - Project Information";
		String actmsg=cp.verifyMsg().getText();
		boolean status=actmsg.contains(expmsg);
		Assert.assertTrue(status);
		System.out.println("=====msg verified======");
	}

}
