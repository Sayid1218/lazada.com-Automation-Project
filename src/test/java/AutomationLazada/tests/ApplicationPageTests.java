package AutomationLazada.tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import AutomationLazada.pages.ApplicationPage;
import AutomationLazada.utilities.ExtentFactory;



public class ApplicationPageTests {
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	@BeforeClass

	 public void ApplicationPageTest() {
		  report = ExtentFactory.getInstance();
		  parentTest = report.createTest("<p style=\"color:#FF6000; font-size:20px\"><b>Application Page</b></p>").assignAuthor("QA TEAM").assignDevice("Windows");
	}
	@Test(priority = -1)
	public void FirstNameFieldCheck() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:20px\"><b>FirstName field Check Test</b></p>");
		ApplicationPage ApplicationPage = new ApplicationPage(childTest);
		ApplicationPage.FirstNameFieldCheck();
	}
	@Test(priority = 0)
	public void LastNameFieldCheck() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:20px\"><b>LastName field Check Test</b></p>");
		ApplicationPage ApplicationPage = new ApplicationPage(childTest);
		ApplicationPage.LastNameFieldCheck();;
	}
	@Test(priority = 1)
	public void EmailFieldCheck() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:20px\"><b>Email field Check Test</b></p>");
		ApplicationPage ApplicationPage = new ApplicationPage(childTest);
		ApplicationPage.EmailFieldCheck();;
	}
	@Test(priority = 2)
	public void MoblieNumberFieldCheck() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:20px\"><b>MoblieNumber field Check Test</b></p>");
		ApplicationPage ApplicationPage = new ApplicationPage(childTest);
		ApplicationPage.MoblieNumberFieldCheck();;
	}
	@Test(priority = 3)
	public void CountryFiledCheck() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:20px\"><b>Country field Check Test</b></p>");
		ApplicationPage ApplicationPage = new ApplicationPage(childTest);
		ApplicationPage.CountryFiledCheck();;
	}
	@Test(priority = 4)
	public void StateFieldCheck() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:20px\"><b>State field Check Test</b></p>");
		ApplicationPage ApplicationPage = new ApplicationPage(childTest);
		ApplicationPage.StateFieldCheck();;
	}
	@Test(priority = 5)
	public void EducationFiled() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:20px\"><b>Education field Check Test</b></p>");
		ApplicationPage ApplicationPage = new ApplicationPage(childTest);
		ApplicationPage.EducationFiled();;
	}
	@Test(priority = 6)
	public void LinkedinField() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:20px\"><b>Linkedin field Check Test</b></p>");
		ApplicationPage ApplicationPage = new ApplicationPage(childTest);
		ApplicationPage.LinkedinField();;
	}
	@Test(priority = 7)
	public void ApplyReason() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:20px\"><b>ApplyReason field Check Test</b></p>");
		ApplicationPage ApplicationPage = new ApplicationPage(childTest);
		ApplicationPage.ApplyReason();;
	}
	@AfterClass
	public void afterClass() {
		report.flush();
	}
	
}
