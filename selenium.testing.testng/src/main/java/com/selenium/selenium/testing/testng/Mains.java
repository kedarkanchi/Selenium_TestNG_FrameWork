package com.selenium.selenium.testing.testng;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mains extends LaunchNew{
	
	private static final Logger log=Logger.getLogger(Mains.class.getName());
	public static final String TakeScreeshot = null;

	public static void main(String[] args) throws Throwable  {
		
		
		browser("ch");
		
		url("amz");
		
		////Amazon Site
		
		Select sel=new Select(driver.findElement(By.cssSelector("#searchDropdownBox")));
		
		sel.selectByIndex(8);
		
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("One Plus 7T Pro");
		
		driver.findElement(By.xpath("//input[@type='submit'][@class='nav-input']")).click();
		
		
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Bengaluru (BLR)')]")).click();
		
		
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();;
		
    	/*type("eegpIndentSearch_name","valueKey" );*/
    	/*
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    	//Thread.sleep(4000);
      
    	//driver.findElement(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/a[1]")).click();
    	WebDriverWait wait=new WebDriverWait(driver,10);
    	
    	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(driver.findElement(By.xpath("//div[@class='col-lg-8']//a[1]"))));
		submit("eegpcomplaintab_xpath");
		
		
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("ChooseFile")).click();
		
		
        
        
        File scrnshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        FileHandler.copy(scrnshot, new File("C://Users//kedar//Documents//amz.jpj"));
        
       log.info("Test cases opend in browser:"+ loadData("ch"));
      // log.debug("Just now you have opend the browser:"+ loadData("ch"));
        
      //  driver.manage().deleteAllCookies();
		
		url("eegp");
		
		log.info("You have logged into the URL:"+loadData("eegp"));
		
		
		
//		submit("amzsigninlink_xpath");
		
    	type("eegpIndentSearch_name","valueKey");
    	
    	submit("amzusercontinue_xpath");
    	
    	type("amzpass_xpath","password");

		submit("//a[@id='searchId']//img");
		
//		submit("amzusercgorel_xpath");
		
		String a = driver.getCurrentUrl();
		log.info("test"+a);
		
		//String til = driver.getWindowHandle();

		//log.info("Page Title is:"+til);
		
		
*/
		
	}

	

}
