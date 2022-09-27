package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {

	WebDriver driver;
	@Parameters("sachin")
	@Test
	public void abc1(String email)
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(email);
	}
	@Parameters("Bandgarsachin@555")
	@Test
	public void abc(String email)
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("email")).sendKeys(email);
	}

}
