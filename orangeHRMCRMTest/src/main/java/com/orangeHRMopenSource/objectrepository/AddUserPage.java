package com.orangeHRMopenSource.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddUserPage {
	@FindBy(xpath="//select[@id='systemUser_userType']")
	private WebElement  userroll;//se
	
	@FindBy(xpath="//input[@id='systemUser_employeeName_empName']")
	private WebElement  employeename;

	@FindBy(xpath="//input[@id='systemUser_userName']")
	private WebElement  username;
	
	@FindBy(xpath="//input[@id='//systemUser_status']")
	private WebElement  status;//se
	
	@FindBy(xpath="//input[@id='systemUser_password']")
	private WebElement  userpasword;
	
	@FindBy(xpath="//input[@id='systemUser_confirmPassword']")
	private WebElement  userconfirmpasword;
	
	@FindBy(xpath="//input[@id='btnSave']")
	private WebElement saveButton;
	
	public  AddUserPage(WebDriver driver ){
		PageFactory.initElements(driver, this);
	}
	
	
	public void addUsersinPage(String ename,String uname,String pas,String conpass)
	{
		employeename.sendKeys(ename);
		 username.sendKeys(uname);
		 userpasword.sendKeys(pas);
		 userconfirmpasword.sendKeys(conpass);
		 
		
	}
	
	public void selectRole(String tex)
	{
		Select sel= new Select(userroll);
		sel.deselectByVisibleText(tex);
	}
	public void selectStatus(String sta)
	{
		Select sel= new Select(status);
		sel.deselectByVisibleText(sta);
		
	}
	public void clickOnSave() {
		saveButton.click();
	}
	
	

}