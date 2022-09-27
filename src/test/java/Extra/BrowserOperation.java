package Extra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOperation {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vilaas\\eclipse-workspace\\ABL\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.amazon.in/");
		
Thread.sleep(3000);

driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus nord 2");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
Thread.sleep(3000);

String h=driver.findElement(By.xpath("//div[@data-asin='B09RG5R5FG']//span[text()='Save ₹500']")).getText();
System.out.println(h);
	}

}
