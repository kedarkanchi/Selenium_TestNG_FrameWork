package com.selenium.selenium.testing.testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenExcel {

	
    static File file;
	
	static FileInputStream fis ;
	
	static  XSSFWorkbook wbook ;
	
	static XSSFSheet sheet ;
	public  DataDrivenExcel(String excelPath, String sheetName) {
		try {
		file=new File(excelPath);
		
		 fis=new FileInputStream(file);
		
		 wbook= new XSSFWorkbook(fis);
		
		 sheet= wbook.getSheet(sheetName);
		}
		catch (Exception e) {
			
			e.getStackTrace();
			
			
		}
	}
	
public static void getRowCount() throws IOException {
	
	
	try {
	
	int rowCount = sheet.getPhysicalNumberOfRows();
	
	System.out.println("no of rows is"+rowCount);
	
	}
	
	catch (Exception e) {
		e.printStackTrace();// TODO: handle exception
	}
	
	} 
	

public void cellDataString(int rowNum, int cellNum) {
	
	try {
	
	String cellData = sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
	
	
	}
	
	catch (Exception e) {
		
		e.getStackTrace();
	}
	
	}
public void cellDataNumber(int rowNum, int cellNum) {
	
	try {
	
	double cellData = sheet.getRow(rowNum).getCell(cellNum).getNumericCellValue();
	}
	
	catch (Exception e) {
		
		e.getStackTrace();
	}
	
	}	

}


	

