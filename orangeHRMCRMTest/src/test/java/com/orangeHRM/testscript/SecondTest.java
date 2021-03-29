package com.orangeHRM.testscript;

import org.testng.annotations.Test;

import com.orangeHRM.generics.BaseClass;
import com.orangeHRM.generics.FileLib;
import com.orangeHRMopenSource.objectrepository.AddUserPage;
import com.orangeHRMopenSource.objectrepository.Homepage;
import com.orangeHRMopenSource.objectrepository.LogoutfromWeb;
import com.orangeHRMopenSource.objectrepository.TocheckAddedUser;
import com.orangeHRMopenSource.objectrepository.UserHomePage;

//check if add user is displayed or not
public class SecondTest extends BaseClass  {
	
	
	@Test
	public void checkAdduser() throws InterruptedException
	{
		Homepage hp= new Homepage( driver);
		hp.movetoAdmin(driver);
		hp.movetoUserManagement();
		hp.movetousser();
		AddUserPage ap= new AddUserPage(driver);
        UserHomePage up =new UserHomePage(driver);
        up.clickOnAdd(driver);
        ap.addUsersinPage(new FileLib().getValues("EN"), "ggSy0007", "g0Sam0007ter", "g0Sam0007ter");
        Thread.sleep(4000);
        ap.clickOnSave();
        Thread.sleep(2000);
        TocheckAddedUser td= new TocheckAddedUser(driver);
        Thread.sleep(2000);
        td.checkadduser("gSamsgeorgey7");
        Thread.sleep(4000);
        LogoutfromWeb lw= new LogoutfromWeb();
         lw.logoutformwebpage(driver);
	}
	
	
	
	

}
