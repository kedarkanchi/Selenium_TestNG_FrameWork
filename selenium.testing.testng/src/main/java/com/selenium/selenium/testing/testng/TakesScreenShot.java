package com.selenium.selenium.testing.testng;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import ch.qos.logback.core.util.FileUtil;



public class TakesScreenShot extends LaunchNew{

	private static final TakesScreenShot Driver = null;

	public static void main(String[] args) throws IOException {
		
		
		// TODO Auto-generated method stub

		browser("ch");
		
		url("eegp");
		
		Date date = new Date();
		
		SimpleDateFormat simdate=new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		
		String dt=simdate.format(date);
		
		System.out.println(date);
		
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("C://Users//kedar//Desktop//"+dt+"EeGPHome.png"));
	}

}
