package AutomationLazada.pages;

import junit.framework.Assert;

import java.io.IOException;
import java.util.List;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import AutomationLazada.drivers.PageDriver;
import AutomationLazada.utilities.CommonMethod;
import AutomationLazada.utilities.GetScreenShot;







public class LazadaHomePage extends CommonMethod {
	WebDriver driver = PageDriver.getCurrentDriver();

	ExtentTest test;
	 public LazadaHomePage(ExtentTest test) {
		 PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		 this.test = test;
	 }
	 
	 @FindBys({
			@FindBy(xpath="//body[1]/main[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/ul[2]/li[1]/a[1]"),
			
		})
		
	 WebElement NavManu;
	 
	 @FindBys({
		 @FindBy(xpath="//div[@class='row mt-3 ml-lg-3 aos-init aos-animate']//div//a"),
		 
	 })
	 
	 List<WebElement> CountryManu;
	 @FindBys({
		 @FindBy(xpath="/html[1]/body[1]/main[1]/div[3]"),
		 
	 })
	 
	 WebElement ScrolManu;
	 @FindBys({
		 @FindBy(xpath="//a[contains(text(),'Explore Jobs')]"),
		 
	 })
	 
	 WebElement ExplorJobsButton;

	 
	 
	
	 
	 
	 
//	 Test Case 1: 
	 public void loadingTest() throws InterruptedException,IOException {
		 System.out.println("Verifying Page Loading or not");
		 String title = PageDriver.getCurrentDriver().getTitle();
			try {
				if(title=="Home") {
					
					 System.out.println("Page Loading perfectly");
					 timeout(2000);
					
					}
					
				}
			
			catch(Exception e) {
				test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>This page is not HomePage</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "TitleCheck1");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "TitleCheck1.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(title=="Home");
				PageDriver.getCurrentDriver().quit();
			}
	 }

//	 Test Case 2: 
	 
	 public void NavManuTest() throws IOException {
		 System.out.println("Verifying a nav link in nav bar");
			try {
				
				if(NavManu.isEnabled()) {
					NavManu.click();
					timeout(4000);
				}
					
				  System.out.println("Clicked");
					
				}
			
			catch(Exception e) {
				test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Nav manu is not working</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "NavManu");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "NavManu.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(NavManu.isEnabled());
				PageDriver.getCurrentDriver().quit();
			}
	 }
	 
//	 Test Case 3: 
	 
	public void SuperChargeOutBusinessCountryManuTest() throws IOException {
		 System.out.println("Verifying Super Charge our business country manu");
	try {
		 String originalWindow = driver.getWindowHandle();
		JavascriptExecutor js = (JavascriptExecutor)PageDriver.getCurrentDriver();
		js.executeScript("arguments[0].scrollIntoView();",ScrolManu );
		timeout(2000);
				for(int i=0;i<CountryManu.size();i++) {
				if(CountryManu.get(i).isDisplayed()) {
					CountryManu.get(i).click();
					timeout(4000);
					System.out.println(CountryManu.get(i).getText()+"Clicked");
				
				}
					
				  System.out.println("All Clicked");
				 
				
				}
				 driver.switchTo().window(originalWindow); 
				 timeout(2000);
				}
			
			catch(Exception e) {
				test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Country manu is not wokring</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "NavManu");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "NavManu.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				for(int i=0;i<CountryManu.size();i++) {
				Assert.assertTrue(CountryManu.get(i).isDisplayed());
				}
				PageDriver.getCurrentDriver().quit();
			}
	 }
	
	
	
	//Test Case 4:
	
	public void ExplorJobsButton() throws InterruptedException, IOException {
		Actions action = new Actions(driver);
		action.moveToElement(ExplorJobsButton).perform();
		timeout();
		try{
			if(ExplorJobsButton.isDisplayed()) 
			{
			ExplorJobsButton.click();
			timeout(2000);
			}
		}
		catch(Exception e) {
			test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Explore Job Button is not wokring</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "NavManu");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "NavManu.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(ExplorJobsButton.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	 
}
