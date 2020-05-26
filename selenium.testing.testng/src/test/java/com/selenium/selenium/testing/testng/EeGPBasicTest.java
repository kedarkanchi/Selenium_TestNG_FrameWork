package com.selenium.selenium.testing.testng;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import net.bytebuddy.asm.Advice.OffsetMapping.ForOrigin.Renderer.ForReturnTypeName;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.nio.Buffer;
import java.util.List;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class EeGPBasicTest extends LaunchNew  {
	
	@BeforeMethod
	  public void beforeMethod() throws IOException, InterruptedException {
		  
		 browser("ch");
		 
		 url("eegp");
		 
		 Thread.sleep(4000);
	  }

	
  @Test
  public void searching() throws IOException, InterruptedException {
	  
	 
	  submit("eeg_xpath");
	  
	  
		//driver.findElement(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/a[1]")).click();
		
	  type("eegpusername_xpath", "usernamevalue");
	  
	  type("eegppassword_xpath", "userpassword");
	  
	  String captchaVal = JOptionPane.showInputDialog("Please enter the captcha value:");
	 
	  
	  driver.findElement(By.xpath("//input[@id='captchaInput']")).sendKeys(captchaVal);
	   
	  submit("eegplogin_xpath");
	  
	  submit("eegpExciseTab_xpath");
	  submit("eegpDistileryOperationTab_xpath");
	  
	  submit("eegpraiseIndent_xpath");
	  
	  type("eegpIndentTypedropdown_xpath", "indentTypevalue1");
	  type("eegpIdentUsedby_xpath", "indentusedBy1");
	  
	  type("eegpIndenrawmatrialType_xpath", "RawMatrial1");
	  
	  
	  type("eegprequestedQuantity_xpath", "requeted3");
	  
	  type("eegpstrength_xpath", "strengthENA");
	  
	  type("eegpSuplierselection_xpath", "supliername");
	  type("eegpsuplierUsedbyselection_xpath", "suplierUsedBy");
	  Thread.sleep(6000);
	  //type("eegpactualsuplierOSTFselection_xpath", "suplierostf");
	  driver.findElement(By.xpath("//input[@id='uploadCheckMemoFile']")).click();
	  //submit("eegpChecmemoupload_xpath");
	  Thread.sleep(5000);
	  Runtime.getRuntime().exec("C:\\Users\\kedar\\Documents\\TestIndent.exe");
	  Thread.sleep(10000);
	  
	  
	  submit("eegpIndentSubmitbutton_xpath");
	  
	 
	 /*
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/a[1]/div[1]")).click();
	  
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/a[1]/div[1]")).click();*/
	  
  }
  
  
  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  
	  Thread.sleep(5000);
	 //close();
  }

}
