/**
 *
 */
package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actionDriver.Action;
import base.BaseClass;


public class LoginPage extends BaseClass{

	@FindBy(id="email") WebElement email;
	@FindBy(id="passwd") WebElement password;
	@FindBy(id="SubmitLogin") WebElement submitLogin;
	@FindBy(className="info-account") WebElement welcomeText;
	
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}

	
	public MyAccount signin() {
		IndexPage ip=new IndexPage();
		ip.clickOnSignin();		
		Action.type(email, pro.getProperty("emailAddress"));
		Action.type(password, pro.getProperty("password"));
		Action.click(driver, submitLogin);
		return new MyAccount();
	}
	
	public String getTitle() {
		String result = welcomeText.getText();
		return result;
		
	}
	
}
