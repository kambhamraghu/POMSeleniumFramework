package com.freecrm.qa.testpages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.freecrm.qa.base.TestBase;
import com.freecrm.qa.pages.ContactsPage;
import com.freecrm.qa.pages.HomePage;
import com.freecrm.qa.pages.LoginPage;
//import com.freecrm.qa.util.TestUtil;

public class HomePageTest extends TestBase{
	//TestUtil testUtil;
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	public HomePageTest() {
		super();
		
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		//testUtil = new TestUtil();
		//To navigate to the homepage first we need to login to the application
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	
	@Test(priority=0)
	public void validateHomePageTitleTest() {
		String homePageTitle = homePage.verityHomePageTitle();
		Assert.assertEquals(homePageTitle, "Cogmento CRM", "The title is not displaying correctly on HomePage");
				System.out.println("The title of HomePage is: "+homePageTitle);
		
	}
	
	
	@Test(priority=1)
	public void verifyUserNameTest() {
		//testUtil.switchToFrame();
		Assert.assertTrue(homePage.verifyUsrName());
		System.out.println("The logged in UserName is: "+homePage.verifyUsrName());	
		
	
	}
	
	@Test(priority=2)
	public void verifyContactsLinkTest() {
		contactsPage = homePage.clickOnContactsLink();
		
		
	}
	
	
	@AfterMethod
	public void quit() {
		
		tearDown();
	}

}
