package Extra;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JAVAScript {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vilaas\\eclipse-workspace\\ABL\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//open URL
		js.executeScript("window.location='https://opensource-demo.orangehrmlive.com/web/index.php/auth/login';");
		
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Sachin");
		
		
			//Send keys name	
		WebElement wb1=driver.findElement(By.name("password"));
		
		js.executeScript("arguments[0].value='sam';",wb1);
		Thread.sleep(3000);
		
		//js.executeScript("document.getElementById('').click();");
		//click
		WebElement wb=driver.findElement(By.xpath("//button[@type='submit']"));
		js.executeScript("arguments[0].click();", wb);
		
		
	}

}
