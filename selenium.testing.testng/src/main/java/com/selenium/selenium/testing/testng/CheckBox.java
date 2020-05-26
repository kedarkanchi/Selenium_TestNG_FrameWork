package com.selenium.selenium.testing.testng;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

class CheckBox extends LaunchNew {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		browser("ch");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");

		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).click();

		Thread.sleep(5000);
		
		
		WebDriverWait expWait=new WebDriverWait(driver,20);
		
		expWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']")));
		
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
		
		

	}

}
