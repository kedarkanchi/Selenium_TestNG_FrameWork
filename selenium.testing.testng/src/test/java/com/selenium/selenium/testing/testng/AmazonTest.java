package com.selenium.selenium.testing.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.IOException;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;

public class AmazonTest extends LaunchNew {
 
  @BeforeMethod
  
  public void beforeMethod() throws IOException, InterruptedException {
	  
	  browser("ch");
	  
	  url("amz");
	  
	  Thread.sleep(4000);
  }

  
  
  //@Test(dataProvider="")
  
  @Test
  public void amazonSearch() throws IOException {
	  
	  
	  type("amzsearchbar_xpath", "samtv");
	  
	  submit("amzsearchclick_xpath");
	  
	  
  }
  
  
  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  
	  Thread.sleep(6000);
	  close();
  }

}
