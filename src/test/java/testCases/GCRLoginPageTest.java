package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBaseGCR;
import pages.GCRCatalogPage;
import pages.GCRLoginPage;

public class GCRLoginPageTest extends TestBaseGCR
{
	GCRLoginPage loginPage;
	GCRCatalogPage catalogPage;
		
	public GCRLoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialise();
		loginPage = new GCRLoginPage();
	}
	
	@Test(priority = 1)
	public void validateLoginPageTitleTest()
	{
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "GCR Shop" , "Login page title not matched");
	}
	
	@Test(priority = 2)
	public void loginTest()
	{
		catalogPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

}
