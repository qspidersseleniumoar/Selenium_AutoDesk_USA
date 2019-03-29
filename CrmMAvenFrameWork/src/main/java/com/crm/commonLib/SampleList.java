package com.crm.commonLib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class SampleList implements ITestListener {
 
	public void onTestFailure(ITestResult t) {
		
		String tstName = t.getName();
		EventFiringWebDriver edr = new EventFiringWebDriver(BaseClass.driver);
		File srcFile = edr.getScreenshotAs(OutputType.FILE);
		File dfile = new File("./screenshot/"+tstName+".png");
		try {
			FileUtils.copyFile(srcFile, dfile);
		} catch (IOException e) { }
		
	}

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	 
	
}
