package com.selenium.selenium.testing.testng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FramesDemo extends LaunchNew {
	
	
	public static void main(String [] args) throws IOException {
		
		browser("ch");
		
		driver.get("https://jqueryui.com/droppable/");
		
		//driver.findElement(By.xpath("//div[@id='draggable']")).click();
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		Actions act=new Actions(driver);
		
		WebElement source =driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		act.dragAndDrop(source, target).build().perform();
		
	}

}
