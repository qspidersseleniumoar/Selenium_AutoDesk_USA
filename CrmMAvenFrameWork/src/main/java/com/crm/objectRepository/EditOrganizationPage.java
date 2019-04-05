package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.commonLib.BaseClass;

public class EditOrganizationPage extends BaseClass {
	
	@FindBy(xpath="//tr[@id='row_3']/child::td[8]/child::a[1]")
    private WebElement Editbtn;
	
	public void navigateToEditOrg() {
		Editbtn.click();
		}
	@FindBy(xpath="//select[@name='industry']")
	private WebElement industryselect;
	
	public void selectindustry(){
		industryselect.click();
	}	
 
  @FindBy(xpath="//tr[@id='row_3']/child::td[3]/child::a[1]")
    private WebElement Textcapture;
   
    public WebElement getTextcapture() {
		return Textcapture;
		}
    @FindBy(xpath="//input[@type='checkbox'and @name='selectall']")
    private WebElement allselect;
    
    	public void  selectall() {
    		allselect.click();
    		
    	}
   @FindBy(xpath="//input[@value='Mass Edit']")
   private WebElement masseditclick;
    public void massclick() {
    	masseditclick.click();
    }
    @FindBy(xpath="//input[@id='phone']")
    private WebElement editphone;
    public void phoneEdit(String pnum) {
    editphone.sendKeys(pnum);
    }
    @FindBy(xpath="//tr[@id='row_3']/child::td[5]/child::a[1]")
    private WebElement website;
    public WebElement getnewwebsite() {
   return website;
    }
    @FindBy(xpath="//input[@name='website']")
    private WebElement websitefield;
    public void editwebsite(String webname) {
    websitefield.sendKeys(webname);
    }
   
    
    }
	
	

