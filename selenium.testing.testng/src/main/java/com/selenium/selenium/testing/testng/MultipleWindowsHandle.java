package com.selenium.selenium.testing.testng;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

public class MultipleWindowsHandle extends LaunchNew {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		
		browser("ch");
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> it = windows.iterator();
		
		String parentit=it.next();
		
		String childit=it.next();
		
		driver.switchTo().window(childit);
		
		driver.findElement(By.xpath("//span[contains(text(),'Google Account')]")).click();
		Thread.sleep(5000);
		driver.switchTo().window(childit);
		Thread.sleep(5000);
		driver.switchTo().window(parentit);
		
		
	}

}
