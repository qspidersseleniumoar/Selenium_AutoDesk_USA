package com.crm.commonLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	
	
	
	String filePath = "./src/test/resources/testData.xlsx";
	String propertyPath = "./src/test/resources/commonData.properties";
	
	public String getPropertyFileData(String key) throws Throwable {
		FileInputStream fis = new FileInputStream(propertyPath);
		Properties pObj = new Properties();
		pObj.load(fis);
		return pObj.getProperty(key);
	}
	public String getExcelData(String sheetNAme, int rowNum, int colNum) throws Throwable{
		FileInputStream fis = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetNAme);
		Row row = sh.getRow(rowNum);
		String data = row.getCell(colNum).getStringCellValue();
	    wb.close();
		return data;
	}
	
	public void setExcelData(String sheetNAme, int rowNum, int colNum,String data) throws Throwable,InvalidFormatException{
		FileInputStream fis = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetNAme);
		Row row = sh.getRow(rowNum);
	    Cell cel = row.createCell(colNum);
	    cel.setCellValue(data);
	    FileOutputStream fos = new FileOutputStream(filePath);
	    wb.write(fos);
	    wb.close();
		
	}
	public int getRowCount(String sheetNAme) throws Throwable{
		FileInputStream fis = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetNAme);
		int rowIndex = sh.getLastRowNum();
		return rowIndex;
		
	}


}
