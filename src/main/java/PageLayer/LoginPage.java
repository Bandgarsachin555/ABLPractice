package PageLayer;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.Screenshot;
import net.jodah.failsafe.internal.util.Assert;

public class LoginPage extends BaseClass {

@FindBy(xpath="//input[@name='username']")
WebElement username;

@FindBy(xpath="//input[@name='password']")
WebElement password;

@FindBy(xpath="//button[@type='submit']")
WebElement submit;
	
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	public String getUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public void loginpa(String uname,String pass)
	{
		
		username.sendKeys(uname);
		password.sendKeys(pass);
		Screenshot.screen("Loginpage");
		submit.click();
	}
	
}
