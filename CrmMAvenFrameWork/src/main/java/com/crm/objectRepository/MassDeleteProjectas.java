package com.crm.objectRepository;
/**
 * @author SUDEEP
 * MassDeleteProjects ObjRepository
 */

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.commonLib.WebDriverCoominLib;

public class MassDeleteProjectas extends WebDriverCoominLib {
	
	@FindBy(xpath="//a[@name='Projects']")
	private WebElement clkonprojects;
	
	@FindBy(id="selectCurrentPageRec")
	private WebElement checkBox;
	
	@FindBy(xpath="//input[@value='Delete']")
	private WebElement Delete;
	
	@FindBy(xpath="//span[@class='genHeaderSmall']")
	private WebElement verifymsg;
	
	public void clickOnProject() {
		waitForElemetPresent(clkonprojects);
	}
	public void clickonchkbox() {
		checkBox.click();
	}
	public void clickonDelete() {
		Delete.click();
	}
	public WebElement verifymsg() {
		return verifymsg;
	}

}
