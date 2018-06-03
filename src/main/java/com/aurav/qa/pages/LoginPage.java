package com.aurav.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.aurav.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	
	// First define the Page Factory - Object Repository
	@FindBy(name= "UserName")
	WebElement username;
	
	@FindBy(name= "Password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement LoginButton;
	
	@FindBy(xpath="//a[@class='btn']")
	WebElement SignupButton;
	
	// Initialize the Page Objects
	public LoginPage() {
		// Initialize the Page Factory
		PageFactory.initElements(driver, this);
	}
	
	// Actions
	public String validateLoginpageTitle() {
		return driver.getTitle();
	}
	
	public AdminLandingPage login (String UN, String PWD) {
		username.sendKeys(UN);
		password.sendKeys(PWD);
		LoginButton.click();
		
		return new AdminLandingPage();
	}
	
}
