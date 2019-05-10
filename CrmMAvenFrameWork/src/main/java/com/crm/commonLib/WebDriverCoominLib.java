package com.crm.commonLib;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCoominLib {
	public static String parentId;
	public static String childId;

	public void waitForPageToLoad() {
		BaseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void waitForElemetPresent(WebElement wb) {
		WebDriverWait wait = new WebDriverWait(BaseClass.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(wb));
	}

	public void select(WebElement selwb, String data) {
		Select sel = new Select(selwb);
		sel.selectByVisibleText(data);
	}

	public void select(WebElement selwb, int index) {
		Select sel = new Select(selwb);
		sel.selectByIndex(index);
	}

	public void getAllWindowIds() {
		Set<String> set = BaseClass.driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		parentId = it.next();
		childId = it.next();
	}

	public void switchToParent() {
		BaseClass.driver.switchTo().window(parentId);
	}

	public void switchToChild() {
		BaseClass.driver.switchTo().window(childId);

	}

	public void switchToAlert() {
		BaseClass.driver.switchTo().alert().accept();
	}

	public void mouseMovement(WebElement wb) {
		Actions act = new Actions(BaseClass.driver);
		act.moveToElement(wb).perform();
	}

	public String getAlertTest() {
		return BaseClass.driver.switchTo().alert().getText();
	}

	public void waitAndClick(WebElement element) {
		int count = 0;
		while (count < 20) {
			try {
				element.click();
				break;
			} catch (Throwable e) {

				try {
					Thread.sleep(1000);
					count++;
					break;
				} catch (InterruptedException e1) {

				}
			}
		}
	}

	/**
	 * Added by praveen
	 * 
	 * @param driver
	 */

	public void acceptAlert(WebDriver driver) {
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}

	public void dismissAlert(WebDriver driver) {
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
	}

}
