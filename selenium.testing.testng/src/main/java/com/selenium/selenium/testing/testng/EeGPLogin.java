package com.selenium.selenium.testing.testng;

import javax.swing.JOptionPane;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EeGPLogin {
	
	// loginpage
	
	@FindBy(xpath="//input[@id='username']") WebElement username;
	@FindBy(xpath="//input[@id='password']") WebElement password;
	@FindBy(xpath="//input[@id='captchaInput']") WebElement captha;
	@FindBy(xpath="//input[5]") WebElement loginbutton;
	
	//windows
	
	@FindBy(xpath="//a[1]//div[1]//span[1]//img[1]") WebElement excise;
	@FindBy(xpath="Distillery Operations") WebElement distillery_Operation;
	
	//IndentPage
	
	@FindBy(xpath="//h4[@class='page-main-section-top-bg']//a//img") WebElement indentRaise;
	@FindBy(xpath="//input[@id='quantityRequested']") WebElement indent_RequestedQuantity;
	@FindBy(xpath="//input[@id='strengthOP']") WebElement strength;
	
	
	public EeGPLogin(WebDriver driver) {
       
		PageFactory.initElements(driver, this);

	}
	public void loging() {
		
		
		username.sendKeys("dm.cruxbio@excise.com");
		
		password.sendKeys("guest");
		
		String cap = JOptionPane.showInputDialog("Please Enter Captcha in the box");
		
		captha.sendKeys(cap);
		
		loginbutton.submit();
		
	}
	
	public void indentpage() throws InterruptedException {
	username.sendKeys("dm.cruxbio@excise.com");
		
		password.sendKeys("guest");
		
		String cap = JOptionPane.showInputDialog("Please Enter Captcha in the box");
		
		captha.sendKeys(cap);
		
		loginbutton.submit();
		
		
		Thread.sleep(5000);
		
		excise.submit();
		
		distillery_Operation.submit();
		
		indentRaise.submit();
		
		indent_RequestedQuantity.sendKeys("25000");
		
		strength.sendKeys("68.5");
		
		
	}

}
