package com.crm.commonLib;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.internal.thread.ThreadExecutionException;

import bsh.commands.dir;

public class WebDriverCoominLib extends BaseClass{
	public static String parentId;
	public static String childId;
	
	public void waitForPageToLoad(){
		BaseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void waitForElemetPresent(WebElement wb){
		WebDriverWait wait = new WebDriverWait(BaseClass.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(wb));
	}
	
	public void select(WebElement selwb, String data){
		Select sel = new Select(selwb);
		sel.selectByVisibleText(data);
	}

	public void select(WebElement selwb, int index){
		Select sel = new Select(selwb);
		sel.selectByIndex(index);
	}
	

	public void getAllWindowIds() {
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		parentId = it.next();
		childId = it.next();
	}
	
	public void switchToParent() {
		driver.switchTo().window(parentId);
	}
	
	public void switchToChild() {
		driver.switchTo().window(childId);

	}
	
	public void switchToAlert() {
		driver.switchTo().alert().accept();
	}
	
	public void mouseMovement(WebElement wb) {
		Actions act = new Actions(driver);
		act.moveToElement(wb).perform();
	}
	
	public void waitAndClick(WebElement element) {
		int count =20;
		while (count<20) {
			try {
				element.click();
				break;
			}catch (Throwable e) {
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					
				}
			}
		}
	}

}
