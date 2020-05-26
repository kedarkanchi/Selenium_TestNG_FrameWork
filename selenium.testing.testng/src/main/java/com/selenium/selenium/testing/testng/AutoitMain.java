package com.selenium.selenium.testing.testng;

import java.io.IOException;

import org.openqa.selenium.By;

public class AutoitMain extends LaunchNew {
	
	public static void main(String[] args) throws IOException {
		
		browser("ch");
		
		url("pdf");
		
		driver.findElement(By.cssSelector("[class='l0v3m7-6 hIetmX']")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\kedar\\Documents\\TestIndent.exe");
	}

}
