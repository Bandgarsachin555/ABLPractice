package TestLayer;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import PageLayer.PimPage;
import UtilsLayer.propertiesData;

public class PimPageTest extends BaseClass{
	@Test(priority=0, groups="login")
	public void browserInitilization() throws IOException
	{
			BaseClass.browser(propertiesData.url(), propertiesData.browser());

	}
	@Test(priority=2, groups="login")
public void login()
{
		LoginPage log=new LoginPage();
		Assert.assertEquals(log.getTitle().contains("OrangeHRM"), true);
		Assert.assertEquals(log.getUrl().contains("orangehrmlive"),true);
}
	@Test(priority=3, groups="login")
	public void credential() throws IOException
	{
		LoginPage log=new LoginPage();
		log.loginpa(propertiesData.unameq(), propertiesData.passs());
	}

	
	
	@Test(priority=4, groups="admin")
	public void admin()
	{
		PimPage log=new PimPage();
		String g=log.PI();
		System.out.println(g);
		Assert.assertEquals(log.equals("Alice.Duval"), false);
		
	}
}
