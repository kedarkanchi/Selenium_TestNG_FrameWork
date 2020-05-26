package com.selenium.selenium.testing.testng;

import java.io.IOException;

public class DataExcel {
	
	 public static  void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 String path="C:\\Users\\kedar\\Desktop\\EeGPSelenium.xlsx";
		 String sheet="Login";
		 DataDrivenExcel data=new DataDrivenExcel(path, sheet);
		 
		 data.getRowCount();
		 data.cellDataString(3, 2);
		 
		 
	}

}
 