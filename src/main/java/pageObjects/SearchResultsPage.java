package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import actionDriver.Action;
import base.BaseClass;

public class SearchResultsPage extends BaseClass{
	
	@FindBy(xpath="//*[contains(text(),'Sleeve T-shirts')]") WebElement searchProduct;
	
	public SearchResultsPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public Boolean productAvailablity() {
		return Action.isDisplayed(searchProduct);
	}
	
}
