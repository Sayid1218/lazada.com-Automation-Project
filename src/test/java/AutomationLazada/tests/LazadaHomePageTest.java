package AutomationLazada.tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import AutomationLazada.drivers.BaseDriver;
import AutomationLazada.drivers.PageDriver;
import AutomationLazada.pages.LazadaHomePage;
import AutomationLazada.utilities.ExtentFactory;


public class LazadaHomePageTest extends BaseDriver{
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	@BeforeClass
	 public void openUrl() {
		  PageDriver.getCurrentDriver().manage().window().maximize(); 
		  PageDriver.getCurrentDriver().get(url);
		  report = ExtentFactory.getInstance();
		  parentTest = report.createTest("<p style=\"color:#FF6000; font-size:20px\"><b>Home Page</b></p>").assignAuthor("QA TEAM").assignDevice("Windows");
	}
	@Test(priority = -1)
	public void loadingTest() throws InterruptedException, IOException {
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:20px\"><b>Page Loading Test</b></p>");
		LazadaHomePage LazadaHomePage = new LazadaHomePage(childTest);
		LazadaHomePage.loadingTest();
	}
	@Test(priority = 1)
	public void NavManuTest() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:20px\"><b>Nav Manu Test</b></p>");
		LazadaHomePage LazadaHomePage = new LazadaHomePage(childTest);
		LazadaHomePage.NavManuTest();
	}
	@Test(priority = 1)
	public void SuperChargeOutBusinessCountryManuTest() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:20px\"><b>SuperChargeOutBusinessCountry Manu Test</b></p>");
		LazadaHomePage LazadaHomePage = new LazadaHomePage(childTest);
		LazadaHomePage.SuperChargeOutBusinessCountryManuTest();
	}
	@Test(priority = 2)
	public void ExplorJobsButton() throws InterruptedException, IOException {
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:20px\"><b>ExplorJobs Button Test</b></p>");
		LazadaHomePage LazadaHomePage = new LazadaHomePage(childTest);
		LazadaHomePage.ExplorJobsButton();
	}
	
	@AfterClass
	public void afterClass() {
		report.flush();
	}
}
