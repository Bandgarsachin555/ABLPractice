package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import UtilsLayer.propertiesData;

public class BaseClass {

	public static WebDriver driver;
	public static void browser(String Url, String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vilaas\\eclipse-workspace\\ABL\\Drivers\\chromedriver.exe");
		
          driver =new ChromeDriver();
		
		driver.get(Url);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}	
	}
}
