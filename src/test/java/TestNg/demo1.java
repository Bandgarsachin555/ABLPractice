package TestNg;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

@Test
public class demo1 {
	
	WebDriver driver;

	public void abc()
	{
		String a="rescue";
		String b="secure";
		
		if(a.length()==b.length())
		{
			char[] g=a.toCharArray();
		char[]gg=	b.toCharArray();
       Arrays.sort(g);
		Arrays.sort(gg);
		
			if(Arrays.equals(g, gg))
			{
				System.out.println("this is  anagram");
			}
			else
			{
				System.out.println("this is not anagram");
			}
			
		}
		else
		{
			System.out.println("this is not anagram1");
		}
	}
	
}

	
	
	












