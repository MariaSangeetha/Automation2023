package com.qa.opencart.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.pages.LoginPage;

public class BaseTest {
	
	public WebDriver driver;
	public DriverFactory df;
	public LoginPage loginPage;
	public Properties prop;
	
	@BeforeTest
	public void setup() {
		
		df=new DriverFactory();
		prop= df.initProp();
		//String browserName=(String) prop.get("browser");
		
		driver=df.initDriver("prop");
		loginPage=new LoginPage(driver);
		
		
		
	}
	@AfterTest
	public void tearDown() {
		
	}
	
	

}
