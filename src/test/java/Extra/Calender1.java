package Extra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender1 {
	public static WebDriver driver ;
	public static void m(String month, String date )
	{
		while(true)
		{
			String h=driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[2]/div[1]")).getText();
			if(h.equals(month))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
		driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[2]//p[text()='"+date+"']")).click();
		
		driver.findElement(By.xpath("//span[text()='Done']")).click();
	}
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vilaas\\eclipse-workspace\\ABL\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//span[text()='Departure']/following::p[1]")).click();
		
		Calender1.m("December 2022", "19");
		
		
	}

}
