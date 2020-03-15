package com.freecrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.freecrm.qa.base.TestBase;

public class ContactsPage extends TestBase{
	
	
	@FindBy(xpath="//*[contains(@class,'ui header item mb5 light-black') ]")
	WebElement contactsLabel;
	

	
	

}
