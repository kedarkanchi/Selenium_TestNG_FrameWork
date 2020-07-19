package com.selenium.selenium.testing.testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvideClass {
	
	File file;
	FileInputStream fis;
	XSSFWorkbook book;
	XSSFSheet sheet;
	public ExcelDataProvideClass(String excelPath, String excelSheet) {
		
		try {
			 file= new File(excelPath);
			
			 fis= new FileInputStream(file);
			
			book = new XSSFWorkbook(fis);
			
			sheet= book.getSheet(excelSheet);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
				
		}
		
	
		public int getRowCount() {
			int rowCount=0;
			try {
				 rowCount = sheet.getPhysicalNumberOfRows();
				
				System.out.println("No of Rows Present:  "+rowCount);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			return rowCount;
		
		}
			
			public int getColoumnCount() {
				int ColCount=0;
				try {
				  ColCount = sheet.getRow(0).getPhysicalNumberOfCells();
					
					System.out.println("No of Coloumn Presentis ::"+ColCount);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return ColCount;		
				}
			
			

			public String getCellData(int row, int cell) {
				
				String cellData=null;
				try {
					cellData = sheet.getRow(row).getCell(cell).getStringCellValue();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				return cellData;
				
				
				}
		

			
			
}

