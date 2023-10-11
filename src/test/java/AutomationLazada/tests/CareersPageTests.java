package AutomationLazada.tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import AutomationLazada.pages.CareersPage;
import AutomationLazada.utilities.ExtentFactory;


public class CareersPageTests {
	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	@BeforeClass

	 public void CareersPageTest() {
		  report = ExtentFactory.getInstance();
		  parentTest = report.createTest("<p style=\"color:#FF6000; font-size:20px\"><b>Careers Page</b></p>").assignAuthor("QA TEAM").assignDevice("Windows");
	}

	@Test(priority = -1)
	public void CheckTitle() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:20px\"><b>Check Title</b></p>");
		CareersPage CareersPage = new CareersPage(childTest);
		CareersPage.CheckTitle();
	}
	
	@Test(priority = 1)
	public void SearchOparetion1() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:20px\"><b>SearchOparetion 1 Test</b></p>");
		CareersPage CareersPage = new CareersPage(childTest);
		CareersPage.SearchOparetion1();;
	}
	
	@Test(priority = 1)
	public void SearchOparetion2() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:20px\"><b>SearchOparetion 2 Test</b></p>");
		CareersPage CareersPage = new CareersPage(childTest);
		CareersPage.SearchOparetion2();;
	}
	@Test(priority = 1)
	public void SearchOparetion3() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:20px\"><b>SearchOparetion 3 Test</b></p>");
		CareersPage CareersPage = new CareersPage(childTest);
		CareersPage.SearchOparetion3();;
	}
	@Test(priority = 1)
	public void SearchOparetion4() throws InterruptedException, IOException {
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:20px\"><b>SearchOparetion 4 Test</b></p>");
		CareersPage CareersPage = new CareersPage(childTest);
		CareersPage.SearchOparetion4();;
	}
	@Test(priority = 2)
	public void PaginationUperButtons() throws InterruptedException, IOException {
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:20px\"><b>Pagination Uper Buttons Test</b></p>");
		CareersPage CareersPage = new CareersPage(childTest);
		CareersPage.PaginationUperButtons();;
	}
	@Test(priority = 2)
	public void PaginationButtonDawn() throws InterruptedException, IOException {
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:20px\"><b>Pagination Dawn Buttons Test</b></p>");
		CareersPage CareersPage = new CareersPage(childTest);
		CareersPage.PaginationButtonDawn();;
	}
	@Test(priority = 3)
	public void JobDetails() throws InterruptedException, IOException {
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:20px\"><b>JobDetails Test</b></p>");
		CareersPage CareersPage = new CareersPage(childTest);
		CareersPage.JobDetails();;
	}
	@AfterClass
	public void afterClass() {
		report.flush();
	}
}
