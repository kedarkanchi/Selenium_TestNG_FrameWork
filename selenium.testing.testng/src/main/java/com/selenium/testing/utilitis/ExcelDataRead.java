package com.selenium.testing.utilitis;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataRead {
	File file;
	FileInputStream fis;
	XSSFWorkbook book;
	XSSFSheet sheet;

	
	public ExcelDataRead(String path) {
	
	try {
		 file = new File (path);
		
			 fis = new FileInputStream(file);
		
		    book = new XSSFWorkbook(fis);
		
		//XSSFSheet sheet= book.getSheet("Login");
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	
	public String getStringCellData(String sheetname, int row, int column) {
		
		
		 sheet= book.getSheet(sheetname);
		 
		  String data= sheet.getRow(row).getCell(column).getStringCellValue();
		 
		 
		return data;	
		
}
	
	public int getIntegerCellData(String sheetname, int row, int column) {
		
		
		 sheet= book.getSheet(sheetname);
		 
		 int  intdata= (int)sheet.getRow(row).getCell(column).getNumericCellValue();
		 
		return intdata;
		
		
		
}
	
	
}

