package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.constants.AppConstants;
import com.qa.opencart.pages.LoginPage;

public class LoginPageTest extends BaseTest {

	@Test
	public void loginPagetitleTest() {
	String actTitle=loginPage.getLoginPageTitle();
	Assert.assertEquals(actTitle, AppConstants.LOGIN_PAGE_TITLE);
					
	}
	
	@Test
	public void loginPageUrlTest() {
		String actUrl=loginPage.getLoginPageUrl();
		Assert.assertEquals(actUrl.contains(AppConstants.LOGIN_PAGE_URL_FRACTION),true);
	}
	
	@Test
	public void forgotPwdLinkExistTest() {
		Assert.assertEquals(loginPage.isForgotPwdLinkExist(),true);	
	}
	
	@Test
public void loginTest() throws InterruptedException {
		String homeTitle=loginPage.doLogin(prop.getProperty("username"),prop.getProperty("passowrd"));
		Assert.assertEquals(homeTitle, AppConstants.ACCOUNTS_PAGE_TILTE);
}
	
	
}
