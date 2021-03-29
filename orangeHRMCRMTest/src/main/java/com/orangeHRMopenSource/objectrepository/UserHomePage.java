package com.orangeHRMopenSource.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserHomePage {
	
	@FindBy(xpath="//input[@id='btnAdd']")
    private 	WebElement addUser ;
	public UserHomePage(WebDriver driver )
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAdd(WebDriver driver)
	{
		addUser.click();
		
	}
	

}
