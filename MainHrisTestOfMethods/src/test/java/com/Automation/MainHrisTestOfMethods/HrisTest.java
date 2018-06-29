package com.Automation.MainHrisTestOfMethods;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class HrisTest {

	WebDriver driver;

	String url = "https://hris.qainfotech.com/login.php";
	String driverPath = "C:\\Users\\shrishtisingh\\Desktop\\chromedriver_win32\\chromedriver.exe";
	login Log = new login();
	Login_InValid_PassWord Obj1 = new Login_InValid_PassWord();
	Login_Blank_Credentials Obj2 = new Login_Blank_Credentials();
	Login_Correct_Credentials Obj3 = new Login_Correct_Credentials();

	@BeforeClass
	public void Launch_Browser() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	@Test(priority = 0)
	public void click_Login() {
		Log.Login(driver);
	}

	@Test(priority = 1)
	public void Login_Through_InValid_Password(){
		Obj1.InvalidPassword(driver);
	}

	@Test(priority = 2)
	public void Login_Blank_Credentials(){
		Obj2.Blank_Field(driver);
	}

	@Test(priority = 3)
	public void Login_Correct_Credentials() throws InterruptedException{
		Obj3.Correct_Credentials(driver);
	}

	@AfterClass
	public void afterClass() {
		// driver.close();
	}

}
