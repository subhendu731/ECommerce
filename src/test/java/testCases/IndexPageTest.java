package testCases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.IndexPage;


public class IndexPageTest extends BaseClass{
	
	@BeforeMethod
	public void setUp() {
		launchApp();
	}
	@AfterMethod
	public void tearDown() {
		closeBrowser();
	}
	
	
	
	
	public void verifyTitle() {
		IndexPage indexPage=new IndexPage();
		String actualTitle = indexPage.getTitle();
		Assert.assertEquals(actualTitle, pro.getProperty("expectedTitle"));
	}
	
	
	public void verifyLogo() {
		IndexPage indexPage=new IndexPage();
		Boolean result = indexPage.getLogo();
		Assert.assertTrue(result);
		
	}
	
	@Test
	public void launchSigninPage() {
		IndexPage indexPage=new IndexPage();
		indexPage.clickOnSignin();
		Boolean result = indexPage.verifySigninPage();
		Assert.assertTrue(result);
	}
	

}
