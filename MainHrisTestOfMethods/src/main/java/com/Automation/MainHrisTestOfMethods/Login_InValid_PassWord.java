package com.Automation.MainHrisTestOfMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class Login_InValid_PassWord {
	
	WebDriver driver;
	Base InValid_credentials = new Base();

	public void InvalidPassword(WebDriver driver){
		InValid_credentials.clickLoginPanel(driver);
		InValid_credentials.enterUserName(driver);
        driver.findElement(By.cssSelector("#txtPassword")).sendKeys("shrishtisingh");
        InValid_credentials.ClickSubmit(driver);
        String qa = driver.findElement(By.cssSelector("#login > form > div.loginTxt.txtHideDiv.alert.alert-error > div")).getText();
		Assert.assertTrue(qa.contains("Invalid Error"));
    	InValid_credentials.clickLoginPanel(driver);
		
		
	}

}
