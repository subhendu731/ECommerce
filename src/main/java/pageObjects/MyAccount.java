package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.BaseClass;

public class MyAccount extends BaseClass{

	@FindBy(xpath="//*[@class='account']/span") WebElement customerName;
	@FindBy(xpath="//*[@class='row addresses-lists']/div[1]/ul/li") List<WebElement> allTabs;
	
	public MyAccount() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void getSignin() {
		LoginPage lp=new LoginPage();
		lp.signin();	
	}
	
	public String getUserName() {
		String actualUserName = customerName.getText();
		return actualUserName;
	}
	
	public Object myAccountTabs() {
		ArrayList<String> a=new ArrayList<String>();
		for(WebElement tab:allTabs) {
			String TabName = tab.getText();
			a.add(TabName);
		}
		return a;
	}
	
}
