package com.selenium.selenium.testing.testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;

//import net.bytebuddy.utility.privilege.GetSystemPropertyAction;

public class LaunchNew {

	 static Logger log= Logger.getLogger(LaunchNew.class.getName());
	 
	 
	 static String path="./seleniumData.properties";
	 
	 public static WebDriver driver;	 
	 
	
	 
	 public static String loadData(String value) throws IOException {
		 
		 Properties pro=new Properties();
		 
		 FileInputStream fis=new FileInputStream(path);
		 
		 
		 pro.load(fis);
		 
		String key = pro.getProperty(value);
		 
		return key;
		 
		 
		 
	 }
	
	 public static void browser(String browserkey) throws IOException {
			// TODO Auto-generated method stub
		 
	
		 
			if(loadData(browserkey).equalsIgnoreCase("Chrome")) {
				
				driver=new ChromeDriver();
			}

			
			else if(loadData(browserkey).equalsIgnoreCase("internet")) {
				
				driver=new InternetExplorerDriver ();
			}
		
			
			else if (loadData(browserkey).equalsIgnoreCase("edge")) {
				
				driver = new EdgeDriver (); 
			}
			
			else
				
				System.out.println("abcd");
			
			driver.manage().window().maximize();
			
			
			String path="./log4j.properties";
			PropertyConfigurator.configure(path);
		 
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
			
		}
	 
	// TODO Auto-generated method stub
	 
	 public static void url(String urlKey) throws IOException {
		 
		 if(loadData(urlKey).equalsIgnoreCase("http://cpe.ap.gov.in/EeGP")) {
			 
			 driver.get(loadData(urlKey));
			 
			 
		 }
		 
		 else if (loadData(urlKey).equalsIgnoreCase("https://www.amazon.in")) {
			 
			 driver.get(loadData(urlKey));
			 
		 }
		 
		 else if(loadData(urlKey).equalsIgnoreCase("https://www.youtube.com/")) {
			 
			 driver.get(loadData(urlKey));
			 
		 }
		 
          else if(loadData(urlKey).equalsIgnoreCase("hhttps://hr.karvy.com/Login.aspx?ReturnUrl=%2f")) {
			 
			 driver.get(loadData(urlKey));
          }
		 
          else if(loadData(urlKey).equalsIgnoreCase("https://www.path2usa.com/travel-companions")) {
 			 
 			 driver.get(loadData(urlKey));
           }
		 
          else if(loadData(urlKey).equalsIgnoreCase("http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017")) {
  			 
  			 driver.get(loadData(urlKey));
            }
		 
          else if(loadData(urlKey).equalsIgnoreCase("https://smallpdf.com/pdf-to-word")) {
   			 
   			 driver.get(loadData(urlKey));
             }
		 
		 else
			 
			 System.out.println("Please Enter Valid URL");
//			driver.get(loadData(urlKey));
			
		}

		public static void type(String locatorsKey, String valueKey) throws IOException {
			
			getElement(locatorsKey).sendKeys(loadData(valueKey));;
			// TODO Auto-generated method stub
			
			/*driver.findElement(By.name(loadData(locatorsKey))).sendKeys(loadData(valueKey));*/
	
			
		}

	public static WebElement getElement(String locatorsKey) throws IOException {
			// TODO Auto-generated method stub
		
		
		WebElement e=null;
		
		if(locatorsKey.endsWith("_id"))
			e=driver.findElement(By.id(loadData(locatorsKey)));
	
		else if (locatorsKey.endsWith("_name"))
			e=driver.findElement(By.name(loadData(locatorsKey)));

		else if (locatorsKey.endsWith("_class"))
			e=driver.findElement(By.className(loadData(locatorsKey)));
			
        else if (locatorsKey.endsWith("_xpath")) 
			e=driver.findElement(By.xpath(loadData(locatorsKey)));
		
        else if (locatorsKey.endsWith("_css")) 
			e=driver.findElement(By.cssSelector(loadData(locatorsKey)));
        /*else
        	
        	reportFailure("No Locator has been mached in Weblements  :"+loadData("locatorsKey"));*/
		
		return e;
		
			
		}

	private static void reportFailure(String msg) throws IOException {
		
		
		// TODO Auto-generated method stub
		takeScreenshoot();
		
		log.info(msg);
	}

	private static void takeScreenshoot() throws IOException {
		// TODO Auto-generated method stub
		
		
		
		Date dt=new Date();
		SimpleDateFormat simpdt=new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C://Users//kedar//Desktop//Selefailure//"+ loadData(driver.getTitle()) +simpdt.format(dt)+".jpeg"));
		
	}

	public static void submit(String locatorsKey) throws IOException {
		
		
		driver.findElement(By.xpath(loadData(locatorsKey))).click();
		
		
		
		
		
		
		// TODO Auto-generated method stub
		
		
		
	}
	
	/*public static void captha() throws IOException, TesseractException {
		
		File cap = driver.findElement(By.id("captchaImage")).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(cap,new File("path"));
		
		String path =System.getProperty("user.dir")+"Snaps/catha.png";
		
		ITesseract image= new Tesseract();
		
		
		String imagetext= image.doOCR(new File("path"));
		
		System.out.println(imagetext);
		
	}*/


	public void close() {
		
		driver.close();
		
		
	}
	

}
