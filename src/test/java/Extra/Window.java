package Extra;



import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Window {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vilaas\\eclipse-workspace\\ABL\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/reg");
		Thread.sleep(3000);
		
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement g1=w.until(ExpectedConditions.elementToBeClickable(By.id("")));
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.manage().window().fullscreen();
        driver.manage().window().minimize();
        driver.manage().window().fullscreen();
         
     Dimension g= driver.manage().window().getSize();
     System.out.println(g.getWidth());
  System.out.println(g.getHeight());
        
        
        
	}

}
