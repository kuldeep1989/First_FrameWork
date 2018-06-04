package com.aurav.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aurav.qa.base.TestBase;
import com.aurav.qa.pages.AdminLandingPage;
import com.aurav.qa.pages.LoginPage;

public class AdminLandingPageTest extends TestBase {
	
	AdminLandingPage LandingPage;
	
	public AdminLandingPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {	
		initialization();
		LandingPage = new AdminLandingPage();
	}

	@Test
	public void clickToggle() {
		
	}
	
	
	

}
