package UtilsLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertiesData {
	public static Properties prop;
	
	public static void  login() throws IOException 
	{
		 prop=new Properties();
		
		FileInputStream p= new FileInputStream("C:\\Users\\vilaas\\eclipse-workspace\\ABL\\src\\main\\java\\TestDataLayer\\data.properties");
		
		prop.load(p);
		
	}
	public static String url() throws IOException
	{
		login();
		return prop.getProperty("url");
	}
	public static String browser() throws IOException
	{
		login();
		return prop.getProperty("browser");
	}
	
	public static String unameq() throws IOException
	{
		login();
		return prop.getProperty("uname");
	}
	public static String passs() throws IOException
	{
		login();
		return prop.getProperty("pass");
	}
}
