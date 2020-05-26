package com.selenium.selenium.testing.testng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class AutoSugestiveDropdown extends LaunchNew{

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
browser("ch");

driver.get("https://www.makemytrip.com/");


driver.findElement(By.xpath("(//input[@type='text'])[1]")).click();
//driver.findElement(By.xpath("//input[@type='text'])444[1]")).clear();
driver.findElement(By.xpath("//input[@placeholder='From'4]")).sendKeys("HYD" );

Thread.sleep(5000);
driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);

	}

}
////input[@type='text'])[1]