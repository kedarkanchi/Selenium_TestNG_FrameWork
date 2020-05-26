package com.selenium.selenium.testing.testng;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CalendarMain extends LaunchNew {
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		browser("ch");
		
		url("usa");
		
		submit("ondate_xpath");
		
		
		String month="Jan 2020";
		
		//String text= driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//td[@class='monthTitle']")).getText().contains(month);
		
		
		//System.out.println(text);
		
		
		
		
		while(!driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/thead[1]/tr[1]/th[2]")).getText().contains("January 2021")) {
			//System.out.println("hello");
			driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next'][contains(text(),'»')]")).click();
			
		}
		
		/*
		WebElement day = driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']"));
		
		if(day.getText().contains("18")) {
			day.click();
			
		}*/
	
		
	List<WebElement> date = driver.findElements(By.className("day"));
		
		int count=driver.findElements(By.className("day")).size();
		
		//WebElement count = driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']"));
		
		System.out.println(count);
		
		for(int i=0;i<count; i++) {
			
			
			String text = driver.findElements(By.className("day")).get(i).getText();
			
			if(text.equalsIgnoreCase("15")) {
				
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
			
			else {
				
				System.out.println("We are unable to print the Date ");
			}
		}
	}
	}
	
	


