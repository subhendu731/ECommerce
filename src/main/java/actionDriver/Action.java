package actionDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.BaseClass;

public class Action extends BaseClass {


	public static void click(WebDriver driver, WebElement locatorName) {
		Actions action=new Actions(driver);
		action.moveToElement(locatorName).click().build().perform();
	}

	public static void type(WebElement locatorName, String text) {
		locatorName.sendKeys(text);
	}

	public static Boolean isDisplayed(WebElement locatorName) {
		return locatorName.isDisplayed();
	}







}
