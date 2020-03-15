package com.freecrm.qa.testpages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.freecrm.qa.base.TestBase;
import com.freecrm.qa.pages.HomePage;
import com.freecrm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	HomePage homePage;
	LoginPage loginPage;
	
	public LoginPageTest() {
		super();

	}
	
	//Test cases should be seperated -- independent with each other
	//If we have 100 test cases and executed all them without closing the browser then we might face issues like coockie issues,
	//cache issues, memory leak issues etc.
	//So always quit the browser after completing the test case and follow @BeforeMethod, @Test, @AfterMethod - which is a very good practice
	//Follow the below approach for every test case which is a very good practice
	//before each test case - launch the browser and login
	//@Test - execute the test case
	//after each test case - close the browser
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		
	}
	
	@Test(priority=0, groups="CRM Login", description="Validating the LoginPage Title", enabled=true)
	public void loginPageTitleTest() {
		
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Cogmento CRM", "The CRM Page title is not correct");
		System.out.println("The page title is displaying as : "+title);
	}
	
	@Test(priority=1, groups="CRM Login", enabled=true, description="Validating the Login Functionality with valid user credentials")
	public void loginTest() {
		
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	
	@AfterMethod
	
	public void quit() {
		tearDown();
	}
	
	

}
