package com.selenium.selenium.testing.testng;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class NewTab extends LaunchNew {
	
	
	public static void main (String[] args) throws IOException {
		
		browser("ch");
		
		url("eegp");
		
		String newTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
		  
		  
		driver.findElement(By.xpath("//div[@class='col-lg-8']//a[1]")).sendKeys(newTab);
		//type("eegpcomplaintab_xpath", newTab);
		/*driver.findElement(By.xpath("//a[contains(text(),'About Us')]")).sendKeys(newTab);
		
		driver.findElement(By.xpath("//a[contains(text(),'Acts & Rules')]")).sendKeys(newTab);
		
		driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).sendKeys(newTab);*/
		String ti = driver.getTitle();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> winit = window.iterator();
		
		while(winit.hasNext()) {
			
			
			driver.switchTo().window(winit.next());
			
		}
		
		
		System.out.println(ti);
	}

}
