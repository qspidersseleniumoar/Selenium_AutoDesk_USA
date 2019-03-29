package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	@FindBy(name="user_name")
	WebElement usernameEdit;
	@FindBy(name="user_password")
	WebElement passwordEdt;
	@FindBy(id="submitButton")
	WebElement loginBtn;
	public void login(String username,String password)
	{
		usernameEdit.sendKeys(username);
		passwordEdt.sendKeys(password);
		loginBtn.click();
	
	}

}
