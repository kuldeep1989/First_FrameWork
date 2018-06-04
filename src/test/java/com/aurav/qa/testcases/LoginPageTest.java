package com.aurav.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aurav.qa.base.TestBase;
import com.aurav.qa.pages.AdminLandingPage;
import com.aurav.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
		
		LoginPage loginPage;
		AdminLandingPage Landingpage;
		
		// It will call Super Class Constructor
		public LoginPageTest() {
			super();
		}
	
		@BeforeMethod
		public void setUp() {	
			initialization();
			loginPage = new LoginPage();
		}
		
		@Test
		public void loginTest() {
			Landingpage = loginPage.login(property.getProperty("Username"), property.getProperty("Password"));
		}
		
		@AfterMethod
		public void tearDown () {
			driver.quit();
		}
		
}
