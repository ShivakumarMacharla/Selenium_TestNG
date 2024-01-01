package com.qa.OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion {
	
	//Assertion is an expression which will verify the actual test outcome with the expecte0d test outcome;
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.navigate().to("http://www.google.com");
	
}
}

