package Extra;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	static String parents ;
	static String hrm;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vilaas\\eclipse-workspace\\ABL\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://prafpawar11.github.io/multiplewindows.html");
		
		Thread.sleep(2000);
		
		 parents=driver.getWindowHandle();
		
		System.out.println(parents);
		
		driver.findElement(By.xpath("//a[text()='Visit Orange HRM']")).click();
		
		Thread.sleep(2000);

		
		Set<String >allw=driver.getWindowHandles();
		
		for(String abc:allw)
		{
			
			if(!abc.equals(parents))
			{
				driver.switchTo().window(abc);
				System.out.println(driver.getTitle());
				 hrm=driver.getWindowHandle();
				
			}
		}
		
		driver.switchTo().window(parents);
		System.out.println(driver.getTitle());
	driver.findElement(By.xpath("//a[text()='Visit Facebook']")).click();
		Thread.sleep(2000);
		Set<String >allw1=driver.getWindowHandles();
		
		for(String abc1:allw1)
		{
			if(!abc1.equals(parents)  &&  (!abc1.equals(hrm)))
			{
				driver.switchTo().window(abc1);
				System.out.println(driver.getTitle());
			}
		}
		driver.switchTo().window(parents);
		System.out.println(driver.getTitle());
		driver.switchTo().window(hrm);
		System.out.println(driver.getTitle());
	}

}
