package com.selenium.selenium.testing.testng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import ch.qos.logback.core.joran.action.Action;

public class ActionClasses extends LaunchNew{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		browser("ch");
		
		url("amz");
		
		Actions act=new Actions(driver);
		
		
		act.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		
		act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("One Plus 7T Pro").build().perform();
		
		act.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().build().perform();
		

	}

}
