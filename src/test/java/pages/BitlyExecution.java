package pages;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.Dataproviderfactory;
import utility.Library;

public class BitlyExecution 
{
	WebDriver driver;
	
	@FindBy(id="email") WebElement emailaddr;
	@FindBy(id="pass") WebElement emailpass;
	@FindBy(id="loginbutton") WebElement loginbtn;
	@FindBy(xpath="//a[@title='Profile']") WebElement fbprofile; 
	@FindBy(xpath="//div[@class='_6l- __c_']") WebElement fbbitly;
	
	public BitlyExecution(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void fbbitly()
	{
		try 
		{
			
		System.out.println("login to facebook");
		driver.get(Dataproviderfactory.getConfig().getfbUrl());
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(10000);		
		
		emailaddr.sendKeys(Dataproviderfactory.getExceldata().getStringData(0,0));
		//loyaltprog=PageFactory.initElements(driver, LoyaltyProgram.class);
		emailpass.sendKeys(Dataproviderfactory.getExceldata().getStringData(0,1));
		loginbtn.click();
		
		Thread.sleep(10000);
		fbprofile.click();
		Thread.sleep(10000);
		fbbitly.click();
		Thread.sleep(10000);
		
		//To take screenshot after bitly execution
		String parentwindow=driver.getWindowHandle();
		Set<String> winHandles=driver.getWindowHandles();
		for(String winHandl : winHandles)
		{
			driver.switchTo().window(winHandl);
		}
		Thread.sleep(5000);
		Library.takescreensnap(driver, "Dashboard");
		System.out.println("Facebook Bitly Execution Completed......................");
			
		}
		catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}
				
	}
	
	
	@FindBy(xpath="//input[@class='js-username-field email-input js-initial-focus']") WebElement TwEmail; 
	@FindBy(xpath="//input[@class='js-password-field']") WebElement Twpass;
	@FindBy(xpath="//button[@class='submit EdgeButton EdgeButton--primary EdgeButtom--medium']") WebElement Twloginbtn;
	
	@FindBy(xpath="//a[@class='ProfileCardStats-statLink u-textUserColor u-linkClean u-block js-nav js-tooltip']") WebElement Twprofilelink;
	@FindBy(xpath="//span[contains(.,'goo.gl/qaiwDL')]") WebElement Twitbitlyclick ;
	
	
	public void Twitterbitly()
	{
		try
		{
			System.out.println("clicking on twitterbitly");
			driver.get(Dataproviderfactory.getConfig().getTwitterUrl());
			Thread.sleep(10000); 
			
			TwEmail.sendKeys(Dataproviderfactory.getExceldata().getStringData(0,0));
			Twpass.sendKeys(Dataproviderfactory.getExceldata().getStringData(0,3));
			Twloginbtn.click();
			Thread.sleep(10000);
			
			Twprofilelink.click();
			Thread.sleep(10000);
			Twitbitlyclick.click();
			
			Thread.sleep(10000);
			
			//To take screenshot after bitly execution
			String parentwindow=driver.getWindowHandle();
			Set<String> winHandles=driver.getWindowHandles();
			for(String winHandl : winHandles)
			{
				driver.switchTo().window(winHandl);
			}
			Thread.sleep(5000);
			Library.takescreensnap(driver, "DashboardTwitterbitlyrun");
			System.out.println("Twitter Bitly Execution Completed......................");
				
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	
	
	@FindBy(xpath=".//*[@id='identifierId']") WebElement gmEmail; 
	@FindBy(xpath=".//*[@id='identifierNext']/content/span") WebElement gmnextbtn;
	
	@FindBy(xpath=".//*[@id='password']/div[1]/div/div[1]/input") WebElement passwd;
	@FindBy(xpath=".//*[@id='passwordNext']/content/span") WebElement gmnectbtn2;
	
	@FindBy(xpath="//div[@id=':l9']") WebElement promail;
	@FindBy(xpath="//span[@id=':g1']") WebElement mailclick;
	
	@FindBy(xpath="//*[@id=':1ck']/table/tbody/tr[5]/td/a") WebElement gmailbitclick;
	
	
	public void Emailbitly()
	{
		try 
		{				
			System.out.println("clicking on emailbitly");
			driver.get(Dataproviderfactory.getConfig().getGmailUrl());
			
			Thread.sleep(10000);
			
			gmEmail.sendKeys(Dataproviderfactory.getExceldata().getStringData(3,0));
			gmnextbtn.click();
			Thread.sleep(10000);
			
			passwd.sendKeys(Dataproviderfactory.getExceldata().getStringData(3,2));
			gmnectbtn2.click();
			Thread.sleep(5000);
			
			promail.click();
			Thread.sleep(10000);
			mailclick.click();
			
			Thread.sleep(10000);
			gmailbitclick.click();
						
				
		} 
		catch (InterruptedException e)
		{				
				e.printStackTrace();
		}
		
		}
	

}
