package com.selenium.selenium.testing.testng;

import java.util.ResourceBundle.Control;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class TesingSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("WebDriver.Chrome.Driver", "Z://Softwares//Selenium Soft//WEB drivers//chromedriver.exe");
	
				WebDriver driver= new ChromeDriver();
				
				
				driver.get("https://www.amazon.in/");
				
				//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("apple");
				
				Thread.sleep(10);
				
				WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
				
				search.sendKeys(Keys.CONTROL+"a");
				
				Thread.sleep(5000);
				
				search.sendKeys("onePlus 8");
				
				driver.findElement(By.xpath("//input[@type='submit'][@class='nav-input']")).click();
				
				//System.out.println(driver.getTitle());
				
				
				//String mobile = driver.findElement(By.linkText("OnePlus 8 5G (Glacial Green 6GB RAM+128GB Storage)")).getText();
				
				//System.out.println(mobile);
				
				
				

	}

}
