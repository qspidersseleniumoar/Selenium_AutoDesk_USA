package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PriceBookInfo {
@FindBy(xpath="//span[@class='lvtHeaderText']")
WebElement verifyText;
public WebElement getVerifiedText(){
	return verifyText;
}
}
