package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static Properties pro;
	public static WebDriver driver;
	
	
	@BeforeTest
	public void loadConfig() throws IOException {
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\Configuration\\Config.propertise");
		pro=new Properties();
		pro.load(fis);	
	}
	
	
	public static void launchApp() {
		
		String browserName = pro.getProperty("browser");
		System.out.println("Browser name is: "+browserName);
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pro.getProperty("URL"));
	}
	
	
	public static void closeBrowser() {
		driver.quit();
	}

}
