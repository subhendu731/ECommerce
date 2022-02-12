package testCases;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.BaseClass;
import pageObjects.MyAccount;

public class MyAccountTest extends BaseClass{
	
	@BeforeMethod
	public void setUp() {
		launchApp();
	}

	@AfterMethod
	public void tearDown() {
		closeBrowser();
	}

	
	
	public void verifyCustomer() {
		MyAccount mc=new MyAccount();
		mc.getSignin();
		String ActualUserName = mc.getUserName();
		Assert.assertEquals(ActualUserName, pro.getProperty("expectedUserName"));
	}

	@Test
	public void verifyTabs() {
		MyAccount mc=new MyAccount();
		mc.getSignin();
		Object actualList = mc.myAccountTabs();
		
		ArrayList<String> e=new ArrayList<String>();
		e.add("ORDER HISTORY AND DETAILS");
		e.add("MY CREDIT SLIPS");
		e.add("MY ADDRESSES");
		e.add("MY PERSONAL INFORMATION");
		
		boolean result = actualList.equals(e);
		Assert.assertTrue(result);
	}
	
}
