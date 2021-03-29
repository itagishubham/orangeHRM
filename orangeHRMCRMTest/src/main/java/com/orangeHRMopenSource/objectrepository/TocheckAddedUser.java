package com.orangeHRMopenSource.objectrepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

public class TocheckAddedUser {
	
       @FindBy(xpath="//input[@id='searchSystemUser_userName']")
	    private WebElement search;
       
       @FindBy(xpath="//a[.='Username']/parent::th/parent::tr/parent::thead/parent::table//tbody")
       private WebElement username;
       
       @FindBy(xpath="//input[@id='searchBtn']")
       private WebElement button;
       
       public TocheckAddedUser(WebDriver driver) {
    	   PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public void checkadduser(String name)
       {
    	    boolean flag= false;
    	   search.sendKeys(name);
    	   button.click();
    	 
    		   String s= username.getText();
    		   if(s.equals(name))
    		   {
    			   flag=true;
    		   }
    		   
    		   Reporter.log("ongoing",true);
    	   if(flag)
    	   {
    		   Reporter.log(" user is Added successfullyt",true);
    	   }
    	   else
    	   {
    		   Reporter.log("user is not Added",true);  
    	   }
    	   
       }
    	     
       }
	


