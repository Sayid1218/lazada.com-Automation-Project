package AutomationLazada.pages;

import java.io.IOException;
import java.util.List;

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
import junit.framework.Assert;

public class CareersPage extends CommonMethod {
	ExtentTest test;
	 public CareersPage(	ExtentTest test) {
		 PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		 this.test = test;
	 }
	 String title = PageDriver.getCurrentDriver().getTitle();
	 
//	 Search Button:
	 @FindBys({
			@FindBy(xpath="//button[contains(text(),'Search')]"),
			
		})
		
	 WebElement SearchButton;
	 
//	 Keyword Input Field:
	 @FindBys({
		 @FindBy(xpath="//input[@id='idJobKeyword']"),
		 
	 })
	 
	 WebElement KeywordInput;
	 
	// Select Department:
	 @FindBys({
		 @FindBy(xpath="//div[contains(text(),'Select Department')]"),
		 
	 })
	 
	 WebElement SelectDepartment;

	 
	// Select Department Element Commercial:
	 @FindBys({
		 @FindBy(xpath="//span[contains(text(),'Commercial')]"),
		 
	 })
	 
	 WebElement SelectCommercial;
	 // Select Department Element All:
	 @FindBys({
		 @FindBy(xpath="//ul[@class='dropdown-menu inner show']"),

		 
	 })
	 
	 List<WebElement> SelectAllDepartment;
	 
	// Select Country:
	 @FindBys({
		 @FindBy(xpath="//div[contains(text(),'Select Country')]"),
		 
	 })
	 
	 WebElement SelectCountry;
	 
	 // Select Country Element Malaysia:
	 @FindBys({
		 @FindBy(xpath="//span[contains(text(),'Malaysia')]"),
		 
	 })
	 
	 WebElement SelectMalaysia;
	 
	 
	 
	 //Pagination Up buttons :
	 @FindBys({
		 @FindBy(xpath="//a[@id='updateJobPage10']"),
		 
	 })
	 
	 WebElement TenButton;
	 @FindBys({
		 @FindBy(xpath="//a[@id='updateJobPage25']"),
		 
	 })
	 
	 WebElement TwentyfiveButton;
	 @FindBys({
		 @FindBy(xpath="//a[@id='updateJobPage50']"),
		 
	 })
	 
	 WebElement FiftyButton;
	
	 @FindBys({
		 @FindBy(xpath="//a[@id='updateJobPage500']"),
		 
	 })
	 
	 WebElement AllButton;
	 
//Pagination Button	:
	 @FindBys({
		 @FindBy(xpath="//a[@id='idNext']"),
		 
	 })
	 
	 WebElement NextButton;
	
//Job	:
	 @FindBys({
		 @FindBy(xpath="//div[@class='job-box job-semi-bold pr-4 pr-md-0'][6]"),
		 
	 })
	 
	 WebElement Job;
	 
	 
//	 Test Case 5:
	 public void CheckTitle() throws IOException {
		 System.out.println("Checking Page Title");
		
		 try {
			 if(title=="Careers") {
				 System.out.println("This is Careers Page");
				 timeout();
				
			 }
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>This page is not Career Page</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Title");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "Title.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				
				Assert.assertTrue(title=="Careers");
				
				PageDriver.getCurrentDriver().quit();
		 }
	 }

//	 Test Case 6:
	 public void SearchOparetion1() throws IOException {
		 System.out.println("Search Oparetion with Keyword ");
		 try {
			 if(KeywordInput.isEnabled()) {
				 KeywordInput.sendKeys("It");
				 timeout();
				 SearchButton.click();
				 timeout(2000);
				 System.out.println("Keyword input is ok");
				 
			 }
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Keyword Input is not ok </b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "KeywordInput");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "KeywordInput.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				
				Assert.assertTrue(KeywordInput.isEnabled());
				
				PageDriver.getCurrentDriver().quit();
		 }
	 }
	 
//	 Test Case 7:
	 public void SearchOparetion2() throws IOException {
		 System.out.println("Search Oparetion with Keyword & Department");
		 try {
			 if(SelectDepartment.isEnabled()) {
				 SelectDepartment.click();
				 timeout(); 
				 SelectCommercial.click();
				 timeout();
				 SearchButton.click();
				 timeout(2000);
				 System.out.println("Departmant selection is ok");
				 
			 }
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Select Department is not ok</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "SelectDepartment");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "SelectDepartment.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				
				Assert.assertTrue(SelectDepartment.isEnabled());
				
				PageDriver.getCurrentDriver().quit();
		 }
	 }
	 
//	 Test Case 8:
	 public void SearchOparetion3() throws IOException {
		 System.out.println("Search Oparetion with Keyword,Department and Country");
		 try {
			 if(SelectCountry.isEnabled()) {
				 SelectCountry.click();
				 timeout(); 
				 SelectMalaysia.click();
				 timeout();
				 SearchButton.click();
				 timeout(2000);
				 System.out.println("Country selection is ok");
			 }
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>SelectCountry is not ok</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "SelectCountry");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "SelectCountry.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				
				Assert.assertTrue(SelectCountry.isEnabled());
				
				PageDriver.getCurrentDriver().quit();
		 }
	 }
	 
//	 Test Case 9:
	 public void SearchOparetion4() throws InterruptedException, IOException {
		
		 System.out.println("Search Oparetion with Department and Country");
		try {
			if(KeywordInput.isEnabled()) {
				KeywordInput.clear();
				timeout(2000);
				SearchButton.click();
				timeout(10000);
			
				
			}
			
		}
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>KeywordInput is not ok</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "KeywordInput");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "KeywordInput.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				
				Assert.assertTrue(KeywordInput.isEnabled());
				
				PageDriver.getCurrentDriver().quit();
		 }
		 
	 }
	 
//	 Test Case 10:
	 public void PaginationUperButtons() throws InterruptedException, IOException {
		 
		 System.out.println("Pagination Uper Buttons Checking");
		 try {
			 if(TenButton.isEnabled()) {
				
				 TenButton.click();
				 timeout();
				 
			 }
			 
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Ten Button is not ok</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "TenButton");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "TenButton.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				
				Assert.assertTrue(TenButton.isEnabled());
				
				PageDriver.getCurrentDriver().quit();
		 }
		 try {
			 if(TwentyfiveButton.isEnabled()) {
				 
				 TwentyfiveButton.click();
				 timeout();
				 
			 }
			 
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Twentyfive Button is not ok</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "TwentyfiveButton");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "TwentyfiveButton.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				
				Assert.assertTrue(TwentyfiveButton.isEnabled());
				
				PageDriver.getCurrentDriver().quit();
		 }
		 try {
			 if(FiftyButton.isEnabled()) {
				 
				 FiftyButton.click();
				 timeout();
				 
			 }
			 
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Fifty Button is not ok</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "FiftyButton");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "FiftyButton.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				
				Assert.assertTrue(FiftyButton.isEnabled());
				
				PageDriver.getCurrentDriver().quit();
		 }
		 try {
			 if(AllButton.isEnabled()) {
				 
				 AllButton.click();
				 timeout();
				 
			 }
			 
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>All Button is not ok</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "AllButton");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "AllButton.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				
				Assert.assertTrue(AllButton.isEnabled());
				
				PageDriver.getCurrentDriver().quit();
				}
		 
	 }
	 
//	 Test Case 11:
	 public void PaginationButtonDawn() throws IOException {
		 Actions action = new Actions(PageDriver.getCurrentDriver());
		 try {
			 if(NextButton.isEnabled()) {
				 action.moveToElement(NextButton).perform();
				 timeout();
				 NextButton.click();
				 timeout();
				 
			 }
			 
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>NextButton is not displayed</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "NextButton");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "NextButton.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				
				Assert.assertTrue(NextButton.isEnabled());
				
				PageDriver.getCurrentDriver().quit();
		 }
	 }
//	 Test Case 12:
	 public void JobDetails() throws IOException {
		 Actions action = new Actions(PageDriver.getCurrentDriver());
		 try {
			 if(Job.isDisplayed()) {
				 action.moveToElement(Job).perform();
				 timeout();
				 Job.click();
				 timeout();
				 
			 }
			 
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Job is not displayed</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Job");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "Job.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				
				Assert.assertTrue(Job.isDisplayed());
				
				PageDriver.getCurrentDriver().quit();
		 }
	 }
}
