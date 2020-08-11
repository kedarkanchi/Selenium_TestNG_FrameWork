package com.selenium.selenium.testing.testng;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CalendarMain extends LaunchNew {
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
	
		System.setProperty("WebDriver.Chrome.Driver", "Z://Softwares//Selenium Soft//WEB drivers//chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		browser("Chrome");
		/*
		driver.get("https://www.goibibo.com");
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);*/
        
	   
		
		driver.get("https://book.spicejet.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		

		driver.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']")).sendKeys("Hyderabad (HYD)");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT']")).clear();
		
		driver.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT']")).sendKeys("tir");;
		//Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//div[@id='marketDate_1']//input[1]")).click();
		
		//Thread.sleep(4000);
		
		String month="September 2020";
		
		while(!driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText().contains(month)) {
			
			//System.out.println("hello");
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			
		}
		
		
		 
	List<WebElement> day = driver.findElements(By.xpath("//a[@class='ui-state-default']"));
	
	
	
	for(int i=0; i<day.size(); i++) {
		
		
		if(day.get(i).getText().contains("5")) {
			
			
			day.get(i).click();
			
			Thread.sleep(3000);
			
			
			break;
		}
		
		
	}
	
	driver.findElement(By.cssSelector(".home-search-button.home-search-buttonnw")).click();
	//js.executeScript("window.scrollBy(0,700)");
	
	Thread.sleep(10000);
	

	
	//act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("One Plus 7T Pro").build().perform();
	
	//driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
	
	List<WebElement> flightPrice = driver.findElements(By.xpath("//span[@class='flightfare']"));
	
	for(int j=0;j<flightPrice.size();j++) {
		
		String price = flightPrice.get(j).getText().replaceAll(",", "" ).replaceAll(" INR", "");
		
		
		int intPrice = Integer.parseInt(price);
		
				if(intPrice<=3000) {
	
			flightPrice.get(j).click();
			
			driver.findElement(By.xpath("//span[@class='button-continue-text']")).click();
			break;
		}
				
				else if(intPrice<=4000) {
					flightPrice.get(j).click();
					
					driver.findElement(By.xpath("//span[@class='button-continue-text']")).click();
					break;
				}
				
				else if(intPrice<=5000) {
					flightPrice.get(j).click();
					
					driver.findElement(By.xpath("//span[@class='button-continue-text']")).click();
				break;
				}
				
				else {
					
					System.out.println("No price has done");
				}
		
	}
	
	/*Actions act=new Actions(driver);
	
	act.moveToElement(driver.findElement(By.className("button-continue-text"))).click().build().perform();*/
	
	//travalling Details 
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//input[@id='CONTROLGROUPPASSENGER_ContactInputPassengerView_TextBoxFirstName']"))
	.sendKeys("Kedar");
	
	driver.findElement(By.xpath("//input[@id='CONTROLGROUPPASSENGER_ContactInputPassengerView_TextBoxLastName']"))
	.sendKeys("Kanchi");
	
	driver.findElement(By.cssSelector(".wHuge1t.required.WM")).sendKeys("1234567890");
	
	driver.findElement(By.xpath("//input[@id='CONTROLGROUPPASSENGER_ContactInputPassengerView_TextBoxEmailAddress']"))
	.sendKeys("kedarkanchi@gmail.com");
	
	Select citysel=new Select(driver.findElement(By.xpath("//select[@name='contact_cities_list_india']")));
	
	citysel.selectByIndex(24);
	
	//Passenger Details
	
	driver.findElement(By.xpath("//input[@id='CONTROLGROUPPASSENGER_PassengerInputViewPassengerView_TextBoxFirstName_0']"))
	.sendKeys("Kedar");
	
	driver.findElement(By.cssSelector("#CONTROLGROUPPASSENGER_PassengerInputViewPassengerView_TextBoxLastName_0"))
	.sendKeys("kanchi");
	
	driver.findElement(By.cssSelector("#CONTROLGROUPPASSENGER_PassengerInputViewPassengerView_TextBoxEmailMobile_0"))
	.sendKeys("1234567890");
	// 
	driver.findElement(By.xpath("//div[@id='continue-to-addons-page']//span[@class='forward-icon']")).click();
	}
	}
	
	


