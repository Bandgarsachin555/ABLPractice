package Extra;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alert1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vilaas\\eclipse-workspace\\ABL\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/vilaas/Desktop/Automation%20Class/Selenium/Class%20Practice%20HTML%20code/alertPopUp.html");

		driver.findElement(By.xpath("//body/div/button")).click();
Thread.sleep(3000);
		Alert al=driver.switchTo().alert();
		al.sendKeys("sachin");
		String g=al.getText();
		System.out.println(g);
		al.accept();
		al.accept();
	}

}
