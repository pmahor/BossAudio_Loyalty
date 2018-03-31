package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import pages.BitlyExecution;


public class VerifyBitly 
{
	WebDriver driver;
	BitlyExecution bitlyexec;

	@BeforeTest
	public void setup()
	{
		driver=BrowserFactory.getBrowser("Chrome");
		driver.manage().window().maximize();

		bitlyexec=PageFactory.initElements(driver, BitlyExecution.class);
	}
	
	
	/*@Test(priority=1)
	public void FacebbokBitlyExecution()
	{
		bitlyexec.fbbitly();
	}
	
	@Test(priority=2)
	public void TwitterBitlyexecution()
	{
		bitlyexec.Twitterbitly();
	}*/
	
	@Test(priority=1)
	public void emailBitlyexecution()
	{
		bitlyexec.Emailbitly();
	}
	
}
