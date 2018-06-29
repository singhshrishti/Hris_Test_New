package com.Automation.MainHrisTestOfMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Correct_Credentials {
	WebDriver driver;
	Base Valid_Credentials = new Base();

	public void Correct_Credentials(WebDriver driver) throws InterruptedException{
		Valid_Credentials.clickLoginPanel(driver);
		Valid_Credentials.enterUserName(driver);
		Valid_Credentials.enterPassword(driver);
		Valid_Credentials.HardWait(3000);
		Valid_Credentials.ClickSubmit(driver);
		driver.findElement(By.xpath("//*[@id=\"page\"]/div/div[1]/div[2]/ul/li/a/span")).click();
		Valid_Credentials.HardWait(2000);
		driver.findElement(By.cssSelector(".fa.fa-sign-out")).click();

	}
}
