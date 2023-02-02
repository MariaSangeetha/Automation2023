package com.qa.opencart.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This method is used to initialize driver on the basis og given browser
 * @param browserName
 *@return this returns driver
 */

public class DriverFactory {
	
	public WebDriver driver;
	public Properties prop; 
	//public String browserName;
	
	public WebDriver initDriver(Properties prop) {
	  String browserName=prop.getProperty("browser");
			
		System.out.println("Browser Name is "+browserName);
		
		if(browserName.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("edge")) {
		WebDriverManager.chromedriver().setup();
		driver=new EdgeDriver();
		}
		
		else {
			System.out.println("Please pass the right browser");
		}
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Properties string = null;
		driver.get(string.getProperty("url"));
	 return driver;
	
	}
	/**
	 * 
	 * @return this return that Properties reference with config properties
	 */
	public Properties initProp() {
		
           prop = new Properties();
		
		try {
			FileInputStream ip = new FileInputStream("./src\\TestResources\\config\\config.properties");
			prop.load(ip);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}

	
}
