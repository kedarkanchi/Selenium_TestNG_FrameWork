package com.selenium.selenium.testing.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {
	
	public static void main(String[] args) {
		
		
		
		System.setProperty("WebDriver.Chrome.Driver", "Z://Softwares//Selenium Soft//WEB drivers//chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		
		Select sel= new Select(driver.findElement(By.xpath("//select[@class='form-control']")));
		
		sel.selectByValue("Tuesday");
		
		Select sel1= new Select(driver.findElement(By.xpath("//select[@name='States']")));
		
		sel1.selectByValue("New York");
		
		
		
		
	}
	
	
	}


