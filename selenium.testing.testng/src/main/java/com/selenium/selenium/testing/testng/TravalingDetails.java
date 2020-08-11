package com.selenium.selenium.testing.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TravalingDetails {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.Chrome.Driver", "Z://Softwares//Selenium Soft//WEB drivers//chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://book.spicejet.com/Contact.aspx");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		JavascriptExecutor js = (JavascriptExecutor)driver;
	}

}
