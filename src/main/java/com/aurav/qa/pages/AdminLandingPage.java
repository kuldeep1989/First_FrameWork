package com.aurav.qa.pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aurav.qa.base.TestBase;

public class AdminLandingPage extends TestBase {

	@FindBy(xpath = "//div[@class='opt']/ul/li[contains(text(),'Welcome! User Admin')]")
	WebElement WelcomeMessage;
	
	@FindBy (xpath = "//nav[@class=\"main\"]/div/ul/li/a")
	List<WebElement> Navigationlinks;	
	
	@FindBy(xpath = "//div[@class='opt']/ul/li/label[@for = \"Toggle\"]")
	WebElement Togglelink;
	
	
	// Initialize the Page Object
	public AdminLandingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void verifyWelcomeMessage()  {
		driver.get("WelcomeMessage");
	}
	
	
}