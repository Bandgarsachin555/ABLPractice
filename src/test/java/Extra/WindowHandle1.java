package Extra;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\vilaas\\eclipse-workspace\\ABL\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://prafpawar11.github.io/multiplewindows.html");
		
driver.findElement(By.xpath("//a[text()='Visit Orange HRM']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Visit Facebook']")).click();
		Thread.sleep(2000);
		
		Set<String>se=driver.getWindowHandles();

                ArrayList<String>arr=new ArrayList<String>(se);
                
               System.out.println(driver.switchTo().window(arr.get(1)));
               System.out.println(driver.getTitle());
               System.out.println(driver.switchTo().window(arr.get(0)));
               System.out.println(driver.getTitle());
               System.out.println(driver.switchTo().window(arr.get(2)));
               System.out.println(driver.getTitle());
               
	}

}
