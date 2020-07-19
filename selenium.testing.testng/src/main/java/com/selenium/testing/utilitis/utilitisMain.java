package com.selenium.testing.utilitis;

public class utilitisMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ExcelDataRead edr= new ExcelDataRead("C:\\Users\\kedar\\Desktop\\Selenium Documents\\EeGPSelenium.xlsx");
		
		
		System.out.println(edr.getStringCellData("Login", 1, 2));
		
		System.out.println(edr.getIntegerCellData("Login", 1, 4));
	}

}
