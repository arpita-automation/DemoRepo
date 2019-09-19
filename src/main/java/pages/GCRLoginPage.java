package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBaseGCR;

public class GCRLoginPage extends TestBaseGCR
{
	//PageFactory

	@FindBy(name="email_address")
	WebElement emailAddTxtBox;
	
	@FindBy(name="password")
	WebElement passwordTxtBox;
	
	@FindBy(xpath = "//button[@id='tdb5']")
	WebElement signInBtn;
	
	@FindBy(xpath = "//a[contains(text(), 'Password forgotten? Click here.')]")
	WebElement frgtPwdLink;
	
	public GCRLoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateLoginPageTitle()
	{
		return driver.getTitle(); 
	}
	
	public GCRCatalogPage login(String uname, String pwd)
	{
		emailAddTxtBox.sendKeys(uname);
		passwordTxtBox.sendKeys(pwd);
		signInBtn.click();
		
		return new GCRCatalogPage();
	}
	
	
	

}
