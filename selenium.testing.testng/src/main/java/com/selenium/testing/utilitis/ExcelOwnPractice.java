package com.selenium.testing.utilitis;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOwnPractice {
	
	File file;
	FileInputStream fis;
	XSSFWorkbook excelbook;
	XSSFSheet sheet;
	
	public ExcelOwnPractice(String path) {
		
		
		
		
		 try {
			 file= new File(path);
				
			 fis= new FileInputStream(file);
			excelbook= new XSSFWorkbook(fis);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}
	
	
	public String getStringCellData(String sheetName,int row, int coloumn) {
		
		
		sheet= excelbook.getSheet(sheetName);
		
		String data= sheet.getRow(row).getCell(coloumn).getStringCellValue();
		
		return data;
		
		
		
		
	}


}
