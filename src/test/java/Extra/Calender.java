package Extra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vilaas\\eclipse-workspace\\ABL\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.redbus.in/");
       Thread.sleep(3000);
		driver.findElement(By.id("onward_cal")).click();

		String abc = "Dec 2022";
		while (true) {

			String g = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();

			if (g.equals(abc)) {
				break;

			} else {
				driver.findElement(By.xpath("//td[@class='monthTitle']/following::td[1]")).click();
			}
		}
driver.findElement(By.xpath("//td[text()='27']")).click();
System.out.println(driver.findElement(By.id("onward_cal")).getAttribute("data-caleng"));

	}

}
