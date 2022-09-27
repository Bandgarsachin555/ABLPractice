package PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class PimPage extends BaseClass {

	@FindBy(xpath="//a[contains(@href,'viewAdminModule')]")
	WebElement Admin;
	
	@FindBy(xpath="//div[@role='table']/div[2]/div[2] /following::div[1]/div[1]/div[2]/div")
	WebElement name;
	
	public PimPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String PI()
	{
		Admin.click();
		return name.getText();
	}
}
