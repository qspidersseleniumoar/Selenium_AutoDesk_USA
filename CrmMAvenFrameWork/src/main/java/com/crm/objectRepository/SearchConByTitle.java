package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SearchConByTitle {
	
@FindBy(xpath="//input[@name='search_text']")
private WebElement searchEditBox;

@FindBy(id="bas_searchfield")
private WebElement ddClick;

@FindBy(name="submit")
private WebElement searchBtn;

@FindBy(xpath="//table[@class='layerPopupTransport']/tbody/tr/td[@class='small']")
private WebElement verifymsg;


public void searchEditBox(String search)
{
	searchEditBox.sendKeys(search);
}

public void selectTitleFromDD()
{
	ddClick.click();
	Select sel=new Select(ddClick);
	sel.selectByVisibleText("Title");
}


public void searchBtn()
{
	searchBtn.click();
	
}
public WebElement verifymsg() {
	return verifymsg;
}
}

