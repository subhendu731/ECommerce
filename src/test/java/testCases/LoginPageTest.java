package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.LoginPage;

public class LoginPageTest extends BaseClass{

	@BeforeMethod
	public void setUp() {
		launchApp();
	}

	@AfterMethod
	public void tearDown() {
		closeBrowser();
	}

	
	@Test
	public void verifySignin() {
		LoginPage lp=new LoginPage();
		lp.signin();
		String actualWelcomeText = lp.getTitle();
		Assert.assertEquals(actualWelcomeText, pro.getProperty("expectedWelcomeText"));
	}

}
