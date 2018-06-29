package com.Automation.MainHrisTestOfMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Base {
	
	
	public void clickLoginPanel(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//*[@id=\"demo-2\"]/div/div[2]/ul/li[1]/a/span")).click();
	}
	
	public void enterUserName(WebDriver driver){
		driver.findElement(By.id("txtUserName" )).clear();
		driver.findElement(By.id("txtUserName" )).sendKeys("shrishtisingh");
	}

	public void enterPassword(WebDriver driver) {
		String password="Shrishti@321#";   
		 driver.findElement(By.id("txtPassword" )).clear();
		 driver.findElement(By.id("txtPassword")).sendKeys(password);
	}

	public void ClickSubmit(WebDriver driver) {
		driver.findElement(By.name("Submit")).click();
	}
	
	public void HardWait(long time) throws InterruptedException {
		Thread.sleep(time);
	}
}
