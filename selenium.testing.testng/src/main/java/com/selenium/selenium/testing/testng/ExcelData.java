package com.selenium.selenium.testing.testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream excelfis= new FileInputStream("C://Users//kedar//Desktop//EeGPSelenium.xlsx");
		
		XSSFWorkbook excelbook= new XSSFWorkbook(excelfis);
		
		int sheets=excelbook.getNumberOfSheets();
		
		for(int i=0;i<sheets; i++) {
			
			
			if(excelbook.getSheetName(i).equalsIgnoreCase("Login")) {
				
				XSSFSheet sheet= excelbook.getSheetAt(i);
				
				Iterator<Row> rows = sheet.iterator();
				Row nextrow = rows.next();
				Iterator<Cell> cell = nextrow.cellIterator();
				
				int k=0;
				int coloumn=0;
			
			while (cell.hasNext()) {
				
				Cell value = cell.next();
				
				if (value.getStringCellValue().equalsIgnoreCase("User-Name")) {
					
					coloumn=k;
						
				}
				
				k++;
			}
				
				
				System.out.println(coloumn);
			
			while(rows.hasNext()) {
				
				Row r= rows.next();
				
				if (r.getCell(coloumn).getStringCellValue().equalsIgnoreCase(null)) {
					
					Iterator<Cell> rcell = r.cellIterator();
					
					while(rcell.hasNext()) {
						
						
						
						System.out.println(rcell.next().getStringCellValue());
					}
					
				}
			}
				
				
			}
		}

	
		
		
		
		
	}

}
