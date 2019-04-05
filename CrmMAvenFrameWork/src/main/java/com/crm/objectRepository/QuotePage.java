package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuotePage {
	
	@FindBy(xpath="//input[@value=' Search Now ']")
	private WebElement quotesearchBtn;

}
