package com.qa.hyr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practicise {

	WebDriver driver;
	@Test(priority=0)
	public void TestGoogle() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https:/www.hyrtutorials.com");
		String title = driver.getTitle();
		System.out.println("title: "+ title);
		driver.quit();		
	}
	@Test(priority=1)
	public void Facebook() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https:www.facebook.com");
		String title = driver.getTitle();
		System.out.println("title: "+ title);
		driver.quit();
		
	}
	@Test(priority=2)
	public void linkedin() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://in.linkedin.com/");
		String title = driver.getTitle();
		System.out.println("title: "+ title);
		driver.quit();
	}
	
 

	
		
	
}	
