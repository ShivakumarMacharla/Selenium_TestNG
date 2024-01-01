package com.qa.hyr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test

public class Assertions{
	//public static void main(String args[]) {
	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/");
		String exp_Title = "H Y R Tutorials - H Y R Tutorials";
		String act_Title = driver.getTitle();
		System.out.println("Actual Title:"+act_Title);
		Assert.assertEquals(exp_Title, act_Title ,"title is not mstches");
		
		driver.quit();
	}
	
        

}
