package Extra;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Links {

	public static void main(String[] args) throws IOException, InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vilaas\\eclipse-workspace\\ABL\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		List<WebElement> u=driver.findElements(By.tagName("a"));
		
	     for(WebElement abc:u)
	     {
	    	 String links=abc.getAttribute("href");
	    	 
	    	 if(links==null || links.isEmpty())
	    	 {
	    		 System.out.println("URL is empty"+ abc.getText());
	    	 }
	    	 
	    	 URL link;
			try {
				link = new URL(links);
				 HttpURLConnection con=(HttpURLConnection) link.openConnection();
				 con.connect();
				 if(con.getResponseCode()>=400)
		    	 {
		    		 System.out.println(con.getResponseCode()+links+" brocken link");
		    	 }
		    	 
		    	 
				
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	 
	    	
	    	 
	    	 
	    	 
	    	 
	     }
	}

}
