package com.orangeHRMopenSource.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	static  Actions act ;
     
	@FindBy(xpath="//a[@id='menu_admin_viewAdminModule']")
   private 	WebElement adminmenu ;
	
	@FindBy(xpath="//a[@id='menu_admin_UserManagement']")
	private WebElement usermanagment ;
	
	@FindBy(xpath="//a[@id='menu_admin_viewSystemUsers']")
	private WebElement user;
	
	public Homepage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	public void movetoAdmin(WebDriver driver) {
		act=new Actions(driver);
		act.moveToElement(adminmenu).perform();
	}
	
	 public void movetoUserManagement()
	 {
		 act.moveToElement(usermanagment).perform();
	 }
	 public void movetousser() {
		 act.moveToElement(user).click().perform();
	 }
	
}
