package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.Dataproviderfactory;
import pages.DashboardPage;
import pages.LoyaltyProgram;

public class VerifyLoyaltyProgram 
{
	WebDriver driver;
	LoyaltyProgram loyaltprog;
	VerifyDashboard dashobj;
	
	
	@BeforeTest
	public void setup()
	{
		driver=BrowserFactory.getBrowser("Chrome");
		
		driver.manage().window().maximize();
		
		driver.get(Dataproviderfactory.getConfig().getUrl());
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		loyaltprog=PageFactory.initElements(driver, LoyaltyProgram.class);
		//dashobj = new VerifyDashboard(driver);
	}
	
	@Test(priority=1)
	public void fbconnecttest()
	{
		loyaltprog.fbconnectaction(Dataproviderfactory.getExceldata().getStringData(0,0),Dataproviderfactory.getExceldata().getStringData(0,1));
	}

	@Test(priority=2)
	public void Twitterconnecttest()
	{
		loyaltprog.tweetconnectaction(Dataproviderfactory.getExceldata().getStringData(0,0),Dataproviderfactory.getExceldata().getStringData(0,3));
	}
	
	@Test(priority=3)
	public void Instagramconnecttest()
	{
		loyaltprog.instconnectaction(Dataproviderfactory.getExceldata().getStringData(0,0),Dataproviderfactory.getExceldata().getStringData(0,2));
	}
	
	@Test(priority=4)
	public void Facebooksharetest()
	{
		loyaltprog.fbshare(Dataproviderfactory.getExceldata().getStringData(0,0),Dataproviderfactory.getExceldata().getStringData(0,1));
	}
	
	@Test(priority=5)
	public void TwitterSharetest()
	{
		loyaltprog.Twittershare(Dataproviderfactory.getExceldata().getStringData(0,0),Dataproviderfactory.getExceldata().getStringData(0,3));
	}
	
	
	@Test(priority=6)
	public void Emailsharing()
	{
		loyaltprog.Emailshare(Dataproviderfactory.getExceldata().getStringData(0,0),Dataproviderfactory.getExceldata().getStringData(1,0));
	}
	
	
	
}
