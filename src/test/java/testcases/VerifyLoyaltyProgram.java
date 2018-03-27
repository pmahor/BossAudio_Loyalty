package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.Dataproviderfactory;
import pages.LoyaltyProgram;

public class VerifyLoyaltyProgram 
{
	WebDriver driver;
	LoyaltyProgram loyaltprog;
	
	
	@BeforeTest
	public void setup()
	{
		driver=BrowserFactory.getBrowser("Chrome");
		
		driver.manage().window().maximize();
		
		driver.get(Dataproviderfactory.getConfig().getUrl());
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		loyaltprog=PageFactory.initElements(driver, LoyaltyProgram.class);
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
}
