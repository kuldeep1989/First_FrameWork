package com.aurav.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aurav.qa.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties property;
	
	// Create a constructor and read the configuration property file
	public TestBase() {
		
		try {
			property = new Properties();
			FileInputStream ip = new FileInputStream("E:\\jee-oxygen\\eclipse-workspace\\AuravTest\\src\\main\\java\\com\\aurav\\qa\\config\\config.properties");
			property.load(ip);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}				
	}
	
	//  Browser Initialization
	public static void initialization() {
		String browsername = property.getProperty("browser");
		
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\jee-oxygen\\eclipse-workspace\\jars\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else {
			System.setProperty("webdriver.gecko.driver", "");
			driver = new FirefoxDriver();
		} 
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		String LaunchURL = property.getProperty("url");
		driver.get(LaunchURL);

	}
	
}