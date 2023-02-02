package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	
	// By Locator - OR
	private By emailId=By.id("input-email");
	private By password= By.id("input-password");
	private By loginBtn=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
	private By forgotPwdLink=By.linkText("Forgotten Password");
	
	
	// 2.Page class constructor
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	// 3.Page Actions
	public String getLoginPageTitle() {
		String title= driver.getTitle();
		System.out.println("Login page Title:"+title);
		return title;
	}
	
	
	public String getLoginPageUrl() {
		
		String url= driver.getCurrentUrl();
		System.out.println("Current Url:"+url);
		return url;		
	}
	
	public boolean isForgotPwdLinkExist() {
		
		return driver.findElement(forgotPwdLink).isDisplayed();
		
	}
	
	public String doLogin(String username,String pwd) throws InterruptedException {
		
		System.out.println("app creds:" +username  +pwd);
		driver.findElement(emailId).sendKeys(username);
		driver.findElement(password).sendKeys(pwd);
		Thread.sleep(20);
		driver.findElement(loginBtn).click(); 
		return driver.getTitle();
			
	}
	
}
