package com.freecrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	
	//Identifying the page objects / WebElements
	
	@FindBy(name="email")
	WebElement txtusername;
	
	@FindBy(name="password")
	WebElement txtpassword;
	
	@FindBy(xpath="//*[@class='ui fluid large blue submit button']")
	WebElement btnLogin;
	
	
	@FindBy(xpath="//*[contains(text(),'Sign Up')]")
	WebElement btnSignUp;
	
	
	//Initializing the page objects / webelements by using the PageFactory initElements() method
	//constructor
	
	public LoginPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions / Methods add
	
	public String validateLoginPageTitle() {
		
		return driver.getTitle();
	}
	
	
	public HomePage login(String un, String pwd) {
		
		txtusername.sendKeys(un);		
		txtpassword.sendKeys(pwd);		
		btnLogin.click();
		//After successful login, the user should navigate to the homepage, which means
		//the login page is giving the homepage object
		return new HomePage();
	}

}
