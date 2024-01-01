package com.qa.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Extent_Report {
	 public WebDriver driver;
	 
	 public ExtentHtmlReporter htmlReporter;
	 public ExtentReports extent;
	 public ExtentTest test;
	 @BeforeTest
	 public void setExtent() {
		 htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/MyReport.html");
		 
		 htmlReporter.config().setDocumentTitle("Automation Report");	 //Title of the report 
		 
		 htmlReporter.config().setReportName("Functional Report");	 //name of the report
		 
		 htmlReporter.config().setTheme(Theme.DARK);
		 
		 extent = new ExtentReports();
		 extent.attachReporter(htmlReporter);
		 
		 
		 extent.setSystemInfo("Hostname","LocalHost");
		 extent.setSystemInfo("os","window");
		 extent.setSystemInfo("Tester name","shiva");
		 extent.setSystemInfo("Browser","chrome");
		 
		 
		 
	 }
	 @AfterTest
	 public void endReport() {
		 extent.flush();
	 }
	 
	 @BeforeMethod
	 public void setup() {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://demo.nopcommerce.com/");
	 }
	 
	@Test
	 public void nocommerceTitleTest() {
		
		test = extent.createTest("nocommerceTitleTest");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "nopCommerce demo store");
		 
	 }
	@Test
	public void noCommerceLogoTest() {
		test = extent.createTest("noCommerceLogoTest");
	boolean status =	driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img")).isDisplayed();
		Assert.assertTrue(status);
	}
	 
	 public void noCommerceLoginTest() {
		 test = extent.createTest("noCommerceLoginTest");
		 Assert.assertTrue(true);
	 }
	 
	 public void tearDown() {
		 
	 }
}
