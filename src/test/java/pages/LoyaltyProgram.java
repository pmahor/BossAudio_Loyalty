package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Library;

public class LoyaltyProgram 
{

	WebDriver driver;
	
	@FindBy(xpath="//input[@id='sa_s26_fb_login_button']") WebElement Fbsharingbtn;
	@FindBy(xpath="//input[@id='sa-tf-button']") WebElement Twisharingbtn;
	@FindBy(xpath="//input[@id='sa-s25-email-button']")	WebElement emailsharingbtn;
	
	//Fbconnect action
	@FindBy(xpath="//input[@id='sa_s12_loaded_widget']") WebElement fbconnectbtn;
	@FindBy(xpath="//input[@id='sa_s12_fblogin_button']") WebElement fbconnectfbloginbtn;
	@FindBy(xpath="//input[@id='email']") WebElement fbemailaddr;
	@FindBy(xpath="//input[@id='pass']") WebElement fbpasswd;
	@FindBy(xpath="//input[@id='u_0_0']") WebElement fbloginbtn;
	@FindBy(xpath="//input[@id='sa_s12_fb_confirm_email']") WebElement fbintermediateemailaddr;
	@FindBy(xpath="//input[@id='sa_s12_fb_cont_button']") WebElement fbintermediateesubmitbtn;
	@FindBy(xpath="//a[@id='sa_s12_closebtn']") WebElement fbthankyouclosetbtn;
	
	//Twitter follow action
	@FindBy(xpath="//input[@id='sa-s15-tf-button']") WebElement twiconnectbtn;
	@FindBy(xpath="//a[@class='sa_s15_twitter_custombtn']") WebElement twitterconnecttwloginbtn;
	@FindBy(xpath="//input[@id='username_or_email']") WebElement tweetEmail;
	@FindBy(xpath="//input[@id='password']") WebElement tweetpass;
	@FindBy(xpath="//input[@id='allow']") WebElement tweetloginbtn;
	@FindBy(xpath="//input[@id='sa_s15_tw_confirm_email']") WebElement tweetintermediateemail;
	@FindBy(xpath="//input[@id='sa_s15_tw_cont_button']") WebElement tweetintersubmitbtn;
	@FindBy(xpath="//div[@id='sa_s15_close_link']") WebElement tweetinterclosebtn;
	
   // Instagram follow
	@FindBy(xpath="//div[@id='sa_s22_unit_follow_btn']") WebElement instconnectbtn;
	@FindBy(xpath="//a[@id='sa_s22_insta_follow_login_btn']") WebElement instconnectloginbtn;
	@FindBy(xpath="//input[@id='id_username']") WebElement InstEmail;
	@FindBy(xpath="//input[@id='id_password']") WebElement instpass;
	@FindBy(xpath="//input[@class='button-green']") WebElement instloginbtn;
	
	@FindBy(xpath="//input[@id='sa_insta_follow_email']") WebElement instintermediateemail;
	@FindBy(xpath="//a[@id='sa_insta_follow_submit_btn']") WebElement instintersubmitbtn;
	@FindBy(xpath="//a[@id='sa_s22_instagram_follow_close_btn']") WebElement instinterclosebtn;
	
	
	
	
	public LoyaltyProgram(WebDriver driver)
	{
		this.driver=driver;
	}
	

	public void fbconnectaction(String fbemail, String fbpwd)
	{
		System.out.println("Started fbconnectaction...............");
		try 
		{
			Thread.sleep(10000);
			fbconnectbtn.click();
			
			Thread.sleep(20000);
			fbconnectfbloginbtn.click();
			
			String parentwindow=driver.getWindowHandle();
			Set<String> winHandles=driver.getWindowHandles();
			for(String winHandl : winHandles)
			{
				
				driver.switchTo().window(winHandl);
				
			}
			
			Thread.sleep(5000);
			fbemailaddr.sendKeys(fbemail);
			fbpasswd.sendKeys(fbpwd);
			fbloginbtn.click();
			System.out.println("FB loggedin successful..................");
			
			Thread.sleep(5000);
			driver.switchTo().window(parentwindow);
			Thread.sleep(5000);
			
			
			fbintermediateemailaddr.sendKeys("testest@gmail.com");
			fbintermediateesubmitbtn.click();
			
			Thread.sleep(5000);
			Library.takescreensnap(driver, "FBconnectThankYoupopup");
			fbthankyouclosetbtn.click();
			
			
			
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void tweetconnectaction(String twemail, String twpwd)
	{
		System.out.println("Started Twitterconnectaction...............");
		try 
		{
			Thread.sleep(10000);
			twiconnectbtn.click();
			
			Thread.sleep(20000);
			twitterconnecttwloginbtn.click();
			
			String parentwindow=driver.getWindowHandle();
			Set<String> winHandles=driver.getWindowHandles();
			for(String winHandl : winHandles)
			{
				driver.switchTo().window(winHandl);
			}
			
			Thread.sleep(5000);
			tweetEmail.sendKeys(twemail);
			tweetpass.sendKeys(twpwd);
			tweetloginbtn.click();
			System.out.println("Twitter loggedin successful..................");
			
			Thread.sleep(5000);
			driver.switchTo().window(parentwindow);
			Thread.sleep(5000);
						
			tweetintermediateemail.sendKeys("tdestest@gmail.com");
			tweetintersubmitbtn.click();
			
			Thread.sleep(5000);
			Library.takescreensnap(driver, "TwitterconnectThankYoupopup");
			tweetinterclosebtn.click();
			
			
			
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void instconnectaction(String instemail, String instpwd)
	{
		System.out.println("Started Instagramconnectaction...............");
		try 
		{
			Thread.sleep(10000);
			instconnectbtn.click();
			
			Thread.sleep(20000);
			driver.switchTo().frame("sa_s22_instagram_follow_iframe");
			instconnectloginbtn.click();
			
			String parentwindow=driver.getWindowHandle();
			Set<String> winHandles=driver.getWindowHandles();
			for(String winHandl : winHandles)
			{
				driver.switchTo().window(winHandl);
			}
			
			Thread.sleep(5000);
			InstEmail.sendKeys(instemail);
			instpass.sendKeys(instpwd);
			instloginbtn.click();
			System.out.println("Instagram loggedin successful..................");
			
			Thread.sleep(65000);
			driver.switchTo().window(parentwindow);
			Thread.sleep(5000);
						
			instintermediateemail.sendKeys("tdestest@gmail.com");
			instintersubmitbtn.click();
			
			Thread.sleep(5000);
			Library.takescreensnap(driver, "InstagramconnectThankYoupopup");
			instinterclosebtn.click();
			
			
			
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	
}
