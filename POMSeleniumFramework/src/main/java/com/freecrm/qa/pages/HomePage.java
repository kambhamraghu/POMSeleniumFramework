package com.freecrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.qa.base.TestBase;


/**
 * @author natarajan
 *
 */
/**
 * @author natarajan
 *
 */
public class HomePage extends TestBase{
	
	
	
	//Page Objects / webelements of HomePage
	
	@FindBy(xpath="//span[contains(@class,'user-display') and contains(text(), 'test1 new')]")
	WebElement loggedInUsrName;
	
	@FindBy(xpath="//span[contains(@class,'item-text') and contains(text(), 'Contacts' )]")
	WebElement homeContactsLink;
	
	@FindBy(xpath="//span[contains(@class,'item-text') and contains(text(), 'Deals' )]")
	WebElement homeDealssLink;
	
	@FindBy(xpath="//span[contains(@class,'item-text') and contains(text(), 'Tasks' )]")
	WebElement homeTasksLink;
	
	
	//Initializing the Page Objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	//Actions / Methods
	public String verityHomePageTitle() {
		return driver.getTitle();
		
	}
	
	public boolean verifyUsrName() {
		return loggedInUsrName.isDisplayed();
	}

	public ContactsPage clickOnContactsLink() {
		homeContactsLink.click();
		return new ContactsPage();
		
	}
	
	public DealsPage clickOnDealsLink() {
		homeDealssLink.click();
		return new DealsPage();
		
	}
	
	public TasksPage clickOnTasksLink() {
		
		homeTasksLink.click();
		return new TasksPage();
		
	}
	
	
	
}
