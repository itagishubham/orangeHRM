package com.orangeHRM.generics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.orangeHRMopenSource.objectrepository.LoginPage;
import com.orangeHRMopenSource.objectrepository.LogoutfromWeb;

public class BaseClass {
	
	public static WebDriver driver;
	public FileLib flib= new FileLib();
	public WebDrivercommonLib w= new WebDrivercommonLib();
	
	static 
	{
	 System.setProperty("webdriver.chrome.driver","./src/main/resources/Drivers/chromedriver.exe");
	 System.setProperty("webdriver.gecko.driver",".//Drivers//geckoDriver.exe");
	 
	}
	
	@BeforeTest
	public void openBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		w.waitforElementsInwepPage(driver);
		
	}
	@BeforeMethod
	public void logintopage() throws Exception {
		String un = flib.getValues("UN");
		String pw=flib.getValues("PWD");
		driver.get(flib.getValues("URL"));
		LoginPage lp= new LoginPage(driver);
		lp.enterUsername(un);
		lp.enterpassword(pw);
		lp.clickOn();
	}
	
	@AfterMethod
	public void logout() throws InterruptedException
	{
		Thread.sleep(2000);
		LogoutfromWeb lw= new LogoutfromWeb();
		Thread.sleep(2000);
		lw.logoutformwebpage(driver);
		
		
	}
	@AfterTest
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}

}
