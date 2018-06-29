package com.Automation.MainHrisTestOfMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class Login_Blank_Credentials {
	WebDriver driver;
	Base Blank_Credentails = new Base();
	
	public void Blank_Field(WebDriver driver)  {
		Blank_Credentails.clickLoginPanel(driver);
		Blank_Credentails.enterPassword(driver);
		Blank_Credentails.ClickSubmit(driver);
		String qa = driver.findElement(By.cssSelector("#login > form > div.loginTxt.txtHideDiv.alert.alert-error > div")).getText();
		Assert.assertTrue(qa.contains("Invalid Error"));
		//Blank_Credentails.HardWait(2000);
		
	}

}
