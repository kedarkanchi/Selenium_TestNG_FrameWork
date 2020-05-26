package com.selenium.selenium.testing.testng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTablesMain extends LaunchNew {

	
	public static void main(String[] args) throws IOException, InterruptedException {
		
	
		browser("ch");
		
		url("cric");
		/*
		submit("cricscoreLink_xpath");
		
		Thread.sleep(5000);
		submit("cricScorecard_xpath");
		
		//cb-col cb-col-100 cb-ltst-wgt-hdr
		
		WebElement webTable = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		
		int rowcount = webTable.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();
		
		System.out.println(rowcount); 
		
		int count= webTable.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		for(int i=0;i<count;i++) {
			
			System.out.println(webTable.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']div:nth-child(3)")).get(i).getText());
			
		}*/
		
		int sum=0;
		

		WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowcount= table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();
		int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();

		for(int i=0;i<count-2;i++)
		{
		String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
		int valueinteger=  Integer.parseInt(value);
		sum=sum+valueinteger;//103
		}
		//System.out.println(sum);

		String Extras=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int extrasValue=Integer.parseInt(Extras);
		int TotalSumValue=sum+extrasValue;
		System.out.println(TotalSumValue);


		String ActualTotal=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int ActualTotalVAlue=Integer.parseInt(ActualTotal);
		if(ActualTotalVAlue==TotalSumValue)
		{
		System.out.println("Count Matches");
		}
		else
		{
		System.out.println("count fails");
		}
	
	
	
	
	}
	
	
}
	
	
