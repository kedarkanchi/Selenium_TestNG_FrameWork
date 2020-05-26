package com.selenium.selenium.testing.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.IOException;

import org.testng.annotations.AfterMethod;

public class EeGPloginTest extends LaunchNew {
	
	
	
	EeGPLogin eegp;
	

  @BeforeMethod
  public void browserLaunch() throws IOException {
	 
	 browser("ch");
	 url("eegp");
	 
	 
  }

  
  @Test(enabled=false)
  public void eegpLoginTest() {
	  
	  eegp= new EeGPLogin(driver);
	  
	  eegp.loging();
	  
	
	  
  }
  
  @Test
  
  public void indentRaiseTest() throws InterruptedException {
	  
	  eegp= new EeGPLogin(driver);
	  
	  eegp.indentpage();
	  
  }
  
  
  @AfterMethod
  public void tareing() throws InterruptedException {
	  
	  
	  Thread.sleep(5000);
	  //close();
  }

}
