package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.Dataproviderfactory;
import pages.DashboardPage;

public class VerifyDashboard
{
	WebDriver driver ;
	DashboardPage dashboardobj;
	
	public VerifyDashboard(WebDriver driver) 
	{
		this.driver=driver;
		dashboardobj=PageFactory.initElements(driver, DashboardPage.class);
	}
	
	/*@BeforeTest
	public void setup()
	{
		driver=BrowserFactory.getBrowser("Chrome");
				
		driver.manage().window().maximize();
		
		driver.get(Dataproviderfactory.getConfig().getUrl());
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		dashboardobj=PageFactory.initElements(driver, DashboardPage.class);
	}*/
	
		
	@Test(priority=7)
	public void testLogin()
	{
		dashboardobj.login();
		
	}
	
	@Test(priority=8)
	public void testEarnTab()
	{
		dashboardobj.Earntab();
		
	}
	
	@Test(priority=9)
	public void testRewardTab()
	{
		dashboardobj.Rewardtab();
		
	}
	
	@Test(priority=10)
	public void testActivity()
	{
		dashboardobj.Activitytab();
	}
	

}
