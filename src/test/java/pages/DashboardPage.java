package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.Dataproviderfactory;
import utility.Library;

public class DashboardPage
{
	WebDriver driver;
	@FindBy(xpath=".//*[@class='loyimgr']") WebElement loginbtn;
	@FindBy(xpath="//input[@id='input_27_3']") WebElement Emailaddr;
	@FindBy(xpath="//input[@id='input_27_2']") WebElement Emailpass;
	
	@FindBy(xpath="//input[@id='gform_submit_button_27']") WebElement loginbtn1;
	
	public DashboardPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void login()
	{
		
		try
		{
			Thread.sleep(5000);
			loginbtn.click();
			Thread.sleep(5000);
			Emailaddr.sendKeys(Dataproviderfactory.getExceldata().getStringData(1,0));
			Emailpass.sendKeys(Dataproviderfactory.getExceldata().getStringData(1,2));
			
			loginbtn1.click();
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript("window.scrollBy(0,500)");
			 
			 driver.switchTo().frame("s15-dashboard-iframe");
			 Thread.sleep(5000);

			
		} 
		catch (InterruptedException e)
		{
			
			e.printStackTrace();
		}
	}
	
	@FindBy(xpath="//a[@id='isActive']") WebElement Earntabbtn;
	@FindBy(xpath="//a[@id='sa_mng']") WebElement Rewardtabbtn;
	@FindBy(xpath="//a[@id='sa_history']") WebElement Activitytabbtn;
	
	public void Earntab()
	{
		
		
		try 
		{
			Thread.sleep(5000);
			Earntabbtn.click();
			Thread.sleep(5000);
			Library.takescreensnap(driver, "EarnTab");
		} 
		catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}
	}
	public void Rewardtab()
	{
		try 
		{
			
		Thread.sleep(5000);
		Rewardtabbtn.click();
		Thread.sleep(5000);
		Library.takescreensnap(driver, "RewardTab");
		
		} 
		catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}
		
	}
	public void Activitytab()
	{
		try 
		{
			
		Thread.sleep(5000);
		Activitytabbtn.click();
		Thread.sleep(5000);
		Library.takescreensnap(driver, "ActivityTab");
		
		} 
		catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}
	}

}
