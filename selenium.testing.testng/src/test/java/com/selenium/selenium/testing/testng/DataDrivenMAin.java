package com.selenium.selenium.testing.testng;

public class DataDrivenMAin {
	
	
	public static void main(String[] args) {
		
		String path = "C:\\Users\\kedar\\Desktop\\Selenium Documents\\EeGPSelenium.xlsx";
		String sheet="Login";
		
		getDatamain(path,sheet);
		
		
	}
	

	public static Object[][]  getDatamain(String path, String sheet) {
		
		ExcelDataDriven driven= new ExcelDataDriven(path, sheet);
		
		int rows   = driven.getRowCount();
		int col =driven.getColoumn();
		
		Object data[][]= new Object [rows-1][col];
		
		for(int i=1;i<rows; i++) {
			
			for(int j=0;j<col; j++) {
				
				String celdata=driven.getCellData(i,j);
				
				System.out.print( celdata);
				
				data[rows-1][col]=celdata;
			}
			System.out.println();
		}	
		
		//System.out.println(driven.getCellData(1,2));
    return data;
    
	}

}
