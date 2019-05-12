package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.commonLib.BaseClass;
import com.crm.commonLib.WebDriverCoominLib;

public class CreateFilter extends BaseClass{
	
	@FindBy(linkText="Create Filter")
	private WebElement creatfillnk;
	
	@FindBy(name="viewName")
	private WebElement viewnamedt;
	
	@FindBy(id="column1")
	private WebElement selectclick1;
	
	@FindBy(id="column5")
	private WebElement selectclick5;
	
	@FindBy(id="column2")
	private WebElement selectclick2;
	
	@FindBy(id="column6")
	private WebElement selectclick6;
	
	@FindBy(id="column3")
	private WebElement selectclick3;
	
	@FindBy(id="column7")
	private WebElement selectclick7;
	
	@FindBy(id="column4")
	private WebElement selectclick4;
	
	@FindBy(id="column8")
	private WebElement selectclick8;

	@FindBy(id="column9")
	private WebElement selectclick9;
	
	@FindBy(name="button2")
	private WebElement savebtn;
	
	@FindBy(name="setStatus")
	private WebElement setstatusaspublicClick;
	
	@FindBy(name="viewname")
	private WebElement viewnamecapt;
	
	public WebElement viewnamecapt(){
		return viewnamecapt;
	}
	
	public void Createfilterobjectrepos(String viewname) {
		creatfillnk.click();
		viewnamedt.sendKeys(viewname);
		WebDriverCoominLib web=new WebDriverCoominLib();
		web.select(selectclick1, 1);
		web.select(selectclick2, 2);
		web.select(selectclick3, 3);
		web.select(selectclick4, 4);
		web.select(selectclick5, 5);
		web.select(selectclick6, 6);
		web.select(selectclick7, 7);
		web.select(selectclick8, 8);
		web.select(selectclick9, 9);
		savebtn.click();
		
	}

	public WebElement getCreatfillnk() {
		return creatfillnk;
	}

	public WebElement getViewnamedt() {
		return viewnamedt;
	}

	public WebElement getSelectclick1() {
		return selectclick1;
	}

	public WebElement getSelectclick5() {
		return selectclick5;
	}

	public WebElement getSelectclick2() {
		return selectclick2;
	}

	public WebElement getSelectclick6() {
		return selectclick6;
	}

	public WebElement getSelectclick3() {
		return selectclick3;
	}

	public WebElement getSelectclick7() {
		return selectclick7;
	}

	public WebElement getSelectclick4() {
		return selectclick4;
	}

	public WebElement getSelectclick8() {
		return selectclick8;
	}

	public WebElement getSelectclick9() {
		return selectclick9;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public WebElement getSetstatusaspublicClick() {
		return setstatusaspublicClick;
	}

	public WebElement getViewnamecapt() {
		return viewnamecapt;
	}

}
