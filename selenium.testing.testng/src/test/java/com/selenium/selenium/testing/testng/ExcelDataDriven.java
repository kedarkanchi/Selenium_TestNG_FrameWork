package com.selenium.selenium.testing.testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataDriven {
	
	FileInputStream fis;
	XSSFWorkbook book;
	XSSFSheet sheet;
	public ExcelDataDriven(String path, String sheetName) {
		
	try {
		fis = new FileInputStream(path);
		book= new XSSFWorkbook(fis);
		sheet =book.getSheet(sheetName);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
	
	public int getRowCount() {
		
		int rows=0; 
		try {
			rows = sheet.getPhysicalNumberOfRows();
			
			System.out.println("No rows = "+rows);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rows;
	}
	
	public int getColoumn() {
		
		int col=0;
		try {
			col = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No of Coulmes present :"+col);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  col;
	}
	
	public String getCellData(int row, int cell) throws java.lang.ArrayIndexOutOfBoundsException {
		
		String stringData=null;
		
		try { 
			stringData=sheet.getRow(row).getCell(cell).getStringCellValue();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stringData;
		
	}
	
	
	
}
