package com.orangeHRMopenSource.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutfromWeb {
	
	 public LogoutfromWeb() {
		
	}
	public LogoutfromWeb(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[@id='welcome']")
	private WebElement  welcomemenu;
	

	@FindBy(xpath="//a[.='Logout']")
	private WebElement logoutbutton;
	
	public void logoutformwebpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		welcomemenu.click();
		logoutbutton.click();
		
		
	}

}
