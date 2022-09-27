package UtilsLayer;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClass;

public class Screenshot extends BaseClass {

	
	public static void screen(String path)
	{
		TakesScreenshot tk=(TakesScreenshot)driver;
		File f=tk.getScreenshotAs(OutputType.FILE);
		
		File dist=new File("C:\\Users\\vilaas\\eclipse-workspace\\ABL\\test-output"+System.currentTimeMillis()+path+".png");
		
		try {
			
			FileUtils.copyFile(f, dist);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
