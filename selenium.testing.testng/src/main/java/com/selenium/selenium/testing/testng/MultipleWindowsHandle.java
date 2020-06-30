package com.selenium.selenium.testing.testng;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class MultipleWindowsHandle extends LaunchNew {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		
		browser("ch");
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		
		Actions act=new Actions(driver);
		
		
		
		
		String win =driver.getWindowHandle();
		
		Set<String> windows = driver.getWindowHandles();
		
		
		//Assert.assertEquals(windows, win);
		
		
		Iterator<String> it = windows.iterator();
		
		String parentit= win;
		
		String childit=it.next();
		
		String childit2=it.next();
		
		
		
		
		//driver.switchTo().window(childit);
		
		//driver.findElement(By.xpath("//span[contains(text(),'Google Account')]")).click();
		
		Thread.sleep(5000);
		driver.switchTo().window(parentit);
		
		//act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Privacy')]"))).contextClick().keyDown(Keys.ARROW_DOWN).build().perform();
		
		//Thread.sleep(10000);
		
	    //driver.switchTo().window(childit);
		
		
	}

}
