 package com.qa.hyr;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First_Test {
	/* HARD ASSERTION :--> hard assertion is an expression which throws
	 *                      the exception immediately upon failure of assertion.
	 * 
	 * SOFT ASSERTION:-->  soft assertion is an expression which throws the execption after 
	 * 						completion of execution is known as soft assertion.
	 * 
	 */
	WebDriver driver;
	@Test(priority = 0   )
	public void Google() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("HYR Tutorials",Keys.ENTER);
		Thread.sleep(2000);
		String Act_title = "HYR Tutorials - Google Search";
		String title = driver.getTitle();
		System.out.println(title);
		
		//hard assertion 
		Assert.assertEquals(Act_title, title);
		screenshot sc = new screenshot() ;
		sc.Screenshot(driver);
		driver.close();
	}
	
	class screenshot{
		public void Screenshot(WebDriver driver) throws Exception {
			File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot, new File(".//Screenshots//img1.png"));
			
		}
	}

}
