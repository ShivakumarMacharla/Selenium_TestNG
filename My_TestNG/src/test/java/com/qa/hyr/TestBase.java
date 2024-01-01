package com.qa.hyr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
    WebDriver driver;
    @BeforeTest
	public void lanch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("beforeMethod..");

		}
    
    @Test
    public void base() {
    	driver.navigate().to("https:/www.hyrtutorials.com");
		String title = driver.getTitle();
		System.out.println("title: "+ title);
		System.out.println("test...");
	}
    
    
    @AfterTest
	public void  close() {
    	System.out.println("AfterMethod");
		driver.quit();
	}
}
