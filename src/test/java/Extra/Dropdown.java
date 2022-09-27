package Extra;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void day(WebElement day,String date)
	{
		Select sl =new Select(day);
		sl.selectByVisibleText(date);
		WebElement s=sl.getFirstSelectedOption();
		System.out.println(s.getText());
		List<WebElement>all=sl.getOptions();
		
		for(WebElement abd:all)
		{
			System.out.println(abd.getText());
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vilaas\\eclipse-workspace\\ABL\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/reg");
		Thread.sleep(3000);
WebElement day=driver.findElement(By.xpath("//Select[@name='birthday_day']"));
WebElement month=driver.findElement(By.xpath("//Select[@name='birthday_month']"));

WebElement year=driver.findElement(By.xpath("//Select[@name='birthday_year']"));
Dropdown.day(day, "25");
Dropdown.day(month, "Jan");
Dropdown.day(year, "2018");


	}

}
