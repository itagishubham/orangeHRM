package com.orangeHRM.testscript;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.orangeHRMopenSource.objectrepository.AddUserPage;
import com.orangeHRMopenSource.objectrepository.Homepage;
import com.orangeHRMopenSource.objectrepository.LoginPage;
import com.orangeHRMopenSource.objectrepository.LogoutfromWeb;
import com.orangeHRMopenSource.objectrepository.UserHomePage;

//@Listeners(com.orangeHRMopenSource.generics.Listenerimplementation.class)

public class FistTestClass extends com.orangeHRM.generics.BaseClass{
	
	@Test
	public void orangeHrm() throws InterruptedException {
		
		Homepage hp=new Homepage(driver);
		Thread.sleep(2000);
		hp.movetoAdmin(driver);
		Thread.sleep(2000);
		hp.movetoUserManagement();
		Thread.sleep(2000);
		hp.movetousser();
		Thread.sleep(2000);
		UserHomePage us= new UserHomePage(driver);
		Thread.sleep(2000);
		us.clickOnAdd(driver);
		AddUserPage ap= new AddUserPage(driver);
		Thread.sleep(2000);
		ap.addUsersinPage("jhon", "jhons", "1234", "1234");
		Thread.sleep(2000);
		ap.selectRole("ESS");
		Thread.sleep(2000);
		ap.selectStatus("fulltime");
		Thread.sleep(2000);
		ap.clickOnSave();
		LogoutfromWeb lwb= new LogoutfromWeb(driver);
		lwb.logoutformwebpage(driver);
		Assert.fail();
		
		
	}
	

}
