package com.selenium.selenium.testing.testng;

import java.io.IOException;

import org.openqa.selenium.By;

public class HandlingAlerts extends LaunchNew {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		browser("ch");

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.cssSelector("#alertbtn")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		driver.close();
//Alert alt=new Alert();

	}

}
