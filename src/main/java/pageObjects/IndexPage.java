package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actionDriver.Action;
import base.BaseClass;


public class IndexPage extends BaseClass {
	
	
	@FindBy(xpath="//*[@name='search_query']") WebElement searchBox;
	
	@FindBy(name="submit_search") WebElement submitBtn;
	
	@FindBy(className="login") WebElement signinBtn;
	
	@FindBy(xpath="//*[text()='Authentication']") WebElement authentication;
	
	@FindBy(xpath="//*[@class='logo img-responsive']") WebElement logo;
	
	
	public IndexPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	
	public LoginPage clickOnSignin() {
		Action.click(driver, signinBtn);
		return new LoginPage();
	}
	
	public Boolean verifySigninPage() {
		Boolean resultAuth = Action.isDisplayed(authentication);
		return resultAuth;
	}
	
	public String getTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	public SearchResultsPage getSearch(String searchItemName) {
		Action.type(searchBox, searchItemName);
		Action.click(driver, submitBtn);
		return new SearchResultsPage();
	}
	
	public Boolean getLogo() {
		Boolean pageLogo = Action.isDisplayed(logo);
		return pageLogo;
	}

}
