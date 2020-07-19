package com.selenium.selenium.testing.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvideClassMain extends LaunchNew{
	
	WebDriver driver;

	@BeforeTest
	
	public void launch() {
		
		System.setProperty("WebDriver.Chrome.Driver", "Z://Softwares//Selenium Soft//WEB drivers//chromedriver.exe");
		
		 driver= new ChromeDriver();
		
		 driver.get("https://www.amazon.in/");
		 
		 driver.manage().window().maximize();
		
		
	}
	
	@Test(dataProvider="testData")
	public void eegpTest(String UserName) {
		
		
		
		driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")).click();
		
		//driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(UserName);
		
	}
	
	@DataProvider(name="testData")
	public Object[][] data() {
		
		String excelpath = "C:\\Users\\kedar\\Desktop\\Selenium Documents\\EeGPSelenium.xlsx";
		String sheet = "Login";
		//getData(excelpath, sheet);
		
		Object data[][]=getData(excelpath, sheet);
		
		return data;
				
		
	}
	
	
	public static Object[][] getData(String excelpath, String sheet ) {
		
		ExcelDataProvideClass excel= new ExcelDataProvideClass(excelpath, sheet);
		
		
		int  rowCount =excel.getRowCount();
		
		int ColCount= excel.getColoumnCount();
		
		Object data[][] = new Object [rowCount-1][ColCount];
		
		for(int i=1;i<rowCount;i++) {
			
			for(int j=0;j<ColCount;j++) {
				
				String cellData = excel.getCellData(i,j);
				
				System.out.print("   ~   "+cellData);
				 data[i-1][j]=cellData;
				
			}
			
			System.out.println("  ");	
			
		}
		//System.out.println(excel.getCellData(1,2));
		return data;
	}

}
