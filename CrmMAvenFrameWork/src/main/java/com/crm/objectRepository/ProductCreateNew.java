package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.commonLib.BaseClass;

public class ProductCreateNew extends BaseClass {
	 @FindBy(xpath="//img[@alt='Create Product...']")
	    private WebElement Createbtn;
	    
	    @FindBy(name="productname")
	    private WebElement productnameedt;
	    
	    @FindBy(id="productcode")
	    private WebElement productnumberedt;
	    
	    @FindBy(xpath="//img[@alt='Select']")
	    private WebElement vendornameclick;
	    

	    @FindBy(xpath="//input[@value='  Save  ']")
	    private WebElement savebtn;
	    
	    @FindBy(xpath="//span[@class='lvtHeaderText']")
	    private WebElement productnamedetail;
	    
	    public void navigatetocreateprdtname() {
	    	 Createbtn.click();
	    }
	    public void enterprdtname(String producname) {
	    	productnameedt.sendKeys(producname);
	   }
	    
	    public void enterproductnumberedt(String productnumber) {
	    	productnumberedt.sendKeys(productnumber);
	    }
	    public void savebtn() {
	    	savebtn.click();
	   }
	    public WebElement productnamedetail() {
	    return	productnamedetail;
	   }
	    public void vendornameclick() {
	    	vendornameclick.click();
			
	    }
	   
}
