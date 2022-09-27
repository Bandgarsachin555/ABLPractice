package Extra;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptE1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vilaas\\eclipse-workspace\\ABL\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		
		ex.executeScript("window.location='https://www.amazon.com/';");
		Thread.sleep(3000);
		
		
		//ex.executeScript("alert('mav');");
		//Thread.sleep(3000);
		ex.executeScript("window.scrollBy(0,500);");
		

	}

}
