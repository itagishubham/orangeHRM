package com.orangeHRMopenSource.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="txtUsername")
	private WebElement username;
	
	@FindBy(id="txtPassword")
	private WebElement userpassword;
	 
	@FindBy(id="btnLogin")
	private WebElement loginbutton;
	
	public void enterUsername(String user)
	{
		username.sendKeys(user);
	}
	
	public void enterpassword(String passwrd)
	{
		userpassword.sendKeys(passwrd);
		
	}
	public void clickOn()
	{
		loginbutton.click();
		
	}
	
	public LoginPage(WebDriver driver )
	{
		PageFactory.initElements(driver, this);
	}
         public LoginPage() {
		
	}
	

}
