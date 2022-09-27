package Extra;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vilaas\\eclipse-workspace\\ABL\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		
		
          driver.get("https://en-gb.facebook.com/reg");
          Thread.sleep(3000);
          WebElement n=driver.findElement(By.name("firstname"));
          Actions act=new Actions(driver);
          
          act.sendKeys(n,"sachin").sendKeys(Keys.TAB).sendKeys("mavv").build().perform();
          act.sendKeys(Keys.TAB).keyDown(Keys.SHIFT).sendKeys("abc@ggh").build().perform();
          
         
          act.keyDown(Keys.CONTROL).sendKeys(Keys.END).keyUp(Keys.CONTROL).build().perform();
          Thread.sleep(3000);
          act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).keyUp(Keys.CONTROL).build().perform();
	}
}
