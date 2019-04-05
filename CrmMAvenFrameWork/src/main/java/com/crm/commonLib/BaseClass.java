package com.crm.commonLib;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.crm.objectRepository.Home;
import com.crm.objectRepository.Login;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class BaseClass {
	public static FileLib eLib = new FileLib();
	public ExtentReports extent;
	public ExtentTest logger;
	public static WebDriver driver;
@BeforeSuite
public void configbeforeSuite(){
	 extent = new ExtentReports("./test-output/ExtentReport1.html", true);
	 extent.addSystemInfo("Au8tomationLab", "SoftwareTestingMaterial")
	        .addSystemInfo("Environment", "Window")
            .addSystemInfo("User Name", "Deepak");
            extent.loadConfig(new File("./extent-config.xml"));
}

@BeforeClass
public void configBc() throws Throwable, InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException{
	
	String browser = eLib.getPropertyFileData("browser");
	String url = eLib.getPropertyFileData("url");
	if(browser.equals("firefox")){
			/*
			 * FirefoxProfile profile = new FirefoxProfile(); FirefoxBinary bin = new
			 * FirefoxBinary(new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe"));
			 */
	   driver = new FirefoxDriver();
	}else if(browser.equals("chrome")){
		//System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(url);
}

@BeforeMethod
public void configBM() throws Throwable{
	Login lp = PageFactory.initElements(driver, Login.class);
	String username = eLib.getPropertyFileData("username");
	String password = eLib.getPropertyFileData("password");
	lp.login(username, password);
}

@AfterMethod
public void configAm(){
	Home lp = PageFactory.initElements(driver, Home.class);
	lp.signOut();
}
@AfterClass
public void afterClass(){
	driver.close();
}
@AfterSuite
public void configafterSuite(){
	extent.flush();
	extent.close();
	
}

}
