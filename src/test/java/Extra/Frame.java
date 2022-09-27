package Extra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vilaas\\eclipse-workspace\\ABL\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		driver.switchTo().frame("packageFrame");
		
		
		driver.findElement(By.xpath("//a[text()='Actions']")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("classFrame");
		String f=driver.findElement(By.xpath("//a[text()='org.openqa.selenium.interactions']")).getText();
		System.out.println(f);
	}

}
