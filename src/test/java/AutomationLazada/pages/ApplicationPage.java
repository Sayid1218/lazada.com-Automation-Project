package AutomationLazada.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import AutomationLazada.drivers.PageDriver;
import AutomationLazada.utilities.CommonMethod;
import AutomationLazada.utilities.GetScreenShot;
import junit.framework.Assert;

public class ApplicationPage extends CommonMethod {
	ExtentTest test;
	 public ApplicationPage(ExtentTest test) {
		 PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		 this.test = test;
	 }
	 
	 @FindBys({
			@FindBy(xpath="//input[@id='id_firstName']"),
			
		})
		
	 WebElement FirstName;
	 @FindBys({
		 @FindBy(xpath="//input[@id='id_familyName']"),
		 
	 })
	 
	 WebElement LastName;
	 @FindBys({
		 @FindBy(xpath="//input[@id='id_email']"),
		 
	 })
	 
	 WebElement Email;
	 
	 @FindBys({
		 @FindBy(xpath="//body/div[1]/div[4]/div[1]/div[2]/div[1]/form[1]/div[9]/div[1]/div[1]/div[1]/div[1]/button[1]"),
		 @FindBy(xpath="//button[@data-id='idCountryCode']"),
		 
	 })
	 
	 WebElement CountryCode;
	 
	 @FindBys({
		 @FindBy(xpath="//span[contains(text(),'Bangladesh (880)')]"),
		 
	 })
	 
	 WebElement SelectCountryCode;
	 @FindBys({
		 @FindBy(xpath="//input[@id='id_mobile']"),
		 
	 })
	 
	 WebElement Mobile;
	 
	 @FindBys({
		 @FindBy(xpath="//button[@class='btn dropdown-toggle bs-placeholder job-input rounded-0']"),
		 
	 })
	 
	 WebElement Country;
	 
	 @FindBys({
		 @FindBy(xpath="//span[contains(text(),'Bangladesh')]"),
		 @FindBy(xpath="//body/div[1]/div[4]/div[1]/div[2]/div[1]/form[1]/div[11]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[13]/a[1]"),
		 
		 
	 })
	 
	 WebElement SelcetCountry;
	 
	 @FindBys({
		 @FindBy(xpath="//button[@title='Select State']"),
		 
	 })
	 
	 WebElement State;
	 
	 @FindBys({
		 @FindBy(xpath="//span[contains(text(),'Dhaka')]"),
		 
	 })
	 
	 WebElement SelectState;
	 @FindBys({
		 @FindBy(xpath="//button[@data-id='idDegree']"),
		 
	 })
	 
	 WebElement Education;
	 @FindBys({
		 @FindBy(xpath="//span[contains(text(),'Bachelor')]"),
		 
	 })
	 
	 WebElement EducationDegree;
	 @FindBys({
		 @FindBy(xpath="//input[@id='id_linkedin']"),
		 
	 })
	 
	 WebElement Linkedin;
	 @FindBys({
		 @FindBy(xpath="//textarea[@id='id_apply_reason']"),
		 
	 })
	 
	 WebElement ApplyReason;
	 
	 
//	 Test Case 13:
	 public void FirstNameFieldCheck() throws IOException {
		 try {
			 if(FirstName.isEnabled()) {
				 System.out.println("Sanding Blank Charector on FirstName");
				 FirstName.sendKeys("");
				 timeout();
				 FirstName.clear();
			 }
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>FirstName field is not ok</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "FirstName");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "FirstName.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(FirstName.isEnabled());
				PageDriver.getCurrentDriver().quit();
			}
		 try {
			 if(FirstName.isEnabled()) {
				 System.out.println("Sanding newmaric value on FirstName");
				 FirstName.sendKeys("12333");
				 timeout();
				 FirstName.clear();
			 }
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>FirstName field is not ok</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "FirstName");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "FirstName.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(FirstName.isEnabled());
				PageDriver.getCurrentDriver().quit();
		 }
		 try {
			 if(FirstName.isEnabled()) {
				 System.out.println("Sanding Actual Charector on FirstName");
				 FirstName.sendKeys("Abdullah");
				 timeout();
				 
			 }
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>FirstName field is not ok</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "FirstName");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "FirstName.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(FirstName.isEnabled());
				PageDriver.getCurrentDriver().quit();
		 }
	 }
	 
//	 Test Case 14:
	 public void LastNameFieldCheck() throws IOException {
		 try {
			 if(LastName.isEnabled()) {
				 System.out.println("Sanding Blank Charector on LastName");
				 LastName.sendKeys("");
				 timeout();
				 LastName.clear();
			 }
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Last Name field is not ok</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "LastName");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "LastName.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(LastName.isEnabled());
				PageDriver.getCurrentDriver().quit();
			}
		 try {
			 if(LastName.isEnabled()) {
				 System.out.println("Sanding newmaric value on LastName");
				 LastName.sendKeys("1452722");
				 timeout();
				 LastName.clear();
			 }
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Last Name field is not ok</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "LastName");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "LastName.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(LastName.isEnabled());
				PageDriver.getCurrentDriver().quit();
		 }
		 try {
			 if(LastName.isEnabled()) {
				 System.out.println("Sanding Actual Charector on LastName");
				 LastName.sendKeys("Sayid");
				 timeout();
				 
			 }
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Last Name field is not ok</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "LastName");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "LastName.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(LastName.isEnabled());
				PageDriver.getCurrentDriver().quit();
				}
	 }

//	 Test Case 14:
	 public void EmailFieldCheck() throws IOException {
		 try {
			 if(Email.isEnabled()) {
				 System.out.println("Sanding Charector on Email");
				 Email.sendKeys("abdjrlc");
				 timeout();
				 Email.clear();
			 }
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Email field is not ok</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Email");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "Email.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(Email.isEnabled());
				PageDriver.getCurrentDriver().quit();
			}
		 try {
			 if(Email.isEnabled()) {
				 System.out.println("Sanding newmaric value on Email");
				 Email.sendKeys("244240");
				 timeout();
				 Email.clear();
			 }
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Email field is not ok</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Email");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "Email.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(Email.isEnabled());
				PageDriver.getCurrentDriver().quit();
		 }
		 try {
			 if(Email.isEnabled()) {
				 System.out.println("Sanding Actual Charector on Email");
				 Email.sendKeys("abdullahsayid1218@gmail.com");
				 timeout();
				 
			 }
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Email field is not ok</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Email");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "Email.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(Email.isEnabled());
				PageDriver.getCurrentDriver().quit();
		 }
	 }
	 
//	 Test Case 15:
	 public void MoblieNumberFieldCheck() throws IOException {
		 try {
			 if(CountryCode.isDisplayed()) {
				 CountryCode.click();
				 timeout();
				 SelectCountryCode.click();
				 timeout();
			 }
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Country Code field is not ok</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "CountryCode");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "CountryCode.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(CountryCode.isDisplayed());
				PageDriver.getCurrentDriver().quit();
		 }
		 
		 try {
			 if(Mobile.isEnabled()) {
				 Mobile.sendKeys("1580394350");
				 timeout();
			 }
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Country Code field is not ok</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "CountryCode");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "CountryCode.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(CountryCode.isDisplayed());
				PageDriver.getCurrentDriver().quit();
		 }
	 }
//	 Test Case 16:
	 public void CountryFiledCheck() throws IOException {
		 try {
			 if(Country.isEnabled()) {
				 Country.click();
				 timeout(2000);
			 }
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Country field is not ok</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Country");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "Country.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(Country.isEnabled());
				PageDriver.getCurrentDriver().quit();
		 }
		 try {
			 if(SelcetCountry.isDisplayed()) {
				 SelcetCountry.click();
				 timeout();
			 }
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Selcet Country field is not ok</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "SelcetCountry");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "SelcetCountry.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(SelcetCountry.isDisplayed());
				PageDriver.getCurrentDriver().quit();
		 }
	 }
	 
	 
//	 Test Case 17:
	 public void StateFieldCheck() throws IOException {
		 try {
			 if(State.isDisplayed()) {
				 State.click();
				 timeout(2000);
			 }
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>State field is not ok</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "State");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "State.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(State.isDisplayed());
				PageDriver.getCurrentDriver().quit();
		 
	 }
		 try {
			 if(SelectState.isDisplayed()) {
				 SelectState.click();
				 timeout(2000);
			 }
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Select State field is not ok</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "SelectState");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "SelectState.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(SelectState.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			 
		 }
		 
	 
	 }
	 
// Test Case 18:
	 public void EducationFiled() throws IOException {
		 try {
			 if(Education.isDisplayed()) {
				 Education.click();
				 timeout();
			 }
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Education field is not ok</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Education");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "Education.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(Education.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			 
		 }
		 try {
			 if(EducationDegree.isDisplayed()) {
				 EducationDegree.click();
				 timeout();
			 }
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Education Degree field is not ok</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "EducationDegree");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "EducationDegree.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(EducationDegree.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			 
		 }
	 }
//	 Test Case 19:
	 public void LinkedinField() throws IOException {
		 try {
			 if(Linkedin.isEnabled()) {
				 System.out.println("Sanding random Charector on Linkedin Filed");
				 Linkedin.clear();
				 timeout();
				 Linkedin.sendKeys("dhqguhguhfhujw55459455945");
				 timeout();
			 }
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Linkedin field is not ok</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Linkedin");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "Linkedin.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(Linkedin.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			 
		 }
		 try {
			 if(Linkedin.isEnabled()) {
				 System.out.println("Sanding url on Linkedin Filed");
				 Linkedin.clear();
				 timeout();
				 Linkedin.sendKeys("https://www.linkedin.com/in/abdullah-mohammod-sayid-boiah-b58594267/");
				 timeout();
			 }
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Linkedin field is not ok</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Linkedin");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "Linkedin.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(Linkedin.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			 
		 }
	 }
	 
// Test Case 20:
	 public void ApplyReason() throws IOException {
		 try {
			 if(ApplyReason.isEnabled()) {
				 System.out.println("Sanding random Charector on Apply Reason Filed");
				 ApplyReason.sendKeys("2454484848484874848545456");
				 timeout();
				 ApplyReason.clear();
				 
			 }
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>ApplyReason field is not ok</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ApplyReason");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ApplyReason.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(ApplyReason.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			 
		 }
		 try {
			 if(ApplyReason.isEnabled()) {
				 System.out.println("Sanding Paragraph on Linkedin Filed");
				 ApplyReason.sendKeys("vefkgvjifjgiobjgor564897878947847584375@@#@!#$#$");
				 timeout();
				 ApplyReason.clear();
				 
			 }
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>ApplyReason field is not ok</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ApplyReason");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ApplyReason.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(ApplyReason.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			 
		 }
		 try {
			 if(ApplyReason.isEnabled()) {
				 
				 ApplyReason.sendKeys("The Priority Service Team is responsible for engaging and supporting Lazada's top Sellers in growing their sales on the platform and tackling operational issues when");
				 timeout();
				 ApplyReason.clear();
				 
			 }
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>ApplyReason field is not ok</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ApplyReason");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ApplyReason.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(ApplyReason.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			 
		 }
	 }
	 
}
